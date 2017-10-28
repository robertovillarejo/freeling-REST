package io.github.robertovillarejo.freelingrest.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.freeling.ListString;
import edu.upc.freeling.SemanticDB;
import io.github.robertovillarejo.freelingrest.dto.SenseDTO;
import io.github.robertovillarejo.freelingrest.dto.WordDTO;
import io.github.robertovillarejo.freelingrest.service.SemanticDBAnalyzer;

@Service
public class SemanticDBAnalyzerImpl implements SemanticDBAnalyzer {
	
	@Autowired
	private SemanticDB semDB;
	
	@Override
	public void analyze(List<List<WordDTO>> listSentence) {
		Iterator<List<WordDTO>> it = listSentence.iterator();
		while(it.hasNext()) {
			List<WordDTO> sentence = it.next();
			Iterator<WordDTO> itW = sentence.iterator();
			while(itW.hasNext()) {
				WordDTO w = itW.next();
				annotateSenses(w.getSenses());
				generateSetSenseLemmas(w);
			}
		}
	}
	
	public void annotateSenses(List<SenseDTO> senses) {
		Iterator<SenseDTO> it = senses.iterator();
		while(it.hasNext()) {
			SenseDTO sense = it.next();
			sense.setLemmas(getLemmas(sense.getSense()));
		}
	}
	
	public List<String> getLemmas(String sense) {
		List<String> words = new ArrayList<>();
		ListString results = semDB.getSenseWords(sense);
		while(!results.empty()) {
			words.add(results.front());
			results.popFront();
		}
		return words;
	}
	
	public void generateSetSenseLemmas(WordDTO w) {
		List<SenseDTO> senses = w.getSenses();
		if (senses.isEmpty()) return;
		Set<String> senseLemmas = new HashSet<>();		
		Iterator<SenseDTO> it = senses.listIterator();
		while (it.hasNext()) {
			SenseDTO sense = it.next();
			senseLemmas.addAll(sense.getLemmas());
		}
		w.setSenseLemmas(senseLemmas);
	}

}

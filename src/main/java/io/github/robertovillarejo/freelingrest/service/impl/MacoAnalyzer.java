package io.github.robertovillarejo.freelingrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.upc.freeling.HmmTagger;
import edu.upc.freeling.ListSentence;
import edu.upc.freeling.Maco;
import io.github.robertovillarejo.freelingrest.service.Analyzer;

@Service("analyzer")
public class MacoAnalyzer implements Analyzer{
	
	@Autowired
	private Maco maco;
	
	@Autowired
	private HmmTagger tg;

	@Override
	public void analyze(ListSentence ls) {
		maco.analyze(ls);
		tg.analyze(ls);
	}

}

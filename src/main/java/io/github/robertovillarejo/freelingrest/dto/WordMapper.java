package io.github.robertovillarejo.freelingrest.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.upc.freeling.ListPairStringDouble;
import edu.upc.freeling.PairStringDouble;
import edu.upc.freeling.Word;

public class WordMapper {
	
	public static WordDTO toDTO(Word w) {
		WordDTO dto = new WordDTO();
		dto.setForm(w.getForm());
		dto.setLemma(w.getLemma());
		dto.setSensesString(w.getSensesString());
		List<SenseDTO> senses = sensesToDTO(w.getSenses());
		dto.setSenses(senses);
		dto.setSenseLemmas(getSenseLemmas(w.getSenses()));
		return dto;
	}
	
	public static List<SenseDTO> sensesToDTO(ListPairStringDouble senses) {
		List<SenseDTO> results = new ArrayList<>();
		while (!senses.empty()) {
			SenseDTO sense = new SenseDTO();
			PairStringDouble pairStringDouble = senses.front();
			sense.setSense(pairStringDouble.getFirst());
			sense.setProbability(pairStringDouble.getSecond());
			senses.popFront();
			results.add(sense);
		}
		return results;
	}
	
	public static Set<String> getSenseLemmas(ListPairStringDouble senses) {
		if (senses.empty()) return Collections.emptySet();
		Set<String> lemmas = new HashSet<>();
		while (!senses.empty()) {
			lemmas.add(senses.front().getFirst());
			senses.popFront();
		}
		return lemmas;
	}

}

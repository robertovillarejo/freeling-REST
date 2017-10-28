package io.github.robertovillarejo.freelingrest.service;

import java.util.List;

import io.github.robertovillarejo.freelingrest.dto.WordDTO;


public interface SemanticDBAnalyzer {
	
	public void analyze(List<List<WordDTO>> listSentence);

}

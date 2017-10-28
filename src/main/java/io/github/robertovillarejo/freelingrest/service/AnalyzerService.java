package io.github.robertovillarejo.freelingrest.service;

import java.util.List;

import io.github.robertovillarejo.freelingrest.dto.WordDTO;

public interface AnalyzerService {

	public List<List<WordDTO>> analyze(String text);
	
}

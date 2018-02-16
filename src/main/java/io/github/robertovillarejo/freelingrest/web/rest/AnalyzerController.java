package io.github.robertovillarejo.freelingrest.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.robertovillarejo.freelingrest.dto.WordDTO;
import io.github.robertovillarejo.freelingrest.service.AnalyzerService;

@RestController
@RequestMapping("/api")
public class AnalyzerController {
	
	private static final Logger LOGGER =  LoggerFactory.getLogger(AnalyzerController.class);
	
	private AnalyzerService analyzer;
		
	public AnalyzerController(AnalyzerService analyzer) {
		this.analyzer = analyzer;
	}
	
	@GetMapping("/analyze")
	public List<List<WordDTO>> analyze(@RequestParam String text) {
		LOGGER.debug("REST request to analyze text: {}", text);
		return analyzer.analyze(text);
	}

}

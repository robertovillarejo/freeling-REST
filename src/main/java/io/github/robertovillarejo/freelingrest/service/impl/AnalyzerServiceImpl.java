package io.github.robertovillarejo.freelingrest.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import edu.upc.freeling.ListSentence;
import edu.upc.freeling.ListWord;
import edu.upc.freeling.Senses;
import edu.upc.freeling.Splitter;
import edu.upc.freeling.Tokenizer;
import io.github.robertovillarejo.freelingrest.dto.SentenceMapper;
import io.github.robertovillarejo.freelingrest.dto.WordDTO;
import io.github.robertovillarejo.freelingrest.service.Analyzer;
import io.github.robertovillarejo.freelingrest.service.AnalyzerService;
import io.github.robertovillarejo.freelingrest.service.SemanticDBAnalyzer;

@Service
public class AnalyzerServiceImpl implements AnalyzerService {
	
	private final Logger log = LoggerFactory.getLogger(AnalyzerServiceImpl.class);
	
	@Autowired
	@Qualifier("senses")
	private Senses senses;
	
	@Autowired
	@Qualifier("analyzer")
	private Analyzer analyzer;
	
	@Autowired
	private Tokenizer tk;
	
	@Autowired
	private Splitter sp;
	
	@Autowired
	private SemanticDBAnalyzer semDBAnalyzer;

	@Override
	public List<List<WordDTO>> analyze(String text) {
		log.debug("Request to analyze text: {}", text);
		ListWord lw = tk.tokenize(text);
		ListSentence ls = sp.split(lw);
		analyzer.analyze(ls);
		senses.analyze(ls);
		List<List<WordDTO>> lsDTO = SentenceMapper.toListSentenceDTO(ls);
		semDBAnalyzer.analyze(lsDTO);
		return lsDTO;
	}
	
	

}

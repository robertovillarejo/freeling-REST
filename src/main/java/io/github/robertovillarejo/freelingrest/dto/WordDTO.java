package io.github.robertovillarejo.freelingrest.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class WordDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3526154691022961225L;
	
	private String form;
	
	private String lemma;
	
	private String sensesString;
	
	private List<SenseDTO> senses;
	
	private Set<String> senseLemmas;
	
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getLemma() {
		return lemma;
	}
	public void setLemma(String lemma) {
		this.lemma = lemma;
	}
	public String getSensesString() {
		return sensesString;
	}
	public void setSensesString(String sensesString) {
		this.sensesString = sensesString;
	}
	public List<SenseDTO> getSenses() {
		return senses;
	}
	public void setSenses(List<SenseDTO> senses) {
		this.senses = senses;
	}
	public Set<String> getSenseLemmas() {
		return senseLemmas;
	}
	public void setSenseLemmas(Set<String> senseLemmas) {
		this.senseLemmas = senseLemmas;
	}
	

}

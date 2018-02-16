package io.github.robertovillarejo.freelingrest.dto;

import java.io.Serializable;

import edu.upc.freeling.Analysis;
import edu.upc.freeling.ListAnalysis;
import edu.upc.freeling.ListPairStringDouble;
import edu.upc.freeling.ListWord;
import edu.upc.freeling.SWIGTYPE_p_freeling__regexp;
import edu.upc.freeling.SWIGTYPE_p_freeling__word__iterator;
import edu.upc.freeling.SWIGTYPE_p_std__listT_std__pairT_std__wstring_int_t_t;
import edu.upc.freeling.SWIGTYPE_p_std__listT_std__pairT_std__wstring_int_t_t__iterator;
import edu.upc.freeling.VectorString;
import edu.upc.freeling.Word;

public class WordDecorator extends Word implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Word w;

	@Override
	public synchronized void delete() {
		w.delete();
	}

	@Override
	public void setUser(VectorString value) {
		w.setUser(value);
	}

	@Override
	public VectorString getUser() {
		return w.getUser();
	}

	public WordDecorator() {
		w = new Word();
	}

	public WordDecorator(String arg0, ListWord arg1) {
		w = new Word(arg0, arg1);
	}

	public WordDecorator(String arg0, ListAnalysis arg1, ListWord arg2) {
		w = new Word(arg0, arg1, arg2);
	}

	public WordDecorator(Word arg0) {
		w = new Word(arg0);
	}

	public WordDecorator(String arg0) {
		w = new Word(arg0);
	}

	@Override
	public Word operator_assignment(Word arg0) {
		return w.operator_assignment(arg0);
	}

	@Override
	public void copyAnalysis(Word arg0) {
		this.w.copyAnalysis(arg0);
	}

	@Override
	public int getNSelected() {
		return w.getNSelected();
	}

	@Override
	public int getNUnselected() {
		return w.getNUnselected();
	}

	@Override
	public boolean isMultiword() {
		return w.isMultiword();
	}

	@Override
	public boolean isAmbiguousMw() {
		return w.isAmbiguousMw();
	}

	@Override
	public void setAmbiguousMw(boolean arg0) {
		w.setAmbiguousMw(arg0);
	}

	@Override
	public int getNWordsMw() {
		return w.getNWordsMw();
	}

	@Override
	public ListWord getWordsMw() {
		return w.getWordsMw();
	}

	@Override
	public String getForm() {
		return w.getForm();
	}

	@Override
	public String getLcForm() {
		return w.getLcForm();
	}

	@Override
	public String getPhForm() {
		return w.getPhForm();
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator selectedBegin(int k) {
		return w.selectedBegin(k);
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator selectedBegin() {
		return w.selectedBegin();
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator selectedEnd(int k) {
		return w.selectedEnd(k);
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator selectedEnd() {
		return w.selectedEnd();
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator unselectedBegin(int k) {
		return w.unselectedBegin(k);
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator unselectedBegin() {
		return unselectedBegin();
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator unselectedEnd(int k) {
		return w.unselectedEnd(k);
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator unselectedEnd() {
		return w.unselectedEnd();
	}

	@Override
	public long numKbest() {
		return w.numKbest();
	}

	@Override
	public String getLemma(int k) {
		return w.getLemma(k);
	}

	@Override
	public String getLemma() {
		return w.getLemma();
	}

	@Override
	public String getTag(int k) {
		return w.getTag(k);
	}

	@Override
	public String getTag() {
		return w.getTag();
	}

	@Override
	public ListPairStringDouble getSenses(int k) {
		return w.getSenses();
	}

	@Override
	public ListPairStringDouble getSenses() {
		return w.getSenses();
	}

	@Override
	public String getSensesString(int k) {
		return w.getSensesString(k);
	}

	@Override
	public String getSensesString() {
		return w.getSensesString();
	}

	@Override
	public void setSenses(ListPairStringDouble arg0, int k) {
		w.setSenses(arg0, k);
	}

	@Override
	public void setSenses(ListPairStringDouble arg0) {
		w.setSenses(arg0);
	}

	@Override
	public long getSpanStart() {
		return w.getSpanStart();
	}

	@Override
	public long getSpanFinish() {
		return w.getSpanFinish();
	}

	@Override
	public boolean foundInDict() {
		return w.foundInDict();
	}

	@Override
	public void setFoundInDict(boolean arg0) {
		w.setFoundInDict(arg0);
	}

	@Override
	public boolean hasRetokenizable() {
		return w.hasRetokenizable();
	}

	@Override
	public void lockAnalysis() {
		w.lockAnalysis();
	}

	@Override
	public boolean isLocked() {
		return w.isLocked();
	}

	@Override
	public void addAlternative(String arg0, int arg1) {
		w.addAlternative(arg0, arg1);
	}

	@Override
	public void setAlternatives(SWIGTYPE_p_std__listT_std__pairT_std__wstring_int_t_t arg0) {
		w.setAlternatives(arg0);
	}

	@Override
	public void clearAlternatives() {
		w.clearAlternatives();
	}

	@Override
	public boolean hasAlternatives() {
		return w.hasAlternatives();
	}

	@Override
	public SWIGTYPE_p_std__listT_std__pairT_std__wstring_int_t_t getAlternatives() {
		return w.getAlternatives();
	}

	@Override
	public SWIGTYPE_p_std__listT_std__pairT_std__wstring_int_t_t__iterator alternativesBegin() {
		return w.alternativesBegin();
	}

	@Override
	public SWIGTYPE_p_std__listT_std__pairT_std__wstring_int_t_t__iterator alternativesEnd() {
		return w.alternativesEnd();
	}

	@Override
	public void addAnalysis(Analysis arg0) {
		w.addAnalysis(arg0);
	}

	@Override
	public void setAnalysis(Analysis arg0) {
		w.setAnalysis(arg0);
	}

	@Override
	public void setAnalysis(ListAnalysis arg0) {
		w.setAnalysis(arg0);
	}

	@Override
	public void setForm(String arg0) {
		w.setForm(arg0);
	}

	@Override
	public void setPhForm(String arg0) {
		w.setPhForm(arg0);
	}

	@Override
	public void setSpan(long arg0, long arg1) {
		w.setSpan(arg0, arg1);
	}

	@Override
	public void setPosition(long arg0) {
		w.setPosition(arg0);
	}

	@Override
	public long getPosition() {
		return w.getPosition();
	}

	@Override
	public boolean findTagMatch(SWIGTYPE_p_freeling__regexp arg0) {
		return w.findTagMatch(arg0);
	}

	@Override
	public int getNAnalysis() {
		return w.getNAnalysis();
	}

	@Override
	public void unselectAllAnalysis(int k) {
		w.unselectAllAnalysis(k);
	}

	@Override
	public void unselectAllAnalysis() {
		w.unselectAllAnalysis();
	}

	@Override
	public void selectAllAnalysis(int k) {
		w.selectAllAnalysis(k);
	}

	@Override
	public void selectAllAnalysis() {
		w.selectAllAnalysis();
	}

	@Override
	public void selectAnalysis(SWIGTYPE_p_freeling__word__iterator arg0, int k) {
		w.selectAnalysis(arg0, k);
	}

	@Override
	public void selectAnalysis(SWIGTYPE_p_freeling__word__iterator arg0) {
		w.selectAnalysis(arg0);
	}

	@Override
	public void unselectAnalysis(SWIGTYPE_p_freeling__word__iterator arg0, int k) {
		w.unselectAnalysis(arg0, k);
	}

	@Override
	public void unselectAnalysis(SWIGTYPE_p_freeling__word__iterator arg0) {
		w.unselectAnalysis(arg0);
	}

	@Override
	public ListAnalysis getAnalysis() {
		return w.getAnalysis();
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator analysisBegin() {
		return w.analysisBegin();
	}

	@Override
	public SWIGTYPE_p_freeling__word__iterator analysisEnd() {
		return w.analysisEnd();
	}

}

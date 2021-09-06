package io.github.qndev.webmvc.model;

import java.io.Serializable;

public class RadioModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String radioButtonKey = null;
	
	private String radioButtonValue = null;

	public String getRadioButtonKey() {
		return radioButtonKey;
	}

	public void setRadioButtonKey(String radioButtonKey) {
		this.radioButtonKey = radioButtonKey;
	}

	public String getRadioButtonValue() {
		return radioButtonValue;
	}

	public void setRadioButtonValue(String radioButtonValue) {
		this.radioButtonValue = radioButtonValue;
	}

}

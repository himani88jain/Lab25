package co.grandcircus.Lab25;

import java.util.Arrays;

public class Data {

	
	private String [] temperature;
	private String[] text;

	public Data() {
		super();
	}

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	public String[] getTemperature() {
		return temperature;
	}

	public void setTemperature(String[] temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Data [temperature=" + Arrays.toString(temperature) + ", text=" + Arrays.toString(text) + "]";
	}

	
	
}

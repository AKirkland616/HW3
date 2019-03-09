package hw3;

import java.util.ArrayList;

public class HashEntry {

	private String key;
	private ArrayList<String> value = new ArrayList<String>();
	
	public HashEntry(String url, String[] description) {
		key = url;
		for(int i = 0;i<description.length;i++) {
			value.add(description[i]);
		}
	}
	
	public String getKey() {
		return key;
	}
	
	public ArrayList<String> getValue() {
		return value;
	}
	
	public boolean containsAll(ArrayList<String> val) {
		return value.containsAll(val);
	}
	
	public boolean containsValue(String val) {
		return value.contains(val);
	}
}

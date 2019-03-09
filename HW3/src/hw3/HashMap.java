package hw3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMap implements Map {
	
	private ArrayList<HashEntry> hashMap = new ArrayList<HashEntry>();
	private ArrayList<HashEntry> group = new ArrayList<HashEntry>();
	ArrayList<String> value = new ArrayList<String>();
	//private ArrayList<String> value;

	public HashMap(Scanner scan) {
		createHashMap(scan);
	}
	
	public void createHashMap(Scanner scan) {
		while (scan.hasNext()) {
			String url = scan.nextLine();
			String[] values = scan.nextLine().split(" ");
			hashMap.add(new HashEntry(url,values));
		}
	}
	
	public ArrayList<HashEntry> containsValue(String[] values ){
		group = hashMap;
		value.clear();
		for(int v = 0; v<values.length;v++) {
			value.add(values[v]);
		}
		for(int i = group.size()-1; i>-1;i--) {
			//System.out.println(group.get(i).getKey());
			//System.out.println(group.get(i).containsValue(value));
			if(!group.get(i).containsAll(value)) {
				group.remove(i);
			}
		}
		
		return group;
	}
	
	public ArrayList<HashEntry> containsEither(String[] values){
		group.clear();
		for(int i = 0; i<hashMap.size();i++) {
			if(hashMap.get(i).containsValue(values[0])) {
				group.add(hashMap.get(i));
			}else if(hashMap.get(i).containsValue(values[1])) {
				group.add(hashMap.get(i));
			}
		}
		
		return group;
	}

	/**
	 * Instructions says we must implement the map interface...dont know how
	 * 
	 * 
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return hashMap.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return hashMap.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

package myHashMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
	//shte go kachi
	private int capacity;
	private List<List<Entry>> buckets;

	public MyHashMap() {
		capacity = 16;
		buckets = new ArrayList<>(capacity);
	}

	private int hash(String key) {
		return key.hashCode() % capacity;
	}

	public void put(String key, Integer value) {
		if (key == null) {
			return;
		}

		int position = hash(key);
		List<Entry> bucket = buckets.get(position);
		if (bucket == null) {
			bucket = new LinkedList<>();
		}
		for (Entry entry : bucket) {
			if (key.equals(entry.getKey())) {
				entry.setValue(value);
				return;
			}
		}
		Entry newEntry = new Entry(key, value);
		bucket.add(newEntry);
	}
	
	public Integer get(String key){
		int position = hash(key);
		List<Entry> bucket = buckets.get(position);
		
		if (bucket == ) {
			
		}
		
		return null;
	}
}
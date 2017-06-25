package datastructure.hashtable;

import java.util.LinkedList;

/**
 * Created by makoto on 17/06/17.
 */
public class StringHashTable {

    private final static int INITIAL_CAPACITY = 10;
    private final int size;


    private LinkedList<Entry>[] bucket;

    public static class Entry{
        public String key;
        public String value;
    }
    public StringHashTable(int size) {
        this.bucket = new LinkedList[size];
        this.size = size;
    }

    public void add(String key, String value) {

        int hash = hash(key);

        if(bucket[hash] == null){
            bucket[hash] = new LinkedList<>();
        }


        Entry entry = new Entry();
        entry.key = key;
        entry.value = value;

        bucket[hash].add(entry);
    }

    private int hash(String key) {
        int sum = 0;
        for (int c : key.toCharArray()) {
            sum += c;
        }
        return sum % size;
    }

    public String get(String key) {
        int hash = hash(key);

        LinkedList<Entry> linkedList = bucket[hash];

        if(linkedList == null){
            return null;
        }

        for(Entry entry : linkedList){
            if (entry.key.equals(key)){
                return entry.value;
            }
        }

        return null;
    }

    public void remove(String key) {
        int hash = hash(key);

        LinkedList<Entry> linkedList = bucket[hash];

        for (int i = 0; i < linkedList.size(); i++) {
            if(linkedList.get(i).key.equals(key)){
                linkedList.remove(i);
            }
        }
    }

}


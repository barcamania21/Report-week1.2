package LRUCache;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new LinkedHashMap<>();
    }

    public int get(int key){
        Integer value=map.get(key);
        if(value==null){
            return -1;
        }
        else {
            this.set(key, value);
        }
        return value;
    }

    public void set(int key, int value){
        if(map.containsKey(key)){
            map.remove(key);
        } else if(map.size()==capacity){
            Iterator<Integer> iterator=map.keySet().iterator();
            iterator.next();
            iterator.remove();
        }
        map.put(key, value);
    }
}

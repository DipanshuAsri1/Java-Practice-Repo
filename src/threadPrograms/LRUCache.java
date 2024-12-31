package threadPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LRUCache<K, V> {

    private final int capacity;
    private final Map<K, V> cache;

    private final Lock lock = new ReentrantLock();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public V get(K key) {

        lock.lock();
        try {
            return cache.getOrDefault(key, null);
        } finally {
            lock.unlock();
        }
    }

    public void put(K key, V Value) {
        lock.lock();
        try {
            cache.put(key, Value);
        } finally {
            lock.unlock();
        }
    }

    public void displayCache(){
        lock.lock();
        try{
            System.out.println(cache);
        }finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {

        LRUCache<Integer, String> lruCache = new LRUCache<>(3);

        lruCache.put(1, "One");
        lruCache.put(2, "Two");
        lruCache.put(3, "Three");

        System.out.println("Initial cache:");
        lruCache.displayCache();  // Should print {1=One, 2=Two, 3=Three}

        // Access key 1
        System.out.println("Accessing key 1: " + lruCache.get(1));  // Should return "One"

        lruCache.put(4, "Four");  // This should remove the least recently used entry (key 2)

        System.out.println("Cache after inserting key 4:");
        lruCache.displayCache();  // Should print {3=Thre
    }
}

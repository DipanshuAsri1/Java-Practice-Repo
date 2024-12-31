package AsynchProgs;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrHmap {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        System.out.println(map.get("One"));  // 1
        /*
        Use ConcurrentHashMap when you need a thread-safe map in a multi-threaded environment, such as when implementing shared caches or counters.
        Use HashMap in single-threaded environments or when concurrency control is handled externally (e.g., through manual synchronization or locks).
         */

        /*
        In Java 8, ConcurrentHashMap combines the following techniques:

           CAS operations to reduce the need for locking.
           Bucket-level locking for put/remove operations.
           Use of TreeBin when the number of nodes in a bucket exceeds a threshold (similar to how HashMap uses red-black trees when there are too many collisions).

         */


    }
}

package DesignPattern.ObjectPool;

import java.util.ArrayList;
import java.util.List;

/**
 * The Object Pool design pattern is used to manage a pool of reusable objects. It's particularly useful in scenarios where creating and destroying objects is resource-intensive, and reusing existing objects can improve performance.
 * Here's a basic implementation of the Object Pool design pattern in Java
 */

// Define an interface for the objects to be pooled
interface PooledObject {
    void reset(); // Reset the object to its initial state
}

// Concrete implementation of the PooledObject interface
class MyObject implements PooledObject {
    private String data;

    public MyObject(String data) {
        this.data = data;
    }

    @Override
    public void reset() {
        // Reset the object's state
        data = null;
    }

    public String getData() {
        return data;
    }
}

// Object Pool class
class ObjectPool<T extends PooledObject> {
    private List<T> pool;
    private int maxSize;

    public ObjectPool(int maxSize) {
        this.maxSize = maxSize;
        this.pool = new ArrayList<>();
    }

    public synchronized T acquire() {
        if (pool.isEmpty()) {
            return createObject();
        } else {
            return pool.remove(0);
        }
    }

    public synchronized void release(T object) {
        if (pool.size() < maxSize) {
            object.reset(); // Reset the object before returning it to the pool
            pool.add(object);
        }
    }

    private T createObject() {
        // Create a new object and return it
        return (T) new MyObject("New Object");
    }
}

public class A {
    public static void main(String[] args) {
        ObjectPool<MyObject> objectPool = new ObjectPool<>(5);

        // Acquire objects from the pool
        MyObject obj1 = objectPool.acquire();
        MyObject obj2 = objectPool.acquire();

        System.out.println("Object 1 data: " + obj1.getData());
        System.out.println("Object 2 data: " + obj2.getData());

        // Release objects back to the pool
        objectPool.release(obj1);
        objectPool.release(obj2);
    }
}


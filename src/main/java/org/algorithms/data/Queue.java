package org.algorithms.data;

/**
 * Created by vital on 27/04/2017.
 */
public interface Queue<T> {
    void enqueue(T item);

    T dequeue();

    boolean isEmpty();

    int size();
}

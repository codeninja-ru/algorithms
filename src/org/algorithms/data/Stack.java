package org.algorithms.data;

/**
 * Created by vital on 26/04/2017.
 */
public interface Stack<T> {
    void push(T item);

    @SuppressWarnings("it's safe")
    T pop();

    boolean isEmpty();

    int size();
}

package org.algorithms.data;

/**
 * Created by vital on 26/04/2017.
 */
public class Stack<T> {
    final static int MAX = 1024;
    Object[] store;
    int N = 0;

    public Stack(int size) {
        store = new Object[size];
    }

    public Stack() {
        this(MAX);
    }

    public void push(T item) {
        store[N++] = item;
    }

    @SuppressWarnings("it's safe")
    public T pop() {
        T result = (T) store[--N];
        store[N] = null;

        return result;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
}

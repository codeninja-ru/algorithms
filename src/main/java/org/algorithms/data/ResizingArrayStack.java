package org.algorithms.data;

import java.util.Iterator;

/**
 * Created by vital on 26/04/2017.
 */
public class ResizingArrayStack<T> implements Stack<T> {
    final static int MAX = 255;
    private Object[] store;
    private int N = 0;

    private void resize(int newSize) {
        Object[] newStore = new Object[newSize];
        System.arraycopy(store, 0, newStore, 0, N);

        store = newStore;
    }

    public ResizingArrayStack(int size) {
        store = new Object[size];
    }

    public ResizingArrayStack() {
        this(MAX);
    }

    @Override
    public void push(T item) {
        if (store.length == N) {
            resize(store.length * 2);
        }
        store[N++] = item;
    }

    @Override
    @SuppressWarnings("it's safe")
    public T pop() {
        T result = (T) store[--N];
        store[N] = null;
        if (N > MAX && N == store.length / 4) {
            resize(store.length / 2);
        }

        return result;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int i = N;

            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                return (T) store[--i];
            }
        };
    }
}

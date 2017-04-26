package org.algorithms.data;

import java.util.Iterator;

/**
 * Created by vital on 26/04/2017.
 */
public class ArrayStack<T> implements Stack<T> {
    private Object[] store = new Object[1024];
    private int N = 0;

    @Override
    public void push(T item) {
        store[N++] = item;
    }

    @Override
    public T pop() {
        Object result = store[--N];
        store[N] = null;

        return (T) result;
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
            private int i = N;
            @Override
            public boolean hasNext() {
                return i == 0;
            }

            @Override
            public T next() {
                return (T) store[--i];
            }
        };
    }
}

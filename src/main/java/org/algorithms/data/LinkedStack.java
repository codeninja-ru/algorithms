package org.algorithms.data;

/**
 * Created by vital on 26/04/2017.
 */
public class LinkedStack<T> implements Stack<T> {
    private int N = 0;
    private Node last = null;
    private class Node {
        T item;
        Node prev = null;

        Node(T item, Node prev) {
            this.item = item;
            this.prev = prev;
        }
    }

    @Override
    public void push(T item) {
        if (last == null) {
            last = new Node(item, null);
        } else {
            last = new Node(item, last);
        }

        N++;
    }

    @Override
    public T pop() {
        T result = last.item;
        last = last.prev;
        N--;
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
}

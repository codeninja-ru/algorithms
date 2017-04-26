package org.algorithms.data;

/**
 * Created by vital on 26/04/2017.
 */
public class LinkedStack<T> implements Stack<T> {
    private int N = 0;
    private Node first = null;
    private class Node {
        T item;
        Node next = null;

        Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    @Override
    public void push(T item) {
        first = new Node(item, first);
        N++;
    }

    @Override
    public T pop() {
        T result = first.item;
        first = first.next;
        N--;
        return result;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return N;
    }
}

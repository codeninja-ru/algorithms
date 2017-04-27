package org.algorithms.data;

/**
 * Created by vital on 27/04/2017.
 */
public class LinkedQueue<T> implements Queue<T> {
    private Node first = null;
    private Node last = null;
    private int N = 0;

    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    @Override
    public void enqueue(T item) {
        if (last == null) {
            last = first = new Node(item, null);
        } else {
            last.next = new Node(item, null);
            last = last.next;
        }
        N++;
    }

    @Override
    public T dequeue() {
        T result = first.item;
        first = first.next;
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

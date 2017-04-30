package org.algorithms.data;

/**
 * Created by vital on 30/04/2017.
 */
public class ResizingArrayQueueOfStrings implements Queue<String> {
    private static final int MAX = 100;
    private String[] store = new String[MAX];
    private int firstN = 0;
    private int lastN = 0;

    @Override
    public void enqueue(String item) {
        if (lastN == store.length - 1) {
            if (firstN > 0) {
                compress();
            } else {
                resize(store.length * 2);
            }
        }
        store[lastN++] = item;
    }

    private void resize(int newSize) {
        String[] newStore = new String[newSize];
        System.arraycopy(store, firstN, newStore, firstN, firstN + lastN);
        store = newStore;
    }

    private void compress() {
        int j = 0;
        for (int i = firstN; i <= lastN; i++) {
            String item = store[i];
            store[j++] = item;
            store[i] = null;
        }

        lastN = lastN - firstN;
        firstN = 0;
    }

    @Override
    public String dequeue() {
        assert firstN != lastN;

        String result = store[firstN];
        store[firstN++] = null;

        if (store.length > MAX && store.length == size() / 4) {
            if (firstN > 0) {
                compress();
            }
            resize(store.length / 2);
        }

        return result;
    }

    @Override
    public boolean isEmpty() {
        return firstN == lastN;
    }

    @Override
    public int size() {
        return lastN - firstN;
    }
}

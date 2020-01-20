package dslab1.task2.adt;

import dslab1.task2.interfaces.MyArrayInterface;

public class MyArrayADT implements MyArrayInterface {
    private int size;
    private int[] data;
    // use this as index value for insert , delete , traverse
    private int elementCount;

    public MyArrayADT(int size) {
        this.size = size;
        data = new int[this.size];
        elementCount = 0;
    }

    @Override
    public void traverse() {

    }

    @Override
    public boolean insert(int element) {
        return false;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public boolean search(int element) {
        return false;
    }

    @Override
    public int[] sort() {
        return new int[0];
    }
}

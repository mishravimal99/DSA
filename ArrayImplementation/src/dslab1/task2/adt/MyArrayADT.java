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
        System.out.println("Printing the array");
        for (int i = 0; i < elementCount; i++) {
            System.out.print(data[i]);
            if (i != (elementCount - 1)) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    @Override
    public boolean insert(int element) {
        boolean response = false;
        if (!isFull()) {
            data[elementCount] = element;
            response = true;
        }
        return response;
    }

    private boolean isFull() {
        boolean response = false;
        if (elementCount == size) {
            response = true;
        }
        return response;
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

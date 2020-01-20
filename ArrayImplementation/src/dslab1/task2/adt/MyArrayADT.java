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
            elementCount++;
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
        int response = 0;
        if (!isEmpty()) {
            elementCount--;
            response = data[elementCount];
        }
        return response;
    }

    private boolean isEmpty() {
        boolean response = false;
        if (elementCount == 0) {
            response = true;
        }
        return response;
    }

    @Override
    public boolean search(int element) {
        boolean response = false;
        for (int i = 0; i < elementCount; i++) {
            if (data[i] == element) {
                response = true;
                break;
            }
        }
        return false;
    }

    @Override
    public int[] sort() {
        int[] response = data;
        for (int i = 0; i < elementCount - 1; i++) {
            for (int j = 0; j < elementCount - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }

        }
        return response;
    }
}

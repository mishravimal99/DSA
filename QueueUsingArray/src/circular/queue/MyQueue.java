package circular.queue;

public class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int sizeOfArray) {
        queue = new int[sizeOfArray];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    public boolean enqueue(int element) {
        boolean response = false;
        if (rear == queue.length - 1 && size != queue.length) {
            rear = -1;
        }
        if (rear != queue.length - 1) {
            rear++;
            queue[rear] = element;
            size++;
            response = true;

        }
        return response;
    }

    public int dequeue() {
        int response = 0;
        if (front == queue.length - 1 && size != queue.length) {
            front = -1;
        }
        if (!isEmpty()) {
            front++;
            response = queue[front];
            size--;

        }
        return response;
    }

    public int peek() {
        int response = 0;̥
        if (!isEmpty()) {
            response = queue[front + 1];
        }
        return response;
    }

    public int size() {
        return size;
    }

}

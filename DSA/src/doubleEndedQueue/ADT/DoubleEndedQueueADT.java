package doubleEndedQueue.ADT;

public interface DoubleEndedQueueADT {
    void enqueueRear(int item);

    void enqueueFront(int item);

    int dequeueRear();

    int dequeueFront();

}

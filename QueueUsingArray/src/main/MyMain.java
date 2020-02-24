package main;

import queue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue(10);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.enqueue(1234));
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
    }
}

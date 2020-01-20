package dslab1.task2.implementation;

import dslab1.task2.adt.MyArrayADT;

public class MyArrayImplementation {
    public static void main(String[] args) {
        MyArrayADT obj = new MyArrayADT(10);
        obj.insert(10);
        obj.traverse();
        obj.insert(20);
        obj.traverse();
        obj.insert(2);
        obj.traverse();
        obj.insert(33);
        obj.traverse();
        System.out.println("deleting..." + obj.delete());
        obj.sort();
        obj.traverse();
    }
}

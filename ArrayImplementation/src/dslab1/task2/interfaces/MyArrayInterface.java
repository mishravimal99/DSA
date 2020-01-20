package dslab1.task2.interfaces;

public interface MyArrayInterface {
    // a method to print
    public abstract void traverse();

    // a method to insert element into array
    boolean insert(int element);

    // a method to delete an element
    int delete();

    // a method to search an element
    boolean search(int element);

    // a method to sort the array
    int[] sort();
}

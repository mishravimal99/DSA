package sorting;

public class BubbleSorting {
    private int[] arr;

    private BubbleSorting(int[] arr) {
        this.arr = arr;
    }

    private static void bubblesort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void printarray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 1, 3, 7, 6};
        BubbleSorting obj = new BubbleSorting(array);
        bubblesort(array);
        printarray(array);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}

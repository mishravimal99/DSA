package sorting;

public class BubbleSorting {
    private int[] arr;

    public BubbleSorting(int[] arr) {
        this.arr = arr;
    }

    void bsort(int[] arr) {
        int temp = 0;
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

}

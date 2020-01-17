import java.util.ArrayList;
import java.util.Scanner;


public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            int size = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[size];
            ArrayList<Integer> arr1 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < k) {
                    arr1.add(arr[i]);
                }
            }
            ArrayList<Integer> arr2 = new ArrayList<>();
            for (Integer value : arr1) {
                String s = String.valueOf(value);
                int count = 0;
                for (int j = 0; j < s.length() - 1; j++) {
                    if ((Math.abs((int) s.charAt(j) - (int) s.charAt(j + 1))) == 1) {
                        count++;
                    }
                }
                if (count == (s.length() - 1) && count >= 1) {
                    arr2.add(value);
                }
            }
            for (Integer integer : arr2) {
                System.out.print(integer + " ");
            }
            testcase = testcase - 1;
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PLMU {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                if(sc.hasNextInt()) {
                    arr.add(sc.nextInt());
                }
            }
            int c=0;
            for (int i = 0; i <n-1 ; i++) {
                for (int j = i+1; j <n ; j++) {
                    if(arr.get(i) + arr.get(j)==(arr.get(i) * arr.get(j))){
                        c = c + 1;
                    }
                }
            }
            System.out.println(c);
            t=t-1;
        }
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        System.out.println("Number of words in a given string is :"+countWords(string));
        System.out.println(s);
        /*Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
    String s3=s1+" "+s2;
    System.out.println(s3);*/
    }
   private static int countWords(String string){
        String[] stringArray=string.split("\\s+");
        return stringArray.length;
    }
}
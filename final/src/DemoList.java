import java.util.ArrayList;
class DemoList implements DemoInterface {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Sum for all elements in a list is : "+ sum(list));
        System.out.println("All elements of list are :");
        display(list);
    }
    private static int sum(ArrayList<Integer> list){
        int sum1=0;
        for (int i = 0; i <list.size() ; i++) {
            sum1=sum1+list.get(i);
        }
        return sum1;
    }
    private static void display(ArrayList<Integer> list){
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

package BST.main;

import BST.tree.MyBST;

public class MyMain {
    public static void main(String[] args) {
        MyBST bst = new MyBST();
        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(10);
        bst.insert(35);
        bst.insert(30);
        System.out.println("Searching 45 :" + bst.search(45));
        System.out.println("Searching 10 :" + bst.search(10));
        System.out.println("InOrder .....");
        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        System.out.println("Breadth First .....");
        bst.traverseBreadthFirst(bst.getRoot());
        System.out.println();
    }
}

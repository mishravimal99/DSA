package BST.tree;

import BST.node.TreeNode;

public class MyBST {
    TreeNode root;

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (node.getData() <= parent.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }

    public boolean search(int data) {
        boolean response = false;
        TreeNode temp = root;
        while (temp != null) {
            if (temp.getData() == data) {
                response = true;
                break;
            } else if (data < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        return response;
    }

    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            System.out.println(node.getData() + ",");
        }
    }

    public void traverseBreadthFirst(TreeNode node) {

    }
}

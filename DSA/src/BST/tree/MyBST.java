package BST.tree;

import BST.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MyBST {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

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
            System.out.print(node.getData() + ",");
            traverseInOrder(node.getRight());
        }
    }

    public void traverseBreadthFirst(TreeNode node) {
        if (node != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(node);
            while (!queue.isEmpty()) {
                TreeNode currentNode = queue.remove();
                System.out.print(currentNode.getData() + ",");
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }
        } else {
            System.out.println("Empty Tree");
        }
    }

    public TreeNode delete(int data) {
        TreeNode response = null;
        // search the node with given value
        TreeNode temp = root;
        TreeNode parent = null;
        while (temp != null && temp.getData() != data) {
            parent = temp;
            if (data < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        //search end
        //temp is containing the node to be delete or null
        if (temp != null) {
            if (isLeaf(temp)) {

            }
        }
        return response;
    }

    private boolean isLeaf(TreeNode temp) {
        return temp.getLeft() == null && temp.getRight() == null;
    }
}

package com.Bridgelabz;

public class BinarySearchTree{

    static Node root;
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
}

 // Uc3 = Search if 63 is present or not in the tree.
 public static boolean searchNode(Node root, int key){
    if(root == null) {
        return false;
    }

    if (root.data > key){
        return searchNode(root.left, key);
    }
    else if (root.data == key){
        return true;
    } else {
        return searchNode(root.right, key);
    }
}

public static void main(String[] args) {
    insertNode(67);
    insertNode(40);
    insertNode(70);
    inOrder(root);

    if(searchNode(root,63)){
        System.out.println("63 is present");
    }else
        System.out.println("63 is not found");
}
}



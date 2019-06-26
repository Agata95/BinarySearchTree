package com.javagda25.BinarySearchTree;

public class BST {
    private BSTNode root;

    public void put(int value) {
        root = putRecursive(value, root);
    }

    private BSTNode putRecursive(int value, BSTNode current) {
        if (current == null) {
            return new BSTNode(value);
        }

        if (value < current.getValue()) {
            current.setLeftChild(putRecursive(value, current.getLeftChild()));
        } else if (value > current.getValue()) {
            current.setRightChild(putRecursive(value, current.getRightChild()));
        } else {
            return current;
        }
        return current;
    }
}

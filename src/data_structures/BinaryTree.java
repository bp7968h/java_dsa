package data_structures;

public class BinaryTree {
    Node root;

    BinaryTree() {
        this.root = null;
    }

    BinaryTree(int[] nodes) {
        if (nodes.length == 0 || nodes.length == 1 && nodes[0] == -1) {
            this.root = null;
            return;
        }
        this.root = build_tree(nodes);
    }

    private int index = -1;
    private Node build_tree(int[] nodes) {
        index += 1;
        if (nodes[index] == -1) {
            return null;
        }

        Node new_node = new Node(nodes[index]);
        new_node.left = build_tree(nodes);
        new_node.right = build_tree(nodes);

        return new_node;
    }

    public void print_root() {
        System.out.print(root.left.data);
        System.out.print(' ');
        System.out.print(root.data);
        System.out.print(' ');
        System.out.print(root.right.data);
    }


    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
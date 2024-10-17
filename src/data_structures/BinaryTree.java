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

    public static void pre_order_traversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        pre_order_traversal(root.left);
        pre_order_traversal(root.right);
    }

    public static void in_order_traversal(Node root) {
        if (root == null) {
            return;
        }

        in_order_traversal(root.left);
        System.out.print(root.data + " ");
        in_order_traversal(root.right);
    }

    public static void post_order_traversal(Node root) {
        if (root == null) {
            return;
        }

        post_order_traversal(root.right);
        System.out.print(root.data + " ");
        post_order_traversal(root.left);
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
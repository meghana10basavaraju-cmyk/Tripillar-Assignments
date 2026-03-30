package module13;

class BinaryNode {
    int data;
    BinaryNode left, right;

    BinaryNode(int value) {
        data = value;
        left = right = null;
    }
}

public class MinMaxBST {

    BinaryNode root;

    int findMin(BinaryNode current) {
        if (current == null)
            return -1;

        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    int findMax(BinaryNode current) {
        if (current == null)
            return -1;

        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public static void main(String[] args) {

        MinMaxBST tree = new MinMaxBST();

        // Creating BST
        tree.root = new BinaryNode(50);
        tree.root.left = new BinaryNode(30);
        tree.root.right = new BinaryNode(70);
        tree.root.left.left = new BinaryNode(20);
        tree.root.left.right = new BinaryNode(40);
        tree.root.right.left = new BinaryNode(60);
        tree.root.right.right = new BinaryNode(80);

        System.out.println("Minimum element: " + tree.findMin(tree.root));
        System.out.println("Maximum element: " + tree.findMax(tree.root));
    }
}
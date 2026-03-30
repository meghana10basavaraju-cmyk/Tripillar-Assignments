package module13;

class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTSearch {

    BSTNode root;

    BSTNode search(BSTNode current, int key) {
        if (current == null || current.data == key)
            return current;

        if (key < current.data)
            return search(current.left, key);

        return search(current.right, key);
    }

    public static void main(String[] args) {

        BSTSearch tree = new BSTSearch();

        // Creating BST
        tree.root = new BSTNode(50);
        tree.root.left = new BSTNode(30);
        tree.root.right = new BSTNode(70);
        tree.root.left.left = new BSTNode(20);
        tree.root.left.right = new BSTNode(40);
        tree.root.right.left = new BSTNode(60);
        tree.root.right.right = new BSTNode(80);

        int key = 40;

        BSTNode result = tree.search(tree.root, key);

        if (result != null)
            System.out.println("Key " + key + " found in BST");
        else
            System.out.println("Key not found");
    }
}
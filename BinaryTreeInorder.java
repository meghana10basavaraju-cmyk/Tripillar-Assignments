package module12;

class Node {
    char data;
    Node left, right;

    Node(char item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeInorder {

    Node root;

    // Inorder Traversal: Left -> Root -> Right
    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);       // Visit left subtree
        System.out.print(node.data + " "); // Visit root
        inorder(node.right);      // Visit right subtree
    }

    public static void main(String[] args) {

        BinaryTreeInorder tree = new BinaryTreeInorder();

        // Creating the tree
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        tree.root.right.right = new Node('F');

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
    }
}
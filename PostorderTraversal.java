package module12;

class BTNode {
    char data;
    BTNode left, right;

    BTNode(char item) {
        data = item;
        left = right = null;
    }
}

public class PostorderTraversal {

    BTNode root;

    // Postorder: Left -> Right -> Root
    void postorder(BTNode current) {
        if (current == null)
            return;

        postorder(current.left);    // Left
        postorder(current.right);   // Right
        System.out.print(current.data + " "); // Root
    }

    public static void main(String[] args) {

        PostorderTraversal tree = new PostorderTraversal();

        // Creating tree
        tree.root = new BTNode('A');
        tree.root.left = new BTNode('B');
        tree.root.right = new BTNode('C');
        tree.root.left.left = new BTNode('D');
        tree.root.left.right = new BTNode('E');
        tree.root.right.right = new BTNode('F');

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
    }
}
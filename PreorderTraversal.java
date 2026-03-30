package module12;

class TreeNode {
    char data;
    TreeNode left, right;

    TreeNode(char item) {
        data = item;
        left = right = null;
    }
}

public class PreorderTraversal {

    TreeNode root;

    // Preorder: Root -> Left -> Right
    void preorder(TreeNode current) {
        if (current == null)
            return;

        System.out.print(current.data + " "); // Root
        preorder(current.left);               // Left
        preorder(current.right);              // Right
    }

    public static void main(String[] args) {

        PreorderTraversal tree = new PreorderTraversal();

        // Creating tree
        tree.root = new TreeNode('A');
        tree.root.left = new TreeNode('B');
        tree.root.right = new TreeNode('C');
        tree.root.left.left = new TreeNode('D');
        tree.root.left.right = new TreeNode('E');
        tree.root.right.right = new TreeNode('F');

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
    }
}
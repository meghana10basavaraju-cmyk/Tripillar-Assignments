package module13;

class TreeElement {
    int data;
    TreeElement left, right;

    TreeElement(int value) {
        data = value;
        left = right = null;
    }
}

public class ValidateBST {

    TreeElement root;

    boolean isBST(TreeElement node, int min, int max) {
        if (node == null)
            return true;

        if (node.data <= min || node.data >= max)
            return false;

        return isBST(node.left, min, node.data) &&
               isBST(node.right, node.data, max);
    }

    public static void main(String[] args) {

        ValidateBST tree = new ValidateBST();

        // Creating tree
        tree.root = new TreeElement(50);
        tree.root.left = new TreeElement(30);
        tree.root.right = new TreeElement(70);
        tree.root.left.left = new TreeElement(20);
        tree.root.left.right = new TreeElement(40);
        tree.root.right.left = new TreeElement(60);
        tree.root.right.right = new TreeElement(80);

        if (tree.isBST(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}
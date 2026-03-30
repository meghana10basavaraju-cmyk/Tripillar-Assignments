package module12;

class TreeElement {
    char data;
    TreeElement left, right;

    TreeElement(char item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeHeight {

    TreeElement root;

    int height(TreeElement current) {
        if (current == null)
            return -1;  // use 0 if counting levels

        int leftHeight = height(current.left);
        int rightHeight = height(current.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        BinaryTreeHeight tree = new BinaryTreeHeight();

        // Creating tree
        tree.root = new TreeElement('A');
        tree.root.left = new TreeElement('B');
        tree.root.right = new TreeElement('C');
        tree.root.left.left = new TreeElement('D');
        tree.root.left.right = new TreeElement('E');
        tree.root.right.right = new TreeElement('F');

        System.out.println("Height of tree: " + tree.height(tree.root));
    }
}
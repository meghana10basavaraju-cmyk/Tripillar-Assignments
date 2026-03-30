package module12;

class TreeItem {
    char data;
    TreeItem left, right;

    TreeItem(char item) {
        data = item;
        left = right = null;
    }
}

public class CountNodes {

    TreeItem root;

    int countNodes(TreeItem current) {
        if (current == null)
            return 0;

        return countNodes(current.left) + countNodes(current.right) + 1;
    }

    public static void main(String[] args) {

        CountNodes tree = new CountNodes();

        // Creating tree
        tree.root = new TreeItem('A');
        tree.root.left = new TreeItem('B');
        tree.root.right = new TreeItem('C');
        tree.root.left.left = new TreeItem('D');
        tree.root.left.right = new TreeItem('E');
        tree.root.right.right = new TreeItem('F');

        System.out.println("Total number of nodes: " + tree.countNodes(tree.root));
    }
}
package module13;

class TreeItem {
    int data;
    TreeItem left, right;

    TreeItem(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTInsertion {

    TreeItem root;

    TreeItem insert(TreeItem current, int value) {
        if (current == null) {
            return new TreeItem(value);
        }

        if (value < current.data) {
            current.left = insert(current.left, value);
        } else if (value > current.data) {
            current.right = insert(current.right, value);
        }

        return current;
    }

    public static void main(String[] args) {

        BSTInsertion tree = new BSTInsertion();

        // Inserting elements
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.println("Elements inserted into BST successfully.");
    }
}
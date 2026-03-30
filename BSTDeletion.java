package module13;

class TreeData {
    int data;
    TreeData left, right;

    TreeData(int value) {
        data = value;
        left = right = null;
    }
}

public class BSTDeletion {

    TreeData root;

    TreeData delete(TreeData current, int key) {
        if (current == null)
            return null;

        if (key < current.data) {
            current.left = delete(current.left, key);
        } else if (key > current.data) {
            current.right = delete(current.right, key);
        } else {

            // Case 1: No child
            if (current.left == null && current.right == null)
                return null;

            // Case 2: One child
            if (current.left == null)
                return current.right;

            if (current.right == null)
                return current.left;

            // Case 3: Two children
            int minValue = findMin(current.right);
            current.data = minValue;
            current.right = delete(current.right, minValue);
        }
        return current;
    }

    int findMin(TreeData node) {
        while (node.left != null)
            node = node.left;
        return node.data;
    }

    public static void main(String[] args) {

        BSTDeletion tree = new BSTDeletion();

        tree.root = new TreeData(50);
        tree.root.left = new TreeData(30);
        tree.root.right = new TreeData(70);
        tree.root.left.left = new TreeData(20);
        tree.root.left.right = new TreeData(40);
        tree.root.right.left = new TreeData(60);
        tree.root.right.right = new TreeData(80);

        tree.root = tree.delete(tree.root, 30);

        System.out.println("Node deleted successfully");
    }
}
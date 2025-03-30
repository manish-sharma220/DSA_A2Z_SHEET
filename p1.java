class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Solution {

    int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int reightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, reightHeight);

    }
}

public class p1 {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        Solution solution = new Solution();
        int depth = solution.maxDepth(root);

        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}

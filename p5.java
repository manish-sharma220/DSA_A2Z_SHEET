class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class p5 {
    public static boolean isIdentical(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return ((node1.data == node2.data)
                && isIdentical(node1.left, node2.left)
                && isIdentical(node1.right, node2.right));
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.right = new Node(7);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.left.right = new Node(7);

        if (isIdentical(root, root2)) {
            System.out.println(" trees are identical");
        } else {
            System.out.println(" trees are  not identical");
        }

    }
}

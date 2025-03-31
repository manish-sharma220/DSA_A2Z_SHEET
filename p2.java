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

public class p2 {

    public static int check(Node root) {
        if (root == null)
            return 0;
        int lh = check(root.left);
        if (lh == -1)
            return -1;
        int rh = check(root.right);
        if (rh == -1)
            return -1;
        if (Math.abs(lh - rh) > 1)
            return -1;
        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.right = new Node(7);
        int ans = check(root);
        if (ans == -1) {
            System.out.println("binary tree is not Balanced");
        } else {
            System.out.println("binary tree is Balanced. with height: " + ans);
        }

    }
}

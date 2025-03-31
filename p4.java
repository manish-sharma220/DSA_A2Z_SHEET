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

public class p4 {

    public static int maxPathSum(Node root, int[] ans) {
        if (root == null)
            return 0;
        int lh = maxPathSum(root.left, ans);
        int rh = maxPathSum(root.right, ans);
        ans[0] = Math.max(ans[0], lh + rh + root.data);
        return root.data + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        int ans[] = new int[1];
        maxPathSum(root, ans);

        System.out.println("Diameter of the tree is: " + ans[0]);

    }
}

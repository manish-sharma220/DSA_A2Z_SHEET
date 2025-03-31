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

public class p3 {
    public static int checkDiameter(Node root, int ans[]) {
        if (root == null)
            return 0;

        int lh = checkDiameter(root.left, ans);
        int rh = checkDiameter(root.right, ans);
        ans[0] = Math.max(ans[0], (lh + rh));
        return Math.max(lh, rh) + 1;

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
        checkDiameter(root, ans);

        System.out.println("Diameter of the tree is: " + ans[0]);

    }
}

Interviewer:

How would
you solve this?

👤You:

"I will use a recursive DFS approach to traverse the tree and calculate the height of left and right subtrees for each node.
At each node,
the potential
diameter is:Diameter=
Left Height+
Right Height
We keep
track of
the maximum
diameter encountered while
traversing the tree.
"
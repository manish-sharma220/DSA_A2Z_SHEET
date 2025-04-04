import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

public class p7 {
    public static boolean isLeafNode(Node root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    public static void leftBoundryNode(Node root, ArrayList<Integer> ans) {
        Node curr = root.left;
        while (curr != null) {
            if (isLeafNode(curr) == false)
                ans.add(curr.data);
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

    }

    public static void leafBoundryNode(Node root, ArrayList<Integer> ans) {
        if (isLeafNode(root)) {
            ans.add(root.data);
            return;
        }
        if (root.left != null) {
            leafBoundryNode(root.left, ans);
        }
        if (root.right != null) {
            leafBoundryNode(root.right, ans);
        }

    }

    public static void rightBoundryNode(Node root, ArrayList<Integer> ans) {
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (isLeafNode(curr) == false)
                temp.add(curr.data);
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        Collections.reverse(temp);
        ans.addAll(temp);

    }

    public static ArrayList<Integer> boundryNode(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }
        ans.add(root.data);
        if (isLeafNode(root)) {
            return ans;
        }
        leftBoundryNode(root, ans);
        leafBoundryNode(root, ans);
        rightBoundryNode(root, ans);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> solution = new ArrayList<>();
        solution = boundryNode(root);
        for (int i : solution) {
            System.out.println(i);
        }
    }

}

//
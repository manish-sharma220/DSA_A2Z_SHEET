import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

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

public class p6 {
    public static ArrayList<ArrayList<Integer>> ZigZag(Node root) {
        ArrayList<ArrayList<Integer>> finalAns = new ArrayList<>();
        if (root == null)
            return finalAns;
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        boolean flag = true;
        while (!Q.isEmpty()) {
            int size = Q.size();
            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node temp = Q.poll();

                ans.add(temp.data);
                if (temp.left != null) {
                    Q.add(temp.left);
                }
                if (temp.right != null) {
                    Q.add(temp.right);
                }

            }
            if (flag == false) {
                Collections.reverse(ans);

            }
            finalAns.add(ans);

            flag = !flag;

        }
        return finalAns;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        ArrayList<ArrayList<Integer>> solution = new ArrayList<>();
        solution = ZigZag(root);
        for (ArrayList<Integer> it : solution) {
            for (int i : it) {
                System.out.println(i + " ");
            }
            System.out.println();

        }

    }
}

/*
 * zigzag traversal matlb jaise hum log lever order traversal mai level by level
 * traverse kr rhe the or har leve mai left se right jaa rhe the lekin zigzag
 * traversal mai hame level by level zana hai lekin hame left to right or right
 * to left alternatively zana hai to pehle hum ek nasted arraylist lenege uske
 * baad agr root null hota hai to return krdenege arraylist ko uske baad ek q
 * banayenge usme root dalanenge or phir left se right a right se left se print
 * kb print krna hai uske lia ek flag naam ke variable lenege usme agr tru hai
 * to left to right or false hai tpo right to left uske baad normal level order
 * traversal krenge lekin hr ek iteration ke baad hme check krna hai ki kya flag
 * false hai agr false hai to ans ko reverse krke final ans mai add krna hai agr
 * nhi hai to normal ans ko final ans mai add krna hai or dusra level ke lia
 * flag ko change krna hai
 */
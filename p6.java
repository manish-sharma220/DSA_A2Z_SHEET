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

// Zigzag traversal means that instead of doing a normal level-order traversal
// where we move from left to right at every level, we need to traverse level by
// level alternating between left to right and right to left.

// Step-by-step Explanation
// Nested ArrayList for the Result

// We take a nested ArrayList to store the final zigzag order traversal.

// Handling Edge Case

// If the root is null, we simply return the empty result list.

// Using a Queue for Level Order Traversal

// We use a queue (Q) to store the nodes, just like in normal level-order
// traversal.

// Initially, we add the root node to the queue.

// Using a Flag for Direction Control

// We introduce a boolean flag (flag), which helps determine whether we should
// traverse left to right or right to left at each level.

// If flag = true, we traverse left to right.

// If flag = false, we traverse right to left.

// Traversing Level by Level

// We perform a normal level-order traversal using a loop.

// For each level:

// We store the elements of the level in a temporary list (ans).

// If flag == false, we reverse the list before adding it to the final answer.

// Otherwise, we add it as it is.

// Toggling the Flag

// After processing each level, we flip the flag (flag = !flag) to change the
// direction for the next level.

// Additional Clarification
// This technique helps in problems where we need a zigzag (or spiral) pattern,
// making it different from a regular level-order traversal.

// Time Complexity:
// 𝑂
// (
// 𝑁
// )
// O(N) since each node is processed once.

// Space Complexity:
// 𝑂
// (
// 𝑁
// )
// O(N) for storing the final answer and queue.
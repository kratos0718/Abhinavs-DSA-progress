package nov_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<>();
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class leet_590 {

    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val);
            for (Node child : node.children) {
                stack.push(child);
            }
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        leet_590 solution = new leet_590();

        Node root = new Node(1);

        Node node3 = new Node(3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);

        root.children.add(node3);
        root.children.add(node2);
        root.children.add(node4);

        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node3.children.add(node5);
        node3.children.add(node6);

        List<Integer> postorderResult = solution.postorder(root);
        System.out.println("N-ary Tree Postorder Traversal: " + postorderResult);
        // Expected Output: [5, 6, 3, 2, 4, 1]
    }
}
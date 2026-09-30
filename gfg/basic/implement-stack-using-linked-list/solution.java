/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

import java.util.ArrayList;

class myStack {

    ArrayList<Integer> stack = new ArrayList<>();

    public myStack() {
        // Initialize your data members
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size() - 1);
        }
    }

    public int peek() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }
}
import java.util.ArrayList;
class myStack {
    ArrayList<Integer>stack=new ArrayList<>();// Define your stack

    public void push(int x) {
       stack.add(x) ;// insert x into stack
    }

    public void pop() {
        if(!stack.isEmpty()){
        stack.remove(stack.size()-1);}// remove top ele from stack
    }

    public int peek() {
       return stack.get(stack.size()-1) ;// return top of stack
    }

    public int getSize() {
      return stack.size();  // return current size of stack
    }

    public boolean isEmpty() {
       return stack.isEmpty(); // check whether stack is empty
    }
}

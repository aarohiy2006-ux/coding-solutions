import java.util.*;

class Solution {
    public Queue<Integer> fillQ(int[] arr) {
        Queue<Integer> q = new LinkedList<>();

        for (int x : arr) {
            q.add(x);
        }

        return q;
    }

    public void emptyQ(Queue<Integer> q) {
        while (q.size() > 1) {
            System.out.print(q.remove() + " ");
        }

        if (!q.isEmpty()) {
            System.out.print(q.remove());
        }
         System.out.println();
        
    }
}
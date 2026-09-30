class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();

                for (int x : arr) {
                    deq.add(x);
                }

                return deq;
            }
        }
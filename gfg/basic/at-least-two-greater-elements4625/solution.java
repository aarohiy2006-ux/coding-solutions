class Solution {
    public long[] findElements(long arr[]) {
        // code here
       Arrays.sort(arr);
        
        
        ArrayList<Long>ans=new ArrayList<>();
        for(int i = 0; i < arr.length - 2; i++) {
                    ans.add(arr[i]);
                }
        long[] result = new long[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
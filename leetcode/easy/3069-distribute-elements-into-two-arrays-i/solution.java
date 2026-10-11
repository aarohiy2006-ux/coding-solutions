class Solution {
    public int[] resultArray(int[] nums) {
      int[] arr1=new int[nums.length];
      int[] arr2=new int[nums.length];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int last1=1;
        int last2=1;
        for(int i=2;i<nums.length;i++){
            if(arr1[last1-1] > arr2[last2-1]){
                arr1[last1]=nums[i];
                last1++;
            }
            else {
                arr2[last2]=nums[i];
                last2++;
            }
        }
            int[] result = new int[nums.length];

        for (int i = 0; i < last1; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < last2; i++) {
            result[last1 + i] = arr2[i];
        }

        return result;
            
        }
    }

class Solution {
    public int minPairSum(int[] nums) {

        // First sort
        // Second find mid & reverse second part
        // Third Pair(first val of first part, first val of second part)

        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int n=nums.length;
        int mid=n/2;
        int left=mid,right=n-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        // System.out.println(Arrays.toString(nums));

        int res=Integer.MIN_VALUE;
        for(int i=0;i<n/2;i++){
            res=Math.max(nums[i]+nums[n/2+i],res);
        }
        return res;




        
    }
}
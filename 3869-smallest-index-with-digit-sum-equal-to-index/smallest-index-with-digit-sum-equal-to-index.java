class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sumDig(nums[i],i)) return i;
        }
        return -1;
    }
    public static boolean sumDig(int val, int ind){
        int sum=0;
        while(val>0){
            int rem=val%10;
            sum+=(rem);
            val/=10;
        }
        if(sum==ind) return true;
        return false;
    }
}
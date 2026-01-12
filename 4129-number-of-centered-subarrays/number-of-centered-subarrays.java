class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                    // System.out.print(nums[k]+" ");
                }
                
                // System.out.println(" ");
                for(int k=i;k<=j;k++){
                    if(sum==nums[k]){
                        cnt++;
                        break;
                    }
                }
            }
        }
        return cnt;
        
    }
}
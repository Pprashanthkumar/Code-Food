class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int res[]=new int[n];

        int dummy[]=new int[n];
        for(int i=0;i<n;i++) dummy[i]=nums.get(i);
        Arrays.sort(dummy);
        int highVal=dummy[n-1];

        for(int i=0;i<n;i++){
            int val=nums.get(i);
            boolean poss=false;
            for(int j=1;j<=highVal;j++){
                if((j|(j+1))==val){
                    res[i]=j;
                    poss=true;
                    break;
                }
            }
            if(!poss) res[i]=-1;
        }
        
        return res;
    }
}
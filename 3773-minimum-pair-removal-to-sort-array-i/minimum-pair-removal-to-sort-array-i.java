class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        int res=0;
        int prevElem=Integer.MIN_VALUE;
        for(int val:nums) lst.add(val);
        
        
        while(!isAscOrder(lst)){
            int ind=0;
            int prevSum=Integer.MAX_VALUE;
            for(int i=0;i<lst.size()-1;i++){
                int sum=lst.get(i)+lst.get(i+1);
                if(sum<prevSum){
                    prevSum=sum;
                    ind=i;
                    
                }
    
            }
            lst.remove(ind);
            lst.remove(ind);
            lst.add(ind,prevSum);
            // System.out.println(adj1+" "+adj2+" "+prevSum);
            // System.out.println(lst);
            res++;
        }

        return res;
        
    }
    private static boolean isAscOrder(List<Integer> lst){
        for(int i=0;i<lst.size()-1;i++){
            if(lst.get(i)>lst.get(i+1)) return false;
        }
        return true;
    }
}
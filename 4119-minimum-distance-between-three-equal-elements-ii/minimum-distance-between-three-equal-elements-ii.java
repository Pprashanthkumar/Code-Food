class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);    
        }
        
        int minDis=Integer.MAX_VALUE;
        for(Map.Entry<Integer,List<Integer>> m:map.entrySet()){
           
            List<Integer> list=m.getValue();
            if(list.size()>=3){
                    for (int i = 0; i + 2 < list.size(); i++) {
                    int a = list.get(i);
                    int b = list.get(i + 1);
                    int c = list.get(i + 2);
                    int sum = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                    minDis = Math.min(minDis, sum);
                    }
                
            }
        }

        return (minDis!=Integer.MAX_VALUE) ? minDis: -1;  
    }
}
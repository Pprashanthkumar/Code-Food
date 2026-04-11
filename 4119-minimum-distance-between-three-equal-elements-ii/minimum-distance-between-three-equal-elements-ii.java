class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        if(nums.length<3) return -1;
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        // System.out.println(map);

        int minDistance=Integer.MAX_VALUE;
        for(List<Integer>lst:map.values()){
            int sum=0;
            if(lst.size()>=3){
                for(int i=0;i<lst.size()-2;i++){
                    int a=lst.get(i);
                    int b=lst.get(i+1);
                    int c=lst.get(i+2);
                    sum=Math.abs(a-b)+Math.abs(b-c)+Math.abs(c-a); 
                    minDistance=Math.min(minDistance, sum); 
                } 
            }
            
        }
        return minDistance!=Integer.MAX_VALUE ? minDistance : -1;
    }
}
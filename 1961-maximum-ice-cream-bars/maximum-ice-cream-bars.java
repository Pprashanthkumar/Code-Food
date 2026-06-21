class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        Arrays.sort(costs);

        int cnt=0;
        for(int val:costs){
            if(coins<=0 || coins<val) break;
            cnt++;
            coins-=val;
        }
        return cnt;
        
    }
}
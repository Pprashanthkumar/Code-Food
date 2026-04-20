class Solution {
    public int maxDistance(int[] c) {
        int dist=Integer.MIN_VALUE;
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]!=c[j]){
                    dist=Math.max(dist,j-i);
                }
            }
        }
        return dist;
    }
}
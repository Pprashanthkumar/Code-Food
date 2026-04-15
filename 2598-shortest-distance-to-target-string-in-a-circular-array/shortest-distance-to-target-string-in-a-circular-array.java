class Solution {
    public int closestTarget(String[] w, String tar, int startIndex) {
        int n=w.length;
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(tar.equals(w[i])){
                int dis=Math.abs(startIndex-i);//front dis
                dis=Math.min(dis,n-dis);//back dis
                minDist=Math.min(minDist,dis);//comp front & back
            }
        }
        return minDist!=Integer.MAX_VALUE?minDist:-1;
    }
}
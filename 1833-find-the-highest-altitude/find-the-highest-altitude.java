class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int totalAlt[]=new int[n+1]; // to store from inital

        int curAlt=0;
        totalAlt[0]=curAlt;

        for(int i=0;i<n;i++){
            int newAlt=curAlt+gain[i];
            totalAlt[i+1]=newAlt;
            curAlt=newAlt;
        }
        
        Arrays.sort(totalAlt);
        return totalAlt[n]; //Print last(highest) element 
        
    }
}
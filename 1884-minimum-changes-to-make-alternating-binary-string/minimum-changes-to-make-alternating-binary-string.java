class Solution {
    public int minOperations(String s) {
        int n=s.length();

        // compare with starting 0
        int act0[]=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0) act0[i]=0;
            else act0[i]=1;
        }

        int res1=0;
        for(int i=0;i<n;i++){
            int val=s.charAt(i)-'0';
            if(val!=act0[i]) res1++;
        }

        // compare with starting 1
        int act1[]=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0) act1[i]=1;
            else act1[i]=0;
        }


        int res2=0;
        for(int i=0;i<n;i++){
            int val=s.charAt(i)-'0';
            if(val!=act1[i]) res2++;
        }
        
        // System.out.println("Actual String can be: "+Arrays.toString(act0));
        // System.out.println("Actual String can be: "+Arrays.toString(act1));


        return Math.min(res1,res2);
    }
}
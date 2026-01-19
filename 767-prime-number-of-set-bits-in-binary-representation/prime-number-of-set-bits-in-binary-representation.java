class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++){
            int val=i;
            String bin=Integer.toBinaryString(val);
            // System.out.println(bin);
            if(isPrime(convert(bin))){
                res++;
            }
        }
        return res;
    }
    private static int convert(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1') count++;
        }
        // System.out.println(str+" "+count);
        return count;
    }
    private static boolean isPrime(int num){
        if(num<=1) return false;
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0) return false;
            }
        }
        return true;

    }
}
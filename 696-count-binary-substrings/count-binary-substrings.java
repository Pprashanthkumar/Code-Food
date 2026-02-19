class Solution {
    public int countBinarySubstrings(String s) {
        int arr[]=new int[s.length()];
        int strk=1;
        int ind=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                strk++;
            }
            else{
                arr[ind++]=strk;
                strk=1;
            }
        }
        arr[ind++]=strk;

        // System.out.println(Arrays.toString(arr));
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            res+=Math.min(arr[i],arr[i+1]);
        }
        return res;
        
    }
}
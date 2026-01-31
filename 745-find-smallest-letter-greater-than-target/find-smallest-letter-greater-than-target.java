class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for(int i=0;i<letters.length;i++){
            if(target-'a'<letters[i]-'a') return letters[i];
        }
        return letters[0];
        
    }
}
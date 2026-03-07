class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1)
                    if(checkRow(i,j,mat,n,m) && checkCol(i,j,mat,n,m)) res++;
            }
        }
        return res;
        
    }
    // Row Check
    private static boolean checkRow(int row,int col,int mat[][],int n,int m){
        for(int j=0;j<m;j++){
            if(j!=col && mat[row][j]==1) return false;
        }
        return true;
    }
    // Col Check
    private static boolean checkCol(int row,int col,int mat[][],int n,int m){
        for(int i=0;i<n;i++){
            if(i!=row && mat[i][col]==1) return false;
        }
        return true;
    }
}
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int k=mat.length;
        for(int i=0;i<mat.length;i++){//first loop
            for(int j=0;j<mat.length;j++){//2nd loop
                if(i==j || i+j==mat.length-1){//same as printing "X" pattern
                    sum+=(mat[i][j]);//getting sum
                }
                
            }
        }
        return sum;//return sum
    }
}

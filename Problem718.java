class Problem718 {
    public int findLength(int[] A, int[] B) {
        int n=A.length;
        int[][] M=new int[n+1][n+1];
        if(A.length==0)
            return 0;
        // M[0][0]=(A[0]==B[0])?1:0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                M[i][j]=0;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (A[i-1]==B[j-1]){
                    M[i][j]=M[i-1][j-1]+1;
                } else {
                    M[i][j]=0;
                }
                max=max>M[i][j]?max:M[i][j];
            }
        }
        return max;
    }
}

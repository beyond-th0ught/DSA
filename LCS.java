// (Logest Common Subsequence)
class Solution{
    static int lcs(int x, int y, String s1, String s2){
        int N = s1.length();
        int M = s2.length();
        int[][] dp = new int[N+1][M+1];
        
        for(int i = N; i >= 0; i--){
            for(int j = M; j >= 0; j--){
                if(i == N  &&  j == M){
                    dp[i][j] = 0;
                } else if(i == N){
                    dp[i][j] = 0;
                } else if( j == N) {
                    dp[i][j] = 0;
                } else {
                    char a = s1.charAt(i);
                    char b = s2.charAt(j);
                    if(a==b){
                        dp[i][j] = dp[i+1][j+1]+1;
                    } else {
                        dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                    }
                }
            }
        }
        
        return dp[0][0];
    }
    
}

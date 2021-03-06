public class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(); 
        int len2 = word2.length(); 
        
        if (len1 == 0) {
            return len2; 
        }
        
        if (len2 == 0) {
            return len1; 
        }
        
        int[][] T = new int[len1 + 1][len2 + 1];
        
        for (int j = 0; j <= len2; j++) {
            T[0][j] = j; 
        }
        
        for (int i = 0; i <= len1; i++) {
            T[i][0] = i; 
        }
        
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    T[i][j] = T[i - 1][j - 1]; 
                } else {
                    int min = Math.min(T[i][j - 1], T[i - 1][j]);
                    min = Math.min(min, T[i - 1][j - 1]);
                    T[i][j] = min + 1; 
                }
            }
        }
        
        return T[len1][len2]; 
    }
}

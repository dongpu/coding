public class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length; 
        if (len == 0) return 0; 
        int[] T = new int[len]; 
        T[0] = 1; 
        int max = 1; 
        
        for (int i = 1; i < len; i++) {
            T[i] = 1; 
            int j = i - 1; 
            
            while (j >= 0) {
                if (nums[i] > nums[j]) {
                    T[i] = Math.max(T[i], T[j] + 1);  
                    max = Math.max(max, T[i]); 
                }
                
                j--; 
            }
        }
        
        return max; 
    }
}

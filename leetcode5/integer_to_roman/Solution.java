public class Solution {
    public String intToRoman(int num) {
        String result = ""; 
        int base = 1000; 
        Map<Integer, Character> m = new HashMap<Integer, Character>(); 
        m.put(1, 'I');
        m.put(5, 'V');
        m.put(10, 'X');
        m.put(50, 'L'); 
        m.put(100, 'C');
        m.put(500, 'D');
        m.put(1000, 'M'); 
        
        while (num > 0) {
            int digit = num / base; 
            
            if (digit >= 1 && digit <= 3) {
                for (int i = 0; i < digit; i++) {
                    result += m.get(base); 
                }
            } else if (digit == 4) {
                result += m.get(base); 
                result += m.get(base * 5); 
            } else if (digit >= 5 && digit <= 8) {
                result += m.get(base * 5);
                
                for (int i = 0; i < digit - 5; i++) {
                    result += m.get(base); 
                }
            } else if (digit == 9) {
                result += m.get(base);
                result += m.get(base * 10); 
            }
            
            num = num % base; 
            base = base / 10; 
        }
        
        return result; 
    }
}

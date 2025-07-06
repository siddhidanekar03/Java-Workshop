public class Solution1 {
    public boolean isPrefixString(String s, String[] words) {
        String w = "";        
        for (int i = 0; i < words.length; i++) {
            w += words[i];            
            if (w.equals(s)) {
                return true;
            }
        }        
        return false;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        
        // Example 1
        String s1 = "iloveleetcode";
        String[] words1 = {"i", "love", "leetcode", "apples"};
        boolean result1 = solution.isPrefixString(s1, words1);
        System.out.println("Result 1: " + result1);  // Expected: true
        
      
    }
}

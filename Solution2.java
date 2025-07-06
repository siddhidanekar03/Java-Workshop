public class Solution2 {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (s.startsWith(words[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        // Example 1
        String[] words1 = {"a", "b", "c", "ab", "bc"};
        String s1 = "abc";
        int result1 = solution.countPrefixes(words1, s1);
        System.out.println("Result 1: " + result1);  // Expected: 3 (a, ab, bc)

        // Example 2
        String[] words2 = {"a", "b", "ba", "ab"};
        String s2 = "abacus";
        int result2 = solution.countPrefixes(words2, s2);
        System.out.println("Result 2: " + result2);  // Expected: 2 (a, ab)

        // Example 3
        String[] words3 = {"hello", "he", "hell"};
        String s3 = "helloworld";
        int result3 = solution.countPrefixes(words3, s3);
        System.out.println("Result 3: " + result3);  // Expected: 3 (he, hell, hello)
    }
}

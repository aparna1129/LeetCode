class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Create a set to store allowed characters
        Set<Character> allowedSet = new HashSet<>();
        
        // Add each character of the allowed string to the set
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        
        int count = 0;
        
        // Check each word in the words array
        for (String word : words) {
            boolean isConsistent = true;
            
            // Check if every character in the word is in the allowed set
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            
            // If the word is consistent, increment the count
            if (isConsistent) {
                count++;
            }
        }
        
        return count;
    }
}

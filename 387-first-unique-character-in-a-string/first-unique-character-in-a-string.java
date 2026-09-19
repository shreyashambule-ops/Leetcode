class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            
            // Check character i against EVERY other character j in the string
            for (int j = 0; j < s.length(); j++) {
                // Skip comparing the character with itself
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break; // Duplicate found, no need to check further for this i
                }
            }
            
            // If no match was found anywhere, i is our first unique character
            if (isUnique) {
                return i;
            }
        }
        
        return -1; // No unique character found
    }
}
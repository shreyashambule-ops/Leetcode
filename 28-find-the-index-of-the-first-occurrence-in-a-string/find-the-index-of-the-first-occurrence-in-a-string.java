class Solution {
    public int strStr(String haystack, String needle) {
        int l = haystack.length();
        int k = needle.length();

        for (int i = 0; i <= l - k; i++) {
            if (haystack.substring(i, i + k).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
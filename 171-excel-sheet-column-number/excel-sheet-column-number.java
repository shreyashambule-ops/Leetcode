class Solution {
    public int titleToNumber(String columnTitle) {
        int l=columnTitle.length();
        long r=0;
        for(int i=0;i<l;i++){
            char ch=columnTitle.charAt(i);
            r = r*26 +(ch-'A'+1);
        }
        return (int) r;
    }
}
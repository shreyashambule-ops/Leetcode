class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int result=-1;
        
        if(x<=9){
            result=x;
        }
        else if(x>9 && x<100){
           int u =x%10;
           int t=x/10;
           if(x%(t+u)==0){
            result=t+u;
           }
        }
        else{
            result=1;
        }
        return result;
    }
}
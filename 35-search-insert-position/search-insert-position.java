class Solution {
    public int searchInsert(int[] nums, int target) {
        int sh=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==target){
                sh=i;
                break;
            }
            else if(nums[i]>target){
                sh=i;
                break;
            }
            else{
                sh=nums.length;
            }
            
        }
        
        
        return sh;
        
    }
}
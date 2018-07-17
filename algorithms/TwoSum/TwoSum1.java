class Solution {
    public int[] twoSum(int[] nums, int target) {
        int b[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    b[0] = nums[i];
                    b[1] = nums[j];
                }
            }
        }
        return b;
    }
}

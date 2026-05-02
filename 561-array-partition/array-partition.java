class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int mSum=0;
        for(int i=0;i<nums.length;i=i+2){
            mSum+=nums[i];
        }
        return mSum;
    }
}
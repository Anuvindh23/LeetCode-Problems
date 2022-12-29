class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if (nums[count] < nums[i])
                count+=1;
                nums[count]=nums[i];
        }
        return count+1;
    }
}
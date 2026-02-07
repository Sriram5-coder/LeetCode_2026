class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i=0;
        int ans[]=new int[nums.length];
        while(i<nums.length){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if (j==i){
                    continue;
                }else{
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }
                ans[i]=count;
            }
            i++;
        }
        return ans;
    }
}
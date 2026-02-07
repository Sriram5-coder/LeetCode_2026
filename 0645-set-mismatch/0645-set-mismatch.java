class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        Arrays.sort(nums);
        int n = nums.length;
        
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                res[0] = nums[i]; 
                break;
            }
        }
        
      
        if (nums[0] != 1) {
            res[1] = 1;
        } else if (nums[n - 1] != n) {
            res[1] = n; 
        } else {
            
            for (int i = 0; i < n - 1; i++) {
                if (nums[i + 1] > nums[i] + 1) {
                    res[1] = nums[i] + 1;
                    break;
                }
            }
        }
        
        return res;
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        int i=0;
        int j=0;

        while(j<ans.length){
            ans[j]=nums[i];
            i++;
            j++;
            if(i==(nums.length)){
                i=0;
            }
            
        }
        return ans;
    }

}
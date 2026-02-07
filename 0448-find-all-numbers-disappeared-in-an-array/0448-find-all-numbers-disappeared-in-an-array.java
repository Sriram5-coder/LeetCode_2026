class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean arr[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]=true;
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]){
                continue;
            }else{
                result.add(i+1);
            }
        }
        return result;
    }
}
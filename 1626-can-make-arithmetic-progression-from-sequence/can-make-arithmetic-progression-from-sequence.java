class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==2){
            return true;
        }
        int result=0;
        int dif=arr[0]-arr[1];
        for(int i=0;i<arr.length-1;i++){
            int d=arr[i]-arr[i+1];
            if(d!=dif){
                result=1;
            }
        }
        if(result==0){
            return true;
        }else{
            return false;
        }

    }
}
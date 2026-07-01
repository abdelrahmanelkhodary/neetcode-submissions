class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] rightRes =  new int [nums.length];
        int [] leftRes =  new int [nums.length];
        int []res=new int [nums.length];
        rightRes[0]=1;
        for (int i =1; i <nums.length ; i ++){
           rightRes[i]= rightRes[i-1]*nums[i-1];
        }
        leftRes[nums.length-1]=1;
        for(int i = nums.length-2 ;i>=0;i--){
            leftRes[i]= leftRes[i+1]*nums[i+1];
        }
        
       for(int i = 0; i < nums.length; i++){
        res[i] = leftRes[i] * rightRes[i];
         }
        return res;
    }
}  

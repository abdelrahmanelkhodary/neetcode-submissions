class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> answer = new HashMap<>();
        int needed = 0 ;
        for (int i = 0 ; i< nums.length;i++){
          needed =  target - nums[i];
          if (answer.containsKey(needed)){
            return new int[]{answer.get(needed),i} ;
          }
          else{
            answer.put(nums[i],i);
          }
            
        }
        return  new int[]{};
    }
}

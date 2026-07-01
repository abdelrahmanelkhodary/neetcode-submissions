class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for  (int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if (k>map.size()){
            return ans;
        }


        for (int i = 0 ; i< k;i++){
            int maxValue = 0 ;
            int maxFreq = 0;

            for (Map.Entry<Integer,Integer> entry :map.entrySet()){
                    if (entry.getValue()> maxFreq){
                        maxValue= entry.getKey();
                        maxFreq = entry.getValue();
                    }

            }
            ans[i]=maxValue;
            map.remove(maxValue);
        }
    return ans;
    }
}

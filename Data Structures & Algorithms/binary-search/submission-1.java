class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;
        int mid =  n/2;

        int left=0;
        int right= n-1;
        
        

        while (left<=right){
            

            if (nums[mid]>target){
                right=mid-1;
                mid = (left +right)/2;
            }
            else if (nums[mid]<target){
                left = mid+1;
                mid = (left +right)/2;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}

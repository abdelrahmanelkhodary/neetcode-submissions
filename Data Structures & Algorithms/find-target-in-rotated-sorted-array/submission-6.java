class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left<=right){
            int mid = left+(right-left)/2;

            if (nums[mid]==target){
                return mid;
            }
            

             if (nums[left]<=nums[mid]){
                //left is sorted 
                if(target<nums[mid]&&target>=nums[left]){
                    //target in the left side
                    right = mid -1;
                }
                else {
                    //target is not on the left side 
                    left=mid+1;
                }
                
            }
            else {
                //right is sorted
                if(target>nums[mid]&&target<=nums[right]){
                    //target in the right side
                   
                     left=mid+1;
                }
                else {
                    //target is not on the right side 
                     right = mid -1;
                }
            }
            


        }
        return -1;
    }

}


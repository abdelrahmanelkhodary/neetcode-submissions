class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int mid=1;
        
        while(left<=right){
         mid = (right +left) /2;
        if (nums[mid]<=nums[right]&&nums[mid]>=nums[left]){
            return nums[left] ;
        }
        else if (nums[mid]>nums[right]){
            left=mid+1;

        }
        else if (nums[mid]<=nums[right]){
            right =mid;
            left +=1;
        }
        else  {
            right=mid-1;
        }

        }
     return nums[mid];
    }
}

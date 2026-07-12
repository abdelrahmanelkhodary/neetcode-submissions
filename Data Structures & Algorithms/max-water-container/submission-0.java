class Solution {
    public int maxArea(int[] heights) {
          int maxArea = 0;
        if (heights.length <2)
        return maxArea;

        int left = 0;
        int right = heights.length-1;
      
        while(left<right){

             maxArea=Math.max(maxArea,Math.min(heights[left],heights[right])*(right-left));

            if(heights[left]<heights[right] ){
                left ++ ; 
            }
            else{
                right --;
            }

       
        }
        return maxArea;
    }
}

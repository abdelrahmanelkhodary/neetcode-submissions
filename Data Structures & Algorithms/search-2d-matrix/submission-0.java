class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right= n*m -1;



        while(left<=right){

            int mid = (right+left)/2;
            int row = mid / m;
            int col = mid % m ; 

            if (target == matrix[row][col]){
                return true;
            }
            else if (target > matrix[row][col]){
                  left=mid+1;  
            }
            else{
                right=mid-1;

            }

        }

        return false;



    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

/*
        int maxLeft1=Integer.MIN_VALUE; // nums1[cut1-1]
        int minRight1=Integer.MAX_VALUE;; //nums1[cut1]

        int maxLeft2=Integer.MIN_VALUE; // nums2[cut2-1]
        int minRight2=Integer.MAX_VALUE;; //nums2[cut2]

    return  Math.max(maxLeft1,maxLeft2)
          (  Math.min(minRight1,minRight2) + Math.max(maxLeft1,maxLeft2) ) / 2 -->in 5.5
*/
     // try to cut two arrays in a way that the max(left)<min(right)
     // and the numbers of left = nums of right or atleast bigger  
     //swap the two arrays so we can loop over the saller one 
  
        if(nums1.length>nums2.length){
               int [] nums3= nums1;
               nums1=nums2;
               nums2=nums3;

        }
        int m = nums1.length;
        int n = nums2.length;
         int leftSize=(m+n+1)/2;
        int left =0;
        int right=m ;

        while(left<=right){

            int cut1= left+(right-left)/2 ;
            int cut2= leftSize-cut1;
            
            int maxLeft1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1-1] ;
            int minRight1 = (cut1 == nums1.length) ?Integer.MAX_VALUE :nums1[cut1] ;
            int maxLeft2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2-1] ;
            int minRight2 = (cut2 == nums2.length) ?Integer.MAX_VALUE :nums2[cut2] ;

            int max= Math.max(maxLeft1,maxLeft2);
            int min=  Math.min(minRight1,minRight2) ;
            if (max<=min){
                if ((m+n)%2==0){
                    return (double) ((double)(max+min)/2);
                }
                else{
                    return (double) max;

                }
            }
            else{
                if (maxLeft1>minRight2){
                 /*   cut1--;
                    cut2++;*/
                    right=cut1-1;
                }
                else{
                /*    cut1++;
                    cut2--; */
                    left=cut1+1;
                }

            }

            
            
     
    }

return 0;

}
}
    
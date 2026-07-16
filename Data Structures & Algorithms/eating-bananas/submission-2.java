class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int n = piles.length;
      int k = 1;
      int right=0;
      int left = 1;
      int answer=0;
      int calc = 0;
     

      //right boundry
      for(int i = 0 ; i < n ; i ++){
        right = Math.max(right,piles[i]);
      }
     

    while(left<=right){
       k = (left +right)/2 ;
      calc=0;
      for(int i = 0 ; i<n;i++){
        calc=(int)(calc+Math.ceil((double)piles[i]/k));
      }
      if (calc<=h){
        answer=k;
        right=k-1;
        
      }
      else{
        left=k+1;

      }
    }
  return answer;
    }
}

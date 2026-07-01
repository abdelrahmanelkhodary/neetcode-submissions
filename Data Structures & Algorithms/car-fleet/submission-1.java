class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double [][] race = new double [n][2];

        for (int i = 0; i < n;i++){
            race[i][0]=position[i];
            race[i][1]= (double)(target - position[i])/speed[i];
        }
        Arrays.sort(race,(a,b)->Double.compare(b[0] , a[0]));
        
        int fleet =0;
        double lastTime=0;
        
        for (int i=0;i<n;i++){
            
         double time = race[i][1];
         if (time > lastTime){
            fleet++;
            lastTime=time;
         }
        }
        return fleet;

    }
}

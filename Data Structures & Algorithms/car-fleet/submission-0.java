class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        double [][] race = new double [position.length][2];

        for (int i = 0; i < position.length;i++){
            race[i][0]=position[i];
            race[i][1]= (double)(target - position[i])/speed[i];
        }
        Arrays.sort(race,(a,b)->Double.compare(b[0] , a[0]));
        
        int fleet =0;
        double lastTime=0;
        
        for (int i=0;i<race.length;i++){
            
         double time = race[i][1];
         if (time > lastTime){
            fleet++;
            lastTime=time;
         }
        }
        return fleet;

    }
}

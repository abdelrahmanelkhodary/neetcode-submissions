class Record{
    String value;
    int timestamp;
    public  Record(int timestamp ,  String value){
        this.value = value ;
        this.timestamp = timestamp;
    }
}

class TimeMap {
    HashMap<String,List<Record>> map ;
    
    public TimeMap() {
     map = new HashMap<>();
     
    }
    
    public void set(String key, String value, int timestamp) {
        
        Record record = new Record(timestamp,value);

            if(map.containsKey(key)){
              //add record to the existing list
            List <Record>list = map.get(key);
             list.add(record);
            
            }
            else{
                //create new map with new list 
            List<Record> list= new ArrayList<>();
            list.add(record);
            map.put(key, list);
            }
    }
    
    public String get(String key, int timestamp) {
        
        if  (map.containsKey(key)){
            
            List <Record> list = map.get(key);
            int n = list.size();
            int left = 0 ;
            int right = n-1;
            
            String minValue="";
            //search for the  timestamp to get the value , and if not exist we will take
            //the previous one 

            while(left<=right){
                int mid = left + (right-left)/2;
                if (list.get(mid).timestamp==timestamp){
                    return list.get(mid).value;
                }
                else if (list.get(mid).timestamp>timestamp){
                    right=mid-1;
                }
                else{
               
                left=mid+1;
                minValue=list.get(mid).value;

                }
                

            }
            return minValue;
        }   
        else{
            return "";
        }
        
    }
}   

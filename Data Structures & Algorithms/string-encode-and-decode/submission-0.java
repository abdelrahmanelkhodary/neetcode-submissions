class Solution {

    public String encode(List<String> strs) {
        String answer = "";
        for(int i = 0 ; i < strs.size() ; i++){
            answer +=  strs.get(i).length() + "#"  + strs.get(i);
        }
        return answer ;
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        int i = 0 ;
        while (i<str.length()){
            int j = i ;
            while (str.charAt(j)!='#'){
                j++;
            }
        int length = Integer.parseInt(str.substring(i,j));
        j++;
        String word = str.substring(j,j+length);
        answer.add(word);
        
        i= j + length;



        }
        return answer;

    }
}

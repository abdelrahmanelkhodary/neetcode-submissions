class Solution {
    public boolean isValidSudoku(char[][] board) {
            Set<Character>[] rows = new HashSet[9];
            Set<Character>[] columns =  new HashSet[9];
            Set<Character>[] box = new HashSet[9];
    
    for(int i =0; i <9  ;i++){
        rows[i]=new HashSet<>();
        columns[i]=new HashSet<>();
        box[i]=new HashSet<>();
    }
    for(int i = 0 ;i < 9 ; i++){

        for(int j = 0 ; j< 9 ; j ++){
           char c =  board[i][j];
            if (c=='.'){
                continue;
            }

          int  boxIndex = (i/3)*3+(j/3);

            if (rows[i].contains(c)){
                return false;
            }
            else{
                rows[i].add(c);
            }
            if (columns[j].contains(c)){
                return false;
            }
            else{
                columns[j].add(c);
            }
           if (box[boxIndex].contains(c)){
                return false;
            }
            else{
                box[boxIndex].add(c);
            }



        }
    }
    return true ;

}}

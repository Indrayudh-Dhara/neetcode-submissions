class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer , Set<Character>> row = new HashMap<>();
        HashMap<Integer, Set<Character>> col = new HashMap<>();
        HashMap<List<Integer> , Set<Character>> box = new HashMap<>();

        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board[0].length ; j++){
                //row = i
                //col = j

//row check
            if(board[i][j]!='.'){

                if(row.get(i)==null){
                    Set<Character> set = new HashSet<>();
                    set.add(board[i][j]);
                    row.put(i , set);
                }else{
                    Set<Character> set = row.get(i);
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                    row.put(i , set);
                }   

                     

//col check
            
                if(col.get(j)==null){
                    Set<Character> set = new HashSet<>();
                    set.add(board[i][j]);
                    col.put(j , set);
                }else{
                    Set<Character> set = col.get(j);
                    if(set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                    col.put(j, set);
                }
            
                
//box check

            
                int x = i/3;
                int y = j/3;

                List<Integer> list = new ArrayList<>();
                list.add(x);
                list.add(y);

                if(box.get(list)== null){
                    Set<Character> set = new HashSet<>();
                    set.add(board[i][j]);
                    box.put(list,set);
                }else{
                    
                    Set<Character> set = box.get(list);

                    if(set.contains(board[i][j])){
                        return false;
                    }
                    set.add(board[i][j]);
                    box.put(list,set);
                } 
            }
                

                                     
            }          
        }
        return true;
    }
}

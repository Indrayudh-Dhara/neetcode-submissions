class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> row = new HashMap<>();
        HashMap<Integer, Set<Character>> col = new HashMap<>();
        HashMap<List<Integer>, Set<Character>> box = new HashMap<>();

        for(int i = 0 ; i<board.length ; i++){
            Set<Character> set = new HashSet<>();         
            for(int j = 0 ; j<board[i].length ; j++){
                if(board[i][j]!='.'){
                    if(set.contains(board[i][j])){
                    return false;
                }
                int x = i/3;
                int y = j/3;
                List<Integer> list = new ArrayList<>();
                list.add(x);
                list.add(y);

                

                if(box.get(list)==null){
                    Set<Character> boxSet = new HashSet<>();
                    if(board[i][j]!='.'){
                        boxSet.add(board[i][j]);  
                    }
                    box.put(list , boxSet);     
                }
                else{
                    Set<Character> boxSet = new HashSet<>();
                    boxSet = box.get(list);
                    if(boxSet.contains(board[i][j])){
                        return false;
                    }else{
                        if(board[i][j]!='.'){
                        boxSet.add(board[i][j]);  
                    }
                    box.put(list , boxSet);  

                    }
                }
                
                
                
                
                set.add(board[i][j]);

                }
                
            }
            row.put(i , set);
        }

        for(int j = 0 ; j<board[0].length ; j++){
            Set<Character> set = new HashSet<>();
            for(int i = 0 ;i<board.length ; i++){
                if(board[i][j]!='.'){
                    if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);

                }
                
            }
            col.put(j, set);
        }

        return true;
        
    }
}

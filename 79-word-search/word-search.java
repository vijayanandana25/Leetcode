class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(board,word,i,j,0)){
                    //the index=0 here represents the index for  traversing the word
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board,String word,int row,int col,int index){
        if(index==word.length()) return true;
        if(row<0||col<0||row>=board.length||col>=board[0].length) return false;
        if(board[row][col]!=word.charAt(index)) return false;
        char temp = board[row][col];
        board[row][col]='#';
        boolean found = dfs(board,word,row+1,col,index+1) || 
                        dfs(board,word,row-1,col,index+1) || 
                        dfs(board,word,row,col+1,index+1) || 
                        dfs(board,word,row,col-1,index+1);
        
        board[row][col]=temp; //backtrack the element
        return found;

    }
}
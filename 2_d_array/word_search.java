public class word_search {
    public boolean valid(char[][] board,String word,int a,int b,int[][] pattern,int count){
        if(a>=0 && b>=0 && a<pattern.length && b<board[0].length && pattern[a][b]!=1 && board[a][b]==word.charAt(count)){
            return true;
        }
        return false;
    }
    public boolean search(char[][] board,String word,int a,int b,int[][] pattern,int count){
        if(count==word.length()){
            return true;
        }
        if(valid(board, word, a, b, pattern, count)){
            pattern[a][b]=1;
            count++;
            if(search(board, word, a+1, b, pattern, count)){
                return true;
            }
            if(search(board, word, a, b+1, pattern, count)){
                return true;
            }
            if(search(board, word, a-1, b, pattern, count)){
                return true;
            }
            if(search(board, word, a, b-1, pattern, count)){
                return true;
            }
            count--;
            pattern[a][b]=0;
            return false;
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    int pattern[][]=new int[board.length][board[0].length];
                    if(search(board,word,i, j,pattern,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

   
    
    public static void main(String[] args) {
        char[][] grid = { { 'A','B','C','E' },
                          { 'S','F','C','S' },
                          { 'A','D','E','E' } };
        
        word_search w=new word_search();

        System.out.println(w.exist(grid, "ABCB"));
        //System.out.println( w.exist(grid, "GKPR"));
    }
}

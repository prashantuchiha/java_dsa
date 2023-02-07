import javax.swing.text.AbstractDocument.LeafElement;

public class no_of_island {
    





    public void island(char[][] grid,int x,int y,int[][] matrix){

        if(x<0 || y<0 || grid[x][y]=='0' || x==grid.length || y==grid[0].length || matrix[x][y]==1){
            return;
        }
        matrix[x][y]=1;
       
            island(grid,x-1,y,matrix);
            island(grid,x,y-1,matrix);
            island(grid,x-1,y-1,matrix);
            island(grid,x+1,y,matrix);
            island(grid,x,y+1,matrix);
           
            island(grid,x+1,y+1,matrix);
           
            island(grid,x-1,y+1,matrix);
           
            island(grid,x+1,y-1,matrix);
           
        

    }




        // Function to find the number of islands.
        public int numIslands(char[][] grid) {
            // Code here
            int count=0;
            int matrix[][]=new int[grid.length][grid[0].length];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid.length;j++){
                    if(grid[i][j]=='0' && matrix[i][j]!=1){
                        island(grid,i,j,matrix);
                        count++;
                    }
                }
            }
            return count;
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

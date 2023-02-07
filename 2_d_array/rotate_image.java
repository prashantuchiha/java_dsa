public class rotate_image {
    
        public static void rotate(int[][] matrix) {
            for(int i=0;i<matrix.length;i++){
                for(int j=i;j<matrix.length;j++){
                    int a=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=a;
                }
            }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length/2;j++){
                    int a=matrix[i][j];
                    matrix[i][j]=matrix[i][matrix.length-j-1];
                    matrix[i][matrix.length-j-1]=a;
                }
            }
        }
        public static void main(String[] args) {
            int M[][] = {
                { 1, 2, 3 },     {4, 5, 6},
                { 7,8,9}
                
            };
            for(int i=0;i<M.length;i++){
                for(int j=0;j<M.length;j++){
                    System.out.print(M[i][j]);
                }
                System.out.println("");
            }
            rotate( M);
            for(int i=0;i<M.length;i++){
                for(int j=0;j<M.length;j++){
                    System.out.print(M[i][j]);
                }
                System.out.println("");
            }
    
    
    
        }
    
}

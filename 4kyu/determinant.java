public class Matrix {
   
    public static int determinant(int[][] matrix) {
    
     return determinantOfMatrix(matrix, matrix.length);
    }
  
    //recursive function for finding determinant of matrix. n is current dimension of mat[][]
    public static int determinantOfMatrix(int mat[][], int n) {
      int D = 0; // result
      
      //base case : if matrix contains single element
      if(n == 1) {
        return mat[0][0];
      }
      
      //store cofactor
      int temp[][] = new int[n][n];
      
      //store sign multiplier(-1, 1)
      int sign = 1;
      
      //iterate elements of first row
      for(int f = 0; f < n; f++) {
        
        getCofactor(mat, temp, 0, f, n);
        D += sign * mat[0][f] * determinantOfMatrix(temp, n - 1);
        
        //terms are to be added with alternate sign
        sign *= -1;
        
      }
      
      return D;
      
    }
    
    public static void getCofactor(int mat[][], int temp[][],int p, int q, int n) {
      // n == dimension of matrix
      int i = 0, j = 0;
      
      //looping the elements of matrix
      for(int row = 0; row < n; row++) {
        for(int col = 0; col < n; col++) {
          
         //copying into temp matrix only elements that are not in given row and column
          if(row != p && col != q) {
            temp[i][j++] = mat[row][col];
            
            //when the row is filled out, we should increase th row index and reset column index
            if(j == n - 1) {
              j = 0;
              i++;
            }
            
          }
          
        }
      }
      
    }
  
}
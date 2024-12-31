package arraysProg;

public class TransposeMatrix {

    public static int[][] transpose(int[][] mat , int row , int col){

        int[][] tr=new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 tr[j][i]=mat[i][j];
            }
        }

        return tr;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 6, 10 },
                { 8, 5, 9 },
                { 9, 4, 15 },
                { 7, 3, 60 } };
        mat=transpose(mat,4,3);

        // Print the matrix mat[][]
        for(int i = 0; i <3 ; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;

public class matrix_mult {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[mat1.length][mat2[1].length];

        System.out.println("Enter elements of matrix 1:");
        MatrixInp(mat1);

        System.out.println("Enter elements of matrix 2:");
        MatrixInp(mat2);

        MatrixMult(mat1,mat2,mat3);

        System.out.println("matrix obtained after multiplying both the matrix:");
        MatrixPrint(mat3);

        inp.close();
    }

    static void MatrixMult(int[][] m1,int[][] m2,int[][] m3){
        int sum = 0;
        for(int i=0; i<m3.length; i++){
            for(int j=0; j<m3[i].length;j++){
                for(int k = 0; k<m3.length; k++){
                    sum=sum+(m1[i][k]*m2[k][j]);
                }
                m3[i][j] = sum;
                sum=0;
            }
        }
    }


    static void MatrixInp(int[][] mat1){
        Scanner in = new Scanner(System.in);
        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length;j++){
                System.out.println("place "+i+","+j);
                mat1[i][j] = in.nextInt();
            }
        }
    }

    static void MatrixPrint(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}

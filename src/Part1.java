
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        //call 
        Matrix();
    }

    public static void Matrix() {
        // input and output matrix
        int rows;
        int cols;
        int matrix[][];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of cols: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];

        System.out.println("Enter the matrix: ");
        // input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Input the matrix with " + i + " rows" + j + " cols: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // show matrix
        System.out.println("output of matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println(" ");
        }

        // sum of Matrix
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        // show sum of matrix
        System.out.println("Sum of matrix: " + sum);

        // show average of matrix
        System.out.println("Average:" + (float) sum / (rows * cols));
    }
}

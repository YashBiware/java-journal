import java.lang.*;
import java.util.Scanner;



public class TwoDArray {
//Accept2DArray

    public static int[][] TwoDArray () {
        Scanner input = new Scanner(System.in);

        //input 2d array size
        System.out.print("Please enter the number of Rows:");
        int n = input.nextInt();
        System.out.print("Please enter the number of Columns:");
        int m= input.nextInt() ;

        int[][] newArray;
        newArray = new int[n][m];


        //input from the user

        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("index ["+ i +","+  j +"] : ");
                newArray[i][j] = input.nextInt();
            }
        }
    return newArray; }
}

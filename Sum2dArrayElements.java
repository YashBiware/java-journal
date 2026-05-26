import java.lang.*;
import java.util.Scanner;

public class Sum2dArrayElements {
    static void main() {
        Scanner input = new Scanner(System.in);
        int[][] SumArray= TwoDArray.TwoDArray();

        int n = SumArray.length;
        int m = SumArray[0].length;
        int sum = 0 ;
        for(int i =0 ; i <n; i++){
            for(int j = 0; j<m; j++){
                sum +=SumArray[i][j];
            }
        }

        System.out.println("The sum is: " + sum );
        return;
    }

}

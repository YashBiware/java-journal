import java.lang.*;
import java.util.Scanner;
import java.io.*;

// Searching in a 2d array

public class TwoDArraySearch {
    static void main() {

        int[][] ArrayNew = TwoDArray.TwoDArray();
        int n = ArrayNew.length;
        int m = ArrayNew[0].length;
        Scanner input = new Scanner(System.in);
        // Accepting the target element from user
        System.out.print("Please enter the target element to search: ");
        int target = input.nextInt();


        for(int i =0 ; i <n ;i++){
            for(int j=0 ; j<m ; j++){
                if(target == ArrayNew[i][j]){
                    System.out.println("Target found at index["+i+"]["+j+"] !!");
                    return;
                }
            }
        }
        if (true){
            System.out.println("Target not found !!");
            return ;

        }
return;

    }





}

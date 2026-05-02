//TO FIND THE OCCURRENCE OF A NUMBER IN AN ARRAY.

import java.lang.*;
import java.util.Scanner;


public class NumOCCURRENCE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int len = input.nextInt();

        int i = 0;
        int[] arr = new int[len];
        int sum = 0;
        int repeat = 0;



        while (i < len) {
            System.out.print("please enter the " + i + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.print("Please enter the number to Find the occurrence of : ");
        int num = input.nextInt();


        i=0;

        while (i < len) {
            if(arr[i]== num){
               repeat++;
            }
            i++;
        }

        if (repeat > 0){
            System.out.println("The occurrence is : " + repeat);
        }else{
            System.out.println("No match found");
        }


        return;
    }
}

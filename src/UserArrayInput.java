import java.lang.*;
import java.util.Scanner;

 class UserArrayInput {
    static int[] getArray() {

        //length of an array
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements : ");
        int len = input.nextInt();

        //array declaration
        int[] array = new int[len];


        // accept the values from user for each index
        System.out.println("Please enter the values for each index -> ");
        for(int s = 0 ; s < len ; s++){
            System.out.print("Index " + (s+1) +" : " );
            array[s]= input.nextInt();

        }


    return array;
    }
}

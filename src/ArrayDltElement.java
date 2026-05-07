import java.lang.*;
import java.util.Scanner;


public class ArrayDltElement {
    public static void main(String[] args) {

        // take user input array
        int[] array = UserArrayInput.getArray();

        Scanner input = new Scanner(System.in);

        // take user input on, which element to delete
        System.out.print("Please enter the number to delete :  ");
        int dlt= input.nextInt() ;

        // deleting the number given by the user
        int[] newArray; // declaring the new array
        newArray = new int[(array.length)] ;// assigning the length of new array
        int j=0 ;
        boolean found = false;

                    for(int i= 0; i< array.length; i++) {
                        if (array[i] == dlt) { // id dlt number found skip it
                            found = true ;
                            continue;
                        } else {
                            newArray[j] = array[i]; //if not put value of array into newArray
                            j++;
                        }
                    }


//print all the numbers after deleting the specified number
        if(!found){
            System.out.println("Element not found \nPrinting the original array");
        }
            for( j= 0; j< newArray.length; j++)
            System.out.print(" "+ newArray[j] + " ");

        return ;

    }
}

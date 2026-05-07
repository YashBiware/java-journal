import java.lang.*;
import java.util.Scanner;

public class MergerTwoSortedArrays {
    static void main(String[] args) {
        System.out.println("You are requested to enter enter 2 sorted arrays: ");
        System.out.println("Arrya 1 ");
        int[] Array1 = UserArrayInput.getArray();
        System.out.println("Arrya 2 ");
        int[] Array2 = UserArrayInput.getArray();

        int i;
        int[] NewArray = new int[(Array1.length)+ (Array2.length)] ;
         for( i = 0; i < Array1.length; i++){
             NewArray[i]= Array1[i];
         }
        int j =i;

         for(i = 0; i < Array2.length; i++){
             NewArray[j]=Array2[i];
             j++;
         }
        for(j = 0; j < NewArray.length; j++){
            System.out.print(" "+NewArray[j]+" "); //results as an unsorted array
        }


    }
}

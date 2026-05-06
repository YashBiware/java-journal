import java.lang.*;
import java.util.Scanner;

public class ReveseArray {
    static void main(String[] args) {

        int[] array= UserArrayInput.getArray();
        int[] newArray= new int[array.length];
        int i;
        //reversing the order
        int j = (array.length -1) ;
        for( i=0 ; i< array.length ; i++){


            newArray[i]=array[j];
            j--;
        }

        i =0 ;
        while(i<array.length){
            System.out.print(" "+newArray[i] +" ");
            i++;
        }


    }
}

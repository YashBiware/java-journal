import java.lang.classfile.instruction.StackInstruction;
import java.util.Scanner;
import java.lang.*;

public class MinMaxElement {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        
        //please go to UserArrayInput.java to see the array input code..
        int[] array = UserArrayInput.getArray();

        //min - max elements
        int max=array[0] ;
        int min=array[0] ;

        for(i=1; i< array.length; i++){

            if(array[i]>=max){
                max= array[i] ;
            }
            if (array[i]<=min){
                min = array[i] ;
            }
        }

        System.out.println("Min: "+ min + " and  Max: " + max);
return;
    }
}

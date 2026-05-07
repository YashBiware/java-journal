import java.lang.* ;
import java.util.Scanner;


public class Palindrome {
    static void main(String[] args) {


        boolean palindrome = false;
        int[] array = UserArrayInput.getArray();
        int j = (array.length - 1);
        int i;

        for (i = 0; i < j; i++) {
            if (array[i] == array[j]) {
                palindrome = true;
            }
            if (!palindrome) {
                System.out.println("Not a Palindrome!!! ");
                return;

            }
            j--;
        }

        if(palindrome){
            System.out.println("It is a Palindrome !!!");
        }
    }
}

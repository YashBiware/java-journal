import java.lang.*;
import java.util.Scanner;

public class SortedOrNot {
    static void main() {
        int array[] = UserArrayInput.getArray();
        Scanner input = new Scanner(System.in);
        int last= array.length -1 ;



    if(array[0]<=array[last]){         // considering it is ascending order (as zero'th element is smaller than first )

        for (int i = 0; i < (array.length)-1 ; i++) {
            if (!(array[i] <= array[i + 1])) {
                System.out.println("The array is not sorted");
                return;
            }
        }
        System.out.println("Array is sorted!!");
    }
    else {  // considering it is descending order (as zero'th element is greater than first )

                for (int i = 0; i < (array.length)-1 ; i++) {
                    if(    !  (array[i] >= array[i+1])   ){
                        System.out.println("The array is not sorted");
                        return;
                    }
                }
        System.out.println("Array is sorted  !!");
        }


        }
}



import java.util.Arrays;

/**
 * Created by Mohammed Alnaimi on 30/01/2022.
 */
public class assign1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Array beforre reverse : \n"+ Arrays.toString(arr));
        System.out.println("Array after reversing : \n"+Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] array){
        int n=array.length-1;
        for (int i = 0; i < array.length/2 ; i++) {
            int temp=array[i];
            array[i]=array[n];
            array[n]=temp;
            n--;
        }
        return array;

    }
}

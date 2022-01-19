import java.util.Scanner;

/**
 * Created by Arabic on 12/01/22.
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int []arr =new int [4];
        System.out.println("Enter The Elements");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}

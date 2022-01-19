import java.util.Scanner;

/**
 * Created by Arabic on 12/01/22.
 */
public class using_methods {
    public static void main(String[] args) {

        int []arr =new int [4];
        input_array_elements(arr);
        print_array_elements(arr);
    }
    public static void print_array_elements(int []x){
        System.out.println("array elemnts are:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+"\t");
        }
    }
    public static void input_array_elements(int []y){
        Scanner input=new Scanner (System.in);
        System.out.println("enter 4 elements");
        for (int i = 0; i <y.length ; i++) {
            y[i]=input.nextInt();
        }
    }
}

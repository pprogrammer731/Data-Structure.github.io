import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        singlylinkedList<String> numList=new singlylinkedList<>();
        Scanner in=new Scanner(System.in);
//        numList.addFirst(1);
//        numList.addLast(2);
//        numList.addFirst(0);
        System.out.println("size of list="+numList.size());
        System.out.println("First element of list="+numList.first());
        System.out.println("Last element of list="+numList.last());
        for(int i=0;i<5;i++){
            numList.addLast(in.next());
        }
        for(int i=0;i<5;i++){
            System.out.print(numList.removeFirst()+"\t");
        }
        System.out.println("size of list="+numList.size());
        System.out.println("First element of list="+numList.first());
        System.out.println("Last element of list="+numList.last());
    }
}

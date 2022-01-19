import java.util.Scanner;

/**
 * Created by Arabic on 12/01/22.
 */
public class Management {
    public static void main(String[] args) {
        Student [] team=new  Student[3];
//        Student s1= new Student(1,"aseel");
//        team[0]=s1;
//        Student s2= new Student(2,"hasan");
//        team[1]=s2;
//        Student s3= new Student(3,"mohammed");
//        team[2]=s3;
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <team.length ; i++) {
            int id=in.nextInt();
            String name=in.next();
         Student s= new Student(id,name);
            team[i]=s;
        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i]);
        }
    }

}

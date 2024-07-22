
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("how many times u want to print : ");

        int number  = sc.nextInt();

        System.out.println("enter what u want to  print : ");

        String name = sc.next();
         
        for (int i=0;  i<(number-1);i++) {

            System.out.println(name);
            
        }

           
    }
}

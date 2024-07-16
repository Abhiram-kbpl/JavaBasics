
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number a : ");
      int a =sc.nextInt();

      System.out.println("enter a number b : ");
      int b = sc.nextInt();

      if (a<b) {
        System.out.println("a is less than b ");
         }

        if (a>b) {
            System.out.println("a is greater  than b ");
        }

    }
}

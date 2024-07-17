
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        System.out.println("PRESS THE NUMBER BETWEEN 1 TO 5 !! ");

        int number = sc.nextInt();
        switch (number) {
            case 1:
               {
                System.out.println("u entered 1");
               }
            
            break;

            case 2:
            {
                System.out.println("u entered 2");
               }
            break;
            case 3:
            {
                System.out.println("u entered 3");
               }
             break;
             case 4:
             {
                System.out.println("u entered 4");
               }
            break;

            case 5:
            {
                System.out.println("u entered 5");
               }
            break;

            default:System.out.println("enter a number between 1 and 5");
             sc.close();
        }
    
    }
}

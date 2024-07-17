import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number : ");
        int first = sc.nextInt();

        System.out.println("enter the second number : ");
        int second = sc.nextInt();
        if(first>second){
            System.out.println("first number is greater ");
        }
        else if (first<second){
            System.out.println("second number is greater ");
        }
        else {
            System.out.println("both number are equal 5");
        }

        
    }
}

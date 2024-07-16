import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
    
    Scanner sc = new Scanner(System.in);

    // take input from user 
     System.out.println("what is your name ? :  ");
     String name = sc.nextLine();

     System.out.println("what is your age ? : ");
     int age = sc.nextInt();
     
     // give the output 

     System.out.println("hello "+ name +" "+ " you are : " + age +" "+ "old" );
    }
}

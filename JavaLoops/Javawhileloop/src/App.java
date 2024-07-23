import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPassword  = 1234567;

        System.out.print("enter the password to login : ");
        int password =sc.nextInt();

        while (password != correctPassword ) {
            
            System.out.println("password entered is wrong please try again  ");

            System.out.print("enter the password to login : ");

            password =sc.nextInt();
        }
            System.out.println("you entered the correct password  ");
            
            System.out.println("WELCOME");

            sc.close();
        

        }



        
    }


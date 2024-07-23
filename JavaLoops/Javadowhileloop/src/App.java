import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int CorrectPassowrd = 53321;
        int password;
    

        do{
            System.out.print("enter your password : ");
            password = sc.nextInt();
            if(password!=CorrectPassowrd){
              System.out.println("password u entered is worng !!!");
            }

          }
        while (password != CorrectPassowrd); {
          

       System.out.print("password u entered is wrong! ");

       password = sc.nextInt();

        }

        System.out.println("welcome ");

        sc.close();
     
      }
    }

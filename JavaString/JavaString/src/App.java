
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        

        String name   = sc.next();
        sc.nextLine();

        String fullname  =sc.nextLine();

        System.out.println("your name is " +name);
        System.out.println("your full name is " + fullname);

        for(int i = 0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i));
        }
        

       
    }
}

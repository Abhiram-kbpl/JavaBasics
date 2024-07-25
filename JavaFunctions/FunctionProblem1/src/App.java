
import java.util.Scanner;

public class App {

    public static void PrintName(String name ) {
        System.out.println("hello "+name);
    return;
        
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String name =sc.nextLine();
        
        PrintName(name);

        
    }
}

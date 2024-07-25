import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int [] number =new int[6];
       for(int i=0;i<6;i++){
       number[i] = sc.nextInt();
       }

       for(int i=0;i<6;i++){
        System.out.print(number[i]);
       }
      
    }
}


import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);

      System.out.print("ENTER THE NO U WANT TO SET ");
      int numb=sc.nextInt(); 
       int n =5;
       int pos=2;
       int bitmask=1<<pos;

       if(numb==1){
        int newnumb = n | bitmask ;
        System.out.println(newnumb);

       }else{
        int newbitmsk=~(bitmask);
        
        int newnumb =newbitmsk & n;
        System.out.println(newnumb);
        
       }

      
    }
}

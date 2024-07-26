import java.util.Scanner;

public class App {

    public static void main(String[] args)  {
        Scanner SC = new Scanner(System.in);

        System.out.println("enter the no of rows ");
        int row    = SC.nextInt();

        System.out.println("enter the no of colums ");
        int colums = SC.nextInt();

        //take input of rows and colums 

        int[][] number =new int[row][colums];

        //input
        
        for(int i =0;i<row;i++){
            for(int j = 0 ;j<colums;j++){
             number[i][j]= SC.nextInt();
            }
       
        }
        //print the values 
       
        for(int i =0;i<row;i++){
            for(int j = 0 ;j<colums;j++){
             System.out.print(number[i][j]);
            
            }
            System.out.println();
        }
        




        
    }
}

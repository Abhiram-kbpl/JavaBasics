public class App {
    public static void main(String[] args)  {
        //find the bit at 2nd postion 
        int n = 5 ;
        int pos =2 ;
        int bitmask = 1<<pos ;

        if((bitmask & n)==0){
            System.out.println("the bit was zero ");
        }
        else{
            System.out.println("the bit was one");
        }
        
    }
}

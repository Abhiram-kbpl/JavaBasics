public class App {
    public static void main(String[] args) {
        // Print a solid rectangle
        for(int i = 0; i < 4; i++) {
            System.out.println(); // Move to the next line after each row
            for(int j = 0; j < 4; j++) {
                System.out.print("*");
            }
        }
    }
}

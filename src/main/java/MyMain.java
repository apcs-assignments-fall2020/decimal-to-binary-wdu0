import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int bi_int = Integer.parseInt(binary);
        int i = 0;
        int ending = 0;
        int result = 0;

        while (bi_int > 0) {
            ending = bi_int % 10;
            ending *= Math.pow(2, i);
            bi_int /= 10;
            result += ending;
            i++;
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        String input = scan.next();

        System.out.println("That is equal to the decimal value: " + binaryToDecimal(input));
        scan.close();
    }
}

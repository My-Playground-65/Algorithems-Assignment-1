import java.util.Arrays;
import java.util.Scanner;

public class Algo6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str;

        do{

            System.out.print("Enter your sentence: ");
            str = scan.nextLine().strip();

        }while(str.isBlank());
        
        String[] arrOfStr = str.split("[^A-Za-z]+");
    
        for (int i = arrOfStr.length - 1; i >= 0 ; i--) {
            System.out.println(arrOfStr[i]);
        }
        
        
    }
}

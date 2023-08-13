import java.util.Scanner;

public class Algo7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String str;

        do{

            System.out.print("Enter your sentence: ");
            str = scan.nextLine().strip();

        }while(str.isBlank());
        
        String[] arrOfStr = str.split("[^A-Za-z]+");

        String longest = "";
        String smallest = arrOfStr[0];

        for (int i = 0; i < arrOfStr.length; i++) {
            String s = arrOfStr[i];
            if(s.length() >= longest.length()){
                longest = s;
            }
            if(s.length() <= smallest.length()){
                smallest = s;
            }   
        }
        
        System.out.println("Longest word :" + longest + ", Length = " + longest.length());
        System.out.println("Smallest word :" + smallest + ", Length = " + smallest.length());
    }
}

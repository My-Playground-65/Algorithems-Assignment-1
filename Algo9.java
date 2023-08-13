import java.util.Scanner;

public class Algo9 {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        boolean isValid = false;
        do{

            System.out.print("Enter a word : ");
            String str1 = scan.nextLine().strip();

            if(str1.isBlank()){
                System.out.println("Please enter a word");
                isValid = true;
            }else{
                String[] arrStr = str1.split("[^A-Za-z]+");
                String str2 = "";

                if(arrStr.length > 1){
                    System.out.println("Multiple words not accepted");
                    isValid = true;
                }else{

                    for (int i = str1.length() - 1; i >= 0 ; i--) {
                        str2 += str1.substring(i,i+1);
                    }

                    //System.out.println(str2);

                    if(str2.equals(str1)){
                        System.out.println("Word " + str1 + " is a palindrome");
                    }
                    isValid = false;
                }
            }
            



        }while(isValid);
    }
}

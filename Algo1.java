import java.util.Scanner;

public class Algo1{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        boolean isPositive = false;

        do{

            System.out.print("Enter your number : ");
            int num = scan.nextInt();
            scan.nextLine();

            if(num < 0){
               System.out.println("Please enter a positive integer"); 
               isPositive = true;
            }else{
                isPositive = false;

                int num1 = 0;
                String str = "01";
                //System.out.println(str.substring(0,1));

                for (int i = 0; i <= num+1; i++) {
                    if(i == 0 || i == 1){
                        continue;
                    }else{

                        num1 = Integer.parseInt(str.substring(i-2, i-1)) + Integer.parseInt(str.substring(i-1, i));
                        if(num1 <= num){
                            str += num1;
                        }else{
                            break;
                        }
                        
                    }
                }
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(str.charAt(i)+ " ");
                    
                }
                System.out.println();
                //System.out.printf("%dth term of the Fibonacci series: %s \n", num, str);
            }

        }while(isPositive);

    }
}
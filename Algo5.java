import java.util.Scanner;

public class Algo5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        boolean isAsccii = false;
        do{

            System.out.print("Enter a text : ");
            String str1 = scan.nextLine().strip();
            //System.out.println(str1.substring(4,5));
            

            if(str1.isBlank()){
                System.out.println("Please enter a text");
                isAsccii = true;
            }else{
                isAsccii = false;
                //Check all the chracters are ASCII 
                for(int c : str1.toCharArray()){
                    if((int)c > 127){
                        isAsccii = true;
                        break;
                    }
                }
                if(isAsccii){
                    System.out.println("Please enter only ASCII chracters");
                }else{
                    String str2 = "";

                    for (int i = str1.length() - 1; i >= 0 ; i--) {
                        str2 += str1.substring(i, i+1);
                    }
                    System.out.println(str2);
                }
                
            }



        }while(isAsccii);
    }
}

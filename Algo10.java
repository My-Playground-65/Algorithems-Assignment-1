import java.util.Arrays;
import java.util.Scanner;

public class Algo10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str1;

        boolean isValid = false;
        char[] char1;

        do{

            System.out.print("Enter your phone number : ");
            str1 = scan.nextLine().strip();

            if(str1.isBlank()){
                System.out.println("Telephone number can't be empty");
                isValid = true;
            }else{
                char1 = str1.toCharArray();

                for (int i = 0; i < char1.length; i++) {
                    char c = char1[i];
                    if(c == ' ' || c == '+' || c == '-'){
                        continue;
                    }else{
                        if(!Character.isDigit(char1[i])){
                            System.out.println("Invalid phone number");
                            isValid = true;
                            break;
                        }else{
                            isValid = false;

                            //Length
                            if(!(char1.length == 11) && !(char1.length == 15)){
                                System.out.println("Invalid phone number");
                                isValid = true;
                                break;
                            }else{

                                //STARTS WITH +94 OR 0
                                String str2 = new String(char1);

                                boolean b1 = str2.startsWith("+94");
                                boolean b2 = str2.startsWith("0");

                                if(!b1 && !b2){
                                    System.out.println("Invalid phone number");
                                    isValid = true;
                                    break;
                                }else{

                                    //CHECK THE 3RD CHARACTER

                                    boolean b3 = str2.charAt(3) == ' ';
                                    boolean b4 = str2.charAt(3) == '-';

                                    if(b1){
                                        if(!b3){
                                            System.out.println("Invalid phone number");
                                            isValid = true;
                                            break;
                                        }else{

                                            //CHECK THE OTHER WHITE SPACES

                                            boolean b5 = str2.charAt(6) == ' ' && str2.charAt(10) == ' ';
                                            if(!b5){
                                                System.out.println("Invalid phone number");
                                                isValid = true;
                                                break;
                                            }else{
                                                //CHECK THE NUMBER SETS
                                                String[] arrStr1 = str2.split(" ");
                                                boolean b6 = arrStr1[1].length() == 2 && arrStr1[2].length() == 3 && arrStr1[3].length() == 4;
                                                if(!b6){
                                                    System.out.println("Invalid phone number");
                                                    isValid = true;
                                                    break;
                                                }else{
                                                    System.out.println("Number is validted");
                                                    break;

                                                }

                                            }
                                        }
                                    }else{
                                        if(!b4){
                                            System.out.println("Invalid phone number");
                                            isValid = true;
                                            break;
                                        }else{
                                            System.out.println("Number is validted");
                                            break;
                                        }
                                    }
                                }
                            }

                            

                        }
                    }
                }
                //!IGNORE THIS PART- TRIAL AND ERROR
                //Length

                // if(!isValid){


                //     if(!(char1.length == 11) && !(char1.length == 15)){
                //     System.out.println("Invalid phone number");
                //     }else{
                //     System.out.println("Number is validted");

                //     //STARTS WITH +94 OR 0
                //     String str2 = new String(char1);
                //     System.out.println(str2);

                //     boolean b1 = str2.startsWith("+94");
                //     boolean b2 = str2.startsWith("0");

                //     if(!b1 && !b2){
                //         System.out.println("Invalid phone number");
                //     }else{
                //         System.out.println("Number is validted");

                //         //CHECK THE 3RD CHARACTER

                //         boolean b3 = str2.charAt(3) == ' ';
                //         boolean b4 = str2.charAt(3) == '-';

                //         if(b1){
                //             if(!b3){
                //                 System.out.println("Invalid phone number");
                //             }else{
                //                 System.out.println("Number is validted");

                //                 //CHECK THE OTHER WHITE SPACES

                //                boolean b5 = str2.charAt(6) == ' ' && str2.charAt(10) == ' ';
                //                 if(!b5){
                //                     System.out.println("Invalid phone number");
                //                 }else{
                //                     //CHECK THE NUMBER SETS
                //                     String[] arrStr1 = str2.split(" ");
                //                     System.out.println(Arrays.toString(arrStr1));
                //                     boolean b6 = arrStr1[1].length() == 2 && arrStr1[2].length() == 3 && arrStr1[3].length() == 4;
                //                     if(!b6){
                //                         System.out.println("Invalid phone number");
                //                     }else{
                //                         System.out.println("Number is validted");
                //                     }

                //                }
                //             }
                //         }else{
                //             if(!b4){
                //                 System.out.println("Invalid phone number");
                //             }else{
                //                 System.out.println("Number is validted");
                //             }
                //         }
                //     }
                // }

                // }
               


            }
            

        }while(isValid);

        




       

    }
}

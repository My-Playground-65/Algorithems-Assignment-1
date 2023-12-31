import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Algo8 {
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6,-8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        //!Create unique numA--- This part done by before changing the numA = {5, 7, -2, 3, 4, 6,7}

        String str1 = "";

        for (int i = 0; i < numA.length; i++) {
           boolean isUnique = true;

           for (int j = 0; j < numA.length; j++) {
               if (numA[i] == numA[j]) {
                    if(j < i){
                        isUnique = false;
                        break;
                    }  
               }
           }

           if (isUnique) {
               str1 += numA[i] + " ";
           }
       }


       String[] arrStr = str1.split(" ");
       int[] unqA = new int[arrStr.length];

       for (int i = 0; i < arrStr.length; i++) {

            unqA[i]= Integer.parseInt((arrStr[i]));
       }
   

       //!numA ∩ numB

       String str2 = "";

       for (int i = 0; i < unqA.length; i++) {
            int k = unqA[i];

            for (int j = 0; j < numB.length; j++) {
                if(k == numB[j]){
                    str2 += k + ",";
                }
            }

       }
       str2 = str2.substring(0, str2.length()-1);
       System.out.println("numA ∩ numB = " + "[" + str2 + "]");


        //!numA ∪ numB
        
        String str3 ="";

        for(int i : unqA){
            str3 += i + " ";
        }
        

        for(int i : numB){
            str3 += i + " ";
        }

       
        //Need to remove duplicates from str3--- use HashSet method
        
        String[] arrOfStr = str3.split(" ");

        Set<String> setA = new HashSet<>();
        for (String str : arrOfStr) {
            setA.add(str);
        }
        //System.out.println(setA);
        System.out.println("numA \u222A numB = "+ setA);


        //!numA / numB = numA - numB

        String str4 = "";
        loop:
        for (int i = 0; i < unqA.length; i++) {
            int k = unqA[i];

            for (int j = 0; j < numB.length; j++) {
                if((k == numB[j])){
                    continue loop;
                }
            }
            str4 += k + ",";

        }
        str4 = str4.substring(0, str4.length()-1);
        System.out.println("numA / numB = " + "[" + str4 + "]");
        

        //!numB / numA = numB - numA

        String str5 = "";
        loop:
        for (int i = 0; i < numB.length; i++) {
            int k = numB[i];

            for (int j = 0; j < unqA.length; j++) {
                if((k == unqA[j])){
                    continue loop;
                }
            }
            str5 += k + ",";

        }
        str5 = str5.substring(0, str5.length()-1);
        System.out.println("numB / numA = " + "[" + str5 + "]");
        

        //!numA △ numB


        String[] arrStr2 = str2.split(",");

        for (int i = 0; i < arrStr2.length; i++) {
            String s = arrStr2[i];

            for (int j = 0; j < setA.size(); j++) {
                if(setA.contains(s)){
                    setA.remove(s);
                }
            }
        }
        System.out.println(("numA \u25B3 numB = " + setA));


        

       


        
        


    }

   

}

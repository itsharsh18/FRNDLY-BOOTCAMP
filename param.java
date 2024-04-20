package functions;

import java.util.*;
public class param {
    
    public static  int sum(int digit1 , int digit2){
        return digit1 + digit2;
    }

    public static boolean checker(int returnedValue , int checkMe){
          // v knew this 
       
        if(returnedValue == checkMe){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("gimme the values of val1");
        int val1 = sc.nextInt();
        System.out.println("gimme the values of val2");
       int val2 = sc.nextInt();

     int returnedValue =   sum(val1, val2);
     int checktheUserValue = val1+val2;


System.out.println(checker(returnedValue, checktheUserValue));


    }
}

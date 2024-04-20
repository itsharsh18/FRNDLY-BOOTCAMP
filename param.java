package functions;

import java.util.*;
public class param {
    
    public static  int sum(int digit1 , int digit2){
        return digit1 + digit2 +1;
    } //  this fucntion will return 8  taking digit 1 = 5 and digit 2 = 2 and 8 isliye coz we r adding one it so 5+2+1 = 8
// boolean is true or false  // false-->> 0  && true -->> 1

    public static boolean checker(int returnedValue , int checkMe){
          // v knew this 
       
        if(returnedValue == checkMe){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
    
        // user se vlaue leta hai that is scanner class theeke !!4
    

        Scanner  sc = new Scanner(System.in);
        System.out.println("gimme the values of val1");
        int val1 = sc.nextInt(); // whaterver value will take from user will assign it to val 1
        System.out.println("gimme the values of val2");
       int val2 = sc.nextInt(); // whaterver value will take from user will assign it to val 2

     int returnedValue =   sum(val1, val2);
     
     // returnedValue that is what v have to check its correct or not 
     
     int checktheUserValue = val1+val2; // correct answer 


System.out.println(checker(returnedValue,checktheUserValue ));


    }
}

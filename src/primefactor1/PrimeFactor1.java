/*
 * Prime Factorization - Have the user enter a number and find all Prime 
 * Factors (if there are any) and display them.
 */
package primefactor1;

import java.util.Scanner;

/**
 *
 * @author Dan Bennett
 */
public class PrimeFactor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter a number to determine it's Prime "
                + "Factors:");
        Scanner ip = new Scanner(System.in);
        int input = ip.nextInt();
        
        if(input < 1){
            System.out.println("The number you entered is less than 1 and has "
                    + "no factors");
        }else{
            System.out.println();
            System.out.println("The Prime Factors for "+ input + " are:");
            if(isPrime(input)){
                System.out.println(input);
            }else{
                for(int i=2; i <= input; i++){
                    if(input%i == 0 && isPrime(i)){
                        System.out.println(i);
                    }
                }
            }
        }
    }

    private static boolean isPrime(int x) {
        Boolean prime = true;
        
        for(int j=2; j <= x/2; j++){
            if(x%j == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    
}

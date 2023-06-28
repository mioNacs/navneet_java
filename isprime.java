import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number to check:");
        int m= inp.nextInt();
        if(isPrime(m)==true){
            System.out.println("Given number is prime.");
        }
        if(isPrime(m)==false){
            System.out.println("Given number is not prime.");
        }
    }    
    static boolean isPrime(int n){
        int c=2;
        if(n<=1)
        return false;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the OPERATION(pls enter spaces between operator and operands):");
        int x = inp.nextInt();
        char c = inp.next().charAt(0);
        int y = inp.nextInt();

        long result = calci(c,x,y);
        System.out.println("Result = "+ result );
        }

    static long calci(char ch, int a, int b){
        long result = 0;
        switch (ch) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
        }
        return result;
    }    
}

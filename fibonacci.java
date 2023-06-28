import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("Which position of fibonacci series you want to print out??");
        int nth = inp.nextInt();
        int count = 2;
        int temp;

        while(count<=nth){
        temp= b;
        b=a+b;
        a=temp;
        count++;
        }
        System.out.println("Number at position"+nth+"at the fibonacci sequence is "+ b);

    }
    
}
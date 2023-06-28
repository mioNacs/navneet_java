import java.util.Scanner;

public class largest 
{
    public static void main(String[] args) 
    {
        System.out.println("enter 3 numbers: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int max = a;

        if(b>max)
        max = b;
        if(c>max)
        max = c;
        
        System.out.println("Biggest number is: "+max);
    }
}
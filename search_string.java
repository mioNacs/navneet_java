import java.util.Scanner;

public class search_string{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String caser=inp.nextLine();

        System.out.println();
        System.out.println("which character do you want to find??(*case sensitive*)");
        char x=inp.nextLine().charAt(0);

        stringFind(caser,x);

    }

    static void stringFind(String main,char a){
        int n=0;
        if(main.length()==0){
            System.out.println("Please enter a string.");
            return;
        }

        for(int i=0;i<main.length();i++){
            if(a==main.charAt(i) && n==0){
                System.out.print("Character found at index "+ i);
                n=1;
            }
            else if(a==main.charAt(i) && n>0){
                System.out.print(" and "+i);
            }
        }
        if(n>0){
            System.out.println(".");
            return;
        }

        System.out.println("Character not in the provided String.");
        return;
    }
}
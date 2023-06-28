import java.util.Scanner;

public class case_check {
    public static void main(String[] args) {
        System.out.println("Enter a character (only 1st character would be analysed)");
        Scanner inp = new Scanner(System.in);
        
        char ch = inp.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Character is lower case.");
        }
        if(ch>='A' && ch<='Z'){
            System.out.println("Character is upper case.");
        }
        else{
            System.out.println("Not an alphabetical character.");
        }
    }
}

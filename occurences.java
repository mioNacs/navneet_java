import java.util.Scanner;

/**
 * occurences
 */
public class occurences {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the integer or sequence:");
        Long n = inp.nextLong();
        System.out.println("which digit's occurence do you want to know??");
        int digit = inp.nextInt();
        int count;

        for(count=0;n!=0;n/=10){
            int comp=(int)(n%10);
            if(comp==digit){
                count++;
            }
        }

        System.out.println(  digit+" occurs "+count+" times in the given Integer/sequence");
        
    }
}
import java.util.Scanner;

public class varargs {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        sum('+',433,32,332,44,33,242,34,342,32);
        inp.close();
    }

    static void sum(char x,int ...v){
        if (x=='+'){
        int sum = 0;
        for (int s : v){
            sum += s;
        }
        System.out.println(sum);
    }
}

}

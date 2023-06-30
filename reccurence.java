import java.util.Scanner;

public class reccurence{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("How many elements do you have?");
        int x= inp.nextInt();
        int[] nums = new int[x];
        System.out.println();
        System.out.println("enter the numbers:");
        for(int i=0;i<x;i++){
            nums[i] = inp.nextInt();
        }

        reccurences(nums);

    }

    static void reccurences(int[] ints){
        int n = ints.length;
        int k=0;
        int min=0;
        int[] dup=new int[n];
        for(int i=0;i<n;i++){
            min=ints[i];
            for(int j=i;j<n;j++){
                if(ints[j]<min){
                    min=ints[j];
                    k=j;
                }
            }
            if(min!=ints[i]){
            swap(ints,i,k);
            }
        }

        dup[0]=ints[0];
        int j=1;
        k=n-1;
        for(int i=1;i<n;i++){
            min=ints[i];
            if(ints[i]==ints[i-1]){
                dup[k]=ints[i];
                k--;
            }
            else{
                dup[j]=ints[i];
                j++;
            }
        }
        for(int i=1;i<n;i++){
            if(dup[i]==dup[i-1] || dup[i]<dup[i-1]){
                k=i;
                break;
            }
        }

        int[] elem = new int[k];
        int[] recc = new int[k];

        min=0;
        for(int i=0;i<n;i++){
            if(i<k){
                elem[i]=dup[i];
                recc[i]=1;
            }
            if(i>=k && min<=k){
            for(j=0;j<k;j++){
                if(dup[n-(i-k)-1]!=elem[min]){
                    min++;
                }
                else{
                    break;
                }
            }                
                recc[min]++;
                if(dup[n-(i-k)-1]!=dup[n-(i-k)-2]){
                    min++;
                }
            }
        }


        System.out.println("There are "+k+" different elements entered.");
        for(int i=0;i<k;i++){
            if(recc[i]==1){
                System.out.println(elem[i]+" occurs only once.");
            }
            else{
                System.out.println(elem[i]+" reccurs "+recc[i]+" times in total.");
            }
        }
    }

    static void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
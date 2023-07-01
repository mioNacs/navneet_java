import java.util.Arrays;
import java.util.Scanner;

public class two_arrays_median {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter size of first array:");
        int[] arr1= new int[inp.nextInt()];
        System.out.println("enter elements:");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=inp.nextInt();
        }
        System.out.println();
        System.out.println("enter size of second array:");
        int[] arr2 = new int[inp.nextInt()];
        System.out.println("enter elements:");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=inp.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        double median = findMedian(arr1,arr2);

        System.out.println();
        System.out.println("Median of both the arrays is : "+ median);
        
    }

    static double findMedian(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int a=0;
        int b=0;
        double median;
        int[] arr= new int[n+m];

        for(int i=0;i<n+m;i++){
            if(a<n && b<m && nums1[a]<nums2[b]){
                arr[i]=nums1[a];
                a++;
            }
            else if(b<m){
                arr[i]=nums2[b];
                b++;
            }
            else if(a<n){
                arr[i]=nums1[a];
                a++;
            }
        }

        if((m+n)%2==0){
            median=(arr[((m+n)/2)-1]+arr[(m+n)/2]);
            median=median/2;
        }
        else{
            median=arr[(m+n-1)/2];
        }

        return median;

    }
    
}

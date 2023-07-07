import java.util.Scanner;

class ceiling_num{
    public static void main(String[] args) {
        int[] arrs = {2,3,5,9,14,16,18};
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter no to find: ");
        int find = inp.nextInt();

        finder(arrs,find);
        inp.close();
    }

    static void finder(int[] nums, int x){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==x){
                System.out.println("Index: "+mid+" -- "+nums[mid]);
                return;
            }
            else if(nums[mid]>x){
                end=mid-1;
            }
            else if(nums[mid]<x){
                start=mid+1;
            }
        }
        if(x>nums[mid]){
            System.out.println("Number not in array.");
            System.out.println("Floor of number is: Index: "+mid+" -- "+nums[mid]);
            return;
        }
        System.out.println("Number not in array.");
        System.out.println("Ceiling of number is: Index: "+mid+" -- "+nums[mid]);
        if(mid>0){
            System.out.println("Floor of number is: Index: "+(mid-1)+" -- "+nums[mid-1]);
        }
    }
}
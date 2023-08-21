import java.util.Scanner;

class infinite_array{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {13,15,20,23,24,25,32,34,36,43,53,56,64,65,66,78};
        System.out.print("which number do you want to find: ");
        int n= inp.nextInt();

        int a=find(arr,n);
        System.out.println(a);

        inp.close();
    }

    static int find(int[] nums, int target){
        int start=0;
        int end=1;
        while(target>nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(nums, target, start, end);
    }
    static int binarySearch(int[] nums, int x,int start,int end){
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==x){
                return mid;
            }
            else if(nums[mid]>x){
                end=mid-1;
            }
            else if(nums[mid]<x){
                start=mid+1;
            }
        }
        return -1;
    }
}
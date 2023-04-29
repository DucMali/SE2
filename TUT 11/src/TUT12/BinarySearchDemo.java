package TUT12;

public class BinarySearchDemo {
    static int binarySearch(int[] arr, int low, int high, int k ) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                return binarySearch(arr, low,mid-1,k);
            } else {
                return binarySearch(arr, mid +1,high,k);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,19,31,42,47,50,53,57,64,65,89,91};
        int high = arr.length-1;
        int low = 0;
        int k = 42;
        int goal = binarySearch(arr,low,high,k);
        if(goal== -1){
            System.out.println("Not Found!");
        }else{
            System.out.println("The key is found at: " + goal);
        }
    }
}

package TUT12;

public class SelectionSortDemo {
    static int[] selectionSort(int[] array) {
        int[] arrB = new int[array.length];
        for(int i=0;i< array.length;i++ ){
            int p = i;
            for(int j=i+1; j< array.length; j++){
                if(array[j]< array[p]){
                    p = j;
                }
            }
            arrB[i] =array[p];
            array[p] = array[i];
        }
        return arrB;
    }

    public static void main(String[] args) {
        int[] arr={3,6,1,9,56,34,22,67,39,91};
        System.out.println("The array before selection sort");
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
        arr = selectionSort(arr);
        System.out.println("The array after selection sort");
        for(int i: arr){
            System.out.print(i+ " ");
        }
    }
}

package Arrays;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        
        int arr [] = {1,2,3,4,5};
        swap(arr, 1,4); 

        System.out.println( "Array after swapping" + Arrays.toString(arr) );

    }

    static void swap (int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2] =temp;
    }
}

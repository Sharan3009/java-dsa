package sortingAlgorithms;

import CustomArray.ArrayUtils;

public class BubbleSort extends ArrayUtils {

    private int arr[];

    BubbleSort(int arr[]){
        super(arr);
        this.arr = arr;
        this.sort();
    }

    private void sort(){
        boolean sorted = false;
        int length = this.arr.length;
        while(sorted==false){
            sorted = true;
            for(int i=0;i<length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {12,32,34,34,23,123,123,12,432,43,45,345,345,34};
        BubbleSort bs = new BubbleSort(arr);
        bs.printArray();
    }
}

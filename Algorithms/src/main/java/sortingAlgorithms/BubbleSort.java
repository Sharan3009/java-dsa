package sortingAlgorithms;

import CustomArray.ArrayUtils;

public class BubbleSort extends ArrayUtils {

    private int arr[];

    BubbleSort(int arr[]){
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
}

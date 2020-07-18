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
        int i = 1;
        while(sorted==false){
            sorted = true;
            for(int j=0;j<length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    sorted = false;
                }
            }
            i++;
        }
    }

    public static void main(String args[]){
        int arr[] = {12,32,34,34,23,123,123,12,432,43,45,345,345,34};
        BubbleSort bs = new BubbleSort(arr);
        bs.printArray();
    }
}

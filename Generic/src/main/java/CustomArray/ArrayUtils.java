package CustomArray;

import static java.lang.System.*;

public class ArrayUtils {

    protected int arr[];

    public void printArray(){
        int length = arr.length;
        for(int i=0;i<length;i++){
            out.print(arr[i]);
            out.print(" ");
        }
        out.println();
    }
}

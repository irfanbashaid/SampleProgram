import java.util.*;
public class ArrayIncDec {
    
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};    
        int[] resArr = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        int index = 0;
        
        while(i<j){
            int pos;
            if(index%2 == 0){
                pos = j;
                j--;
            }
            else{
                pos = i;
                i++;
            }
            resArr[index++] = arr[pos]; 
        }
        int mid = arr.length/2;
        if(arr.length % 2 == 1) {
            resArr[index] = arr[mid];
        }
        else {
            resArr[index] = arr[mid-1];
        }
        
        System.out.println(Arrays.toString(resArr));
    }
}

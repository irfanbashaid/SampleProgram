import java.util.Arrays;
public class ArraySorting {
    public static void main(String[] args){
//        int[] arr1 =new int[]{3,6,9};
//        int[] arr2 =new int[]{8,7,5};
        int[] arr1 =new int[]{9, 9, 6, 3};
        int[] arr2 =new int[]{5, 7,7, 8, 9};

        if(arr1[0]>arr1[arr1.length-1]){ //descending
            sortArr(arr1,arr2);
        }
        else { //ascending
            sortArr(arr2,arr1);
        }
    }
    public static void sortArr(int[] arrDes, int[] arrAsc) {
        int[] resArr = new int[arrDes.length+arrAsc.length];
        int resIndex = 0;
        
        int j=0;
        int i=arrDes.length-1;
        
        while(j<arrAsc.length && i>=0){
            if(arrAsc[j] < arrDes[i]){ //ascending order
                if(resIndex==0 ||(resIndex>0 && resArr[resIndex-1] != arrAsc[j]))
                {
                    resArr[resIndex++] = arrAsc[j];
                }
                j++;
            }
            else if(arrAsc[j] == arrDes[i] ){
                if(resIndex==0 ||(resIndex>0 && resArr[resIndex-1] != arrAsc[j])) {
                    resArr[resIndex++] = arrAsc[j];
                }
                j++;
                i--;
            }
            else {
                if(resIndex==0 ||(resIndex>0 && resArr[resIndex-1] != arrDes[i])){
                    resArr[resIndex++] = arrDes[i];
                }

                i--;
            }
        }
        while(j<arrAsc.length){
            if(resIndex==0 ||(resIndex>0 && resArr[resIndex-1] != arrAsc[j])){
                resArr[resIndex++] = arrAsc[j];
            }
            j++;
        }
        while(i>=0) {
            if(resIndex==0 ||(resIndex>0 && resArr[resIndex-1] != arrDes[i])){
                resArr[resIndex++] = arrDes[i];
            }
            i--;
        }
        for(int index = 0; index<resIndex;index++ ){
            System.out.print(resArr[index]);
        }
    }
}

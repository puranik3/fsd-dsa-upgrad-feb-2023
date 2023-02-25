package quicksortex;

import java.util.Arrays;

public class QuickSortMedianPivot {

    private static int medianPivot(int[] arr, int low, int high){
        // take care not to find median if there are 1 / 2 numbers only (return high as pivot index)
        if( low == high || low + 1 == high ) {
            return high;
        }
//        high=arr.length-1;
        int l= arr[low];
        int h=arr[high];
        int cent=(low+high)/2;
        int mid=arr[cent];

        if((h>mid && h<l) || (h>l && h<mid)){
            return high;
        }
        if((mid>h && mid<l) || (mid>l && mid<h)){
            return mid;
        }
        return low;
    }


    private static void swap(int[] arr, int p1, int p2){
        int temp= arr[p1];
        arr[p1]=arr[p2];
        arr[p2]=temp;
    }

    private static int pivot(int[] arr, int low,int high){
        int pivotIndex=medianPivot(arr,low,high);
        swap(arr,pivotIndex,high);
        int p = arr[high]; // p is the value at the last index of the array
        int curr= low;
        for(int i=low; i<high; i++){
            if(arr[i]<p){
                swap(arr,curr,i);
                curr++;
            }
        }
        swap(arr,curr,high);
        return curr;

    }

    private static void medianQuickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        //partition and find the pivot position---> pivot function will also do this
        int pp= pivot(arr,low,high);
        medianQuickSort(arr,low,pp-1);
        medianQuickSort(arr,pp+1,high);
    }

    public static void main(String[] args) {
        int[] arr={4,1,8,9,3,8,1,5};
        System.out.println(Arrays.toString(arr));
        medianQuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}

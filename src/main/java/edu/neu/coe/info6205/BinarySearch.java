package edu.neu.coe.info6205;

public class BinarySearch {
    public static void main (String args[]){
        int[] ar = {1,2,3,4,5,6,7,8,9};
        int res = binarySearch(ar,0,ar.length-1,3);
        System.out.println(res);
    }


    static int binarySearch(int a[], int lo, int hi, int key)
    {
        //TODO:: implement binary search
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            int x = a[mid];
            if (key < x) hi = mid-1;
            else if (key > x) lo = mid+1;
            if (key == x) return mid;
        }
        return -1;

    }


}

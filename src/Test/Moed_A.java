package Test;

import java.util.Arrays;

public class Moed_A {

    public static void main(String[] args) {
        int[] a = {17, 9, 4, 8, -3, 1, 4};
        System.out.println(sod1(a,0));
        int[] b = {-5, -3, 0, 11, 13, 15, 18};
        System.out.println(sod1(b,0));
        int[] d = {7, 9, 2, 8, 3, 1};
        secret(d);
        System.out.println(Arrays.toString(d));
    }

    public static int sod1(int[] arr,int index) {
        if (index >= arr.length - 1)
            return -1;

        if (arr[index] > arr[index + 1])
            return index;

        return sod1(arr, index + 1);
    }

    public static void sod2(int[] arr, int k) {
        arr[k] = arr[k] + arr[k + 1];
        arr[k + 1] = arr[k] - arr[k + 1];
        arr[k] = arr[k] - arr[k + 1];
    }

    public static void secret(int[] arr) {
        int k = sod1(arr,0);
        while (k != -1) {
            sod2(arr, k);
            k = sod1(arr,0);
        }
    }

}

package com;

public class MergeSort {
    static void shell(int a[], int n) {
        for (int interval = n/2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = a[i];
                int j;
                for (j = i; j >= interval && a[j - interval] >
                        temp; j -= interval)
                    a[j] = a[j - interval];
                a[j] = temp;
            }
        }
    }

    void printArray(int a[], int n) {
        int i;
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

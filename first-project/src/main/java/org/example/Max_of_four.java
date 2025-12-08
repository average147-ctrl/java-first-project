package org.example;

public class Main {
    static void main() {
           int[] arr = {1, 5, 3, 9, 2};
           int max = arr[0];
           for (int i = 1; i < arr.length; i++) {
               if (arr[i] > max) {
                   max = arr[i];
               }
           }
           System.out.println(max);
           }
    }
}
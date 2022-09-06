package ProblemSolving;

// You have been given two integer arrays/list of size N and M, respectively.
// You need to print their intersection

public class ArrayIntersectionImpl {

    public static void intersection(int[] arr1, int[] arr2) {
        // Your code goes here
        mergeSort(arr1);
        mergeSort(arr2);
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }

    public static void mergeSort(int[] input) {
        int left = 0;
        int right = input.length;
        if (input.length <= 1) {
            return;
        }
        int mid = (left + right) / 2;
        int[] s1 = new int[mid];
        int[] s2 = new int[input.length - mid];
        for (int i = 0; i < mid; i++) {
            s1[i] = input[i];
        }
        for (int i = mid; i < input.length; i++) {
            s2[i - mid] = input[i];
        }
        mergeSort(s1);
        mergeSort(s2);
        merge(s1, s2, input);
    }

    public static void merge(int[] s1, int[] s2, int[] input) {
        int n1 = s1.length;
        int n2 = s2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (s1[i] < s2[j]) {
                input[k] = s1[i];
                k++;
                i++;
            } else {
                input[k] = s2[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            input[k] = s1[i];
            k++;
            i++;
        }
        while (j < n2) {
            input[k] = s2[j];
            k++;
            j++;
        }
    }
}

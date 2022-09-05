package Recursion;

public class QuickSortImpl {

    public static void quickSort(int[] input) {
        quickSortHelper(input, 0, input.length - 1);
    }

    public static void quickSortHelper(int[] input, int s, int e) {
        if (s >= e) {
            return;
        }
        int x = partition(input, s, e);
        quickSortHelper(input, s, x - 1);
        quickSortHelper(input, x + 1, e);
    }

    public static int partition(int[] input, int s, int e) {
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (input[i] <= input[s]) {
                count++;
            }
        }
        int temp = input[s + count];
        input[s + count] = input[s];
        input[s] = temp;
        int p = input[s + count];
        int pi = s + count;
        int i = s;
        int j = e;
        while (i < pi && j > pi) {
            if (input[i] <= p) {
                i++;
            } else {
                if (input[j] > p) {
                    j--;
                } else {
                    int t = input[j];
                    input[j] = input[i];
                    input[i] = t;
                    i++;
                    j--;
                }
            }
        }
        return pi;
    }
}
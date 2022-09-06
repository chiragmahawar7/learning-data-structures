package ProblemSolving;

// For a given array of size 'N,' find and return the 'Equilibrium Index' of the array/list.
// Equilibrium Index of an array/list is an index 'i' such that the sum of elements 
// at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]
public class EquilibriumIndexImpl {

    public static int arrayEquilibriumIndex(int[] arr) {
        int index = -1;
        if (arr.length == 0) {
            return index;
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int sumLeft = 0;
        int sumRight = total - arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (sumLeft == sumRight) {
                index = i;
                break;
            } else {
                if (i == arr.length - 1) {
                    break;
                }
                sumLeft = sumLeft + arr[i];
                sumRight = sumRight - arr[i + 1];
            }
        }
        return index;
    }
}

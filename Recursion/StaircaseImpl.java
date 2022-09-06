package Recursion;

// A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
// Implement a method to count how many possible ways the child can run up to the stairs.
public class StaircaseImpl {

    public static int staircase(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }
}

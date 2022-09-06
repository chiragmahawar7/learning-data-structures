package Recursion;

public class TowerOfHanoiImpl {

    public static void towerOfHanoi(int disks, char source, char aux, char destination) {
        if (disks == 0) {
            return;
        }
        if (disks == 1) {
            System.out.println(source + " " + destination);
            return;
        }
        towerOfHanoi(disks - 1, source, destination, aux);
        System.out.println(source + " " + destination);
        towerOfHanoi(disks - 1, aux, source, destination);
    }
}

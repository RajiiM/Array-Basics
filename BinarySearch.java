import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();

        int[] ar = { 10, 20, 30, 40, 50, 60, 80, 100, 120, 140 };
        System.out.println("Enter number to search");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == ar[mid]) {
                System.out.println("Found key at position: " + mid);
                break;
            } else if (key < ar[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        if (start > end) {
            System.out.println("Number is not found");
        }
    }
}

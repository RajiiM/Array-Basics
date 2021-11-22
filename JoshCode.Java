package arrayLearning;
 
import java.util.Scanner;
 
public class Array_Rotation {
 
    Scanner s = new Scanner(System.in);
    static int number_of_shift;
    static int array_length;
 
    public static void main(String[] args) {
        Array_Rotation a = new Array_Rotation();
 
        int[] array = a.print_get_input();
 
        number_of_shift = a.print_number_0f_shift();
 
        String left_or_right = a.print_choose_L_or_R();
 
        switch (left_or_right.toLowerCase()) {
        case "r":
            System.out.println("You have chosen Right Shift");
            a.print_rotate_right(array);
            break;
        case "l":
            System.out.println("You have chosen Left Shift");
            a.print_rotate_left(array);
            break;
        default:
            System.out.println("You have entered an incorrect option");
            a.print_choose_L_or_R();
            break;
        }
 
    }
 
    public int[] print_get_input() {
 
        System.out.println("Enter your array length(positive integer values):");
        array_length = s.nextInt();
 
        int[] my_array = new int[array_length];
 
        System.out.println("Enter your array vales: ");
        for (int i = 0; i < array_length; i++) {
            my_array[i] = s.nextInt();
        }
 
        System.out.println("Your array values :");
 
        for (int i = 0; i < array_length; i++) {
            System.out.print(my_array[i] + " ");
        }
 
        System.out.println();
        return my_array;
    }
 
    public int print_number_0f_shift() {
 
        System.out.println("Enter the number of shift( between 1 and " + (array_length - 1) + ")");
        int number = s.nextInt();
        return number;
 
    }
 
    public String print_choose_L_or_R() {
        System.out.println("Press 'r' to Rotate Right");
        System.out.println("Press 'l' to Rotate Left");
 
        String right_or_left = s.next();
 
        return right_or_left;
 
    }
 
    public void print_rotate_right(int[] a) {
 
        int[] temp = new int[number_of_shift];
 
        // Storing the array in temp variable
        for (int i = 0; i < number_of_shift; i++) {
            temp[i] = a[i];
        }
 
        /*
         * System.out.println("Temp values"); for (int i = 0; i < temp.length; i++) {
         * System.out.println("temp["+i+"]: "+temp[i]); }
         */
 
        // Shifting array
        for (int i = 0; i < a.length - number_of_shift; i++) {
            a[i] = a[i + number_of_shift];
 
        }
 
        for (int i = 0; i < number_of_shift; i++) {
            a[a.length - number_of_shift + i] = temp[i];
        }
 
        System.out.println("After Right Shift :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
 
    }
 
    public void print_rotate_left(int[] b) {
        System.out.println("Left shift");
 
        int[] temp = new int[array_length];
 
        // Storing the array in temp variable
 
        for (int i = 0; i < array_length; i++) {
            temp[i] = b[i];
        }
 
        /*
         * System.out.println("Temp values"); for (int i = 0; i < temp.length; i++) {
         * System.out.println("temp["+i+"]: "+temp[i]); }
         */
 
        // Shifting array
        for (int i = number_of_shift; i < b.length; i++) {
            b[i] = temp[i - number_of_shift];
 
        }
        for (int i = 0; i < number_of_shift; i++) {
 
            b[i] = temp[b.length - number_of_shift + i];
 
        }
 
        System.out.println("After Left Shift :");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
 
}
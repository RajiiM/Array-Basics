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

//------------------Srini code-------------------------//
https://sriniwithjava.wordpress.com/2021/11/19/array-concepts-left-and-right-shift-the-array-elements/

import java.util.Scanner;

public class ArrayShift {

	 
    public static void main(String[] args) {
         
        ArrayShift ac = new ArrayShift();
         
        ac.userinput(); 
        }
 
    private void userinput() {
        Scanner sc1 = new Scanner(
System.in
);
        int arrlen = 0;
        boolean startloop  = true;
        boolean startcontu = true;
 
        while(startloop)
        {
            startloop  = true;
            startcontu = true;
            System.out.println("Please enter number of Array Element");
            arrlen = sc1.nextInt();
            int[] arrl = new int[arrlen];
            for(int i = 0;i<arrl.length;i++)
            {
                System.out.println("Please enter your " + (i+1) + " Array list");
                arrl[i] = sc1.nextInt();
            }
         
           while(startcontu)
           {
               System.out.println("Please enter your shift option : ");
                System.out.println("1 for left shift 1 position ; 2 for right shift 1 position  ");
                System.out.println("3 for left shift 2 position ; 4 for right shift 2 position  ");
                int shiftopt = sc1.nextInt();
                switch(shiftopt)
                {
                case 1:
                    leftshift(arrl);
                    break;
                case 2:
                    rightshift(arrl);
                    break;
                case 3:
                    leftshift2(arrl);
                    break;
                case 4:
                    Rigthshift2(arrl);
                    break;
                default:
                    System.out.println("Please enter rigth option ");
                 
                }
 
                System.out.println("Want to continue with same array press '1' or Build new array press '5' or exit '9' ");
                int startcon= sc1.nextInt();
                if (startcon == 9)
                {
                    startloop = false;
                    startcontu = false;
                    System.out.println("Closeing Array Shift program");
                }
                else if(startcon == 5)
                {
                    startcontu = false;
                    System.out.println(" Bulding New array ");
                }
           }
        }
     
    }
    private void leftshift(int[] arri1) {
        System.out.println("left shift 1");
        System.out.println(" ");
        int[] arr = new int[arri1.length];
              arr = arri1;
         
        int temp = 0;
        temp = arr[0];
        for(int i = 0;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        for(int j = 0;j<arr.length;j++)
        {
            System.out.println("Left shift 1 Array["+j+"] = "+arr[j]);
        }
         
    }
    private void leftshift2(int[] arri2) {
 
        System.out.println("left shift 2");
        System.out.println(" ");
        int[] arr2 = new int[arri2.length];
              arr2 = arri2;
 
        int temp1 = 0;
        int temp2 = 0;
        temp1 = arr2[arr2.length-1];
        temp2 = arr2[arr2.length-2];
         
        for(int i = arr2.length-1;i>1;i--)
        {
            arr2[i] = arr2[i-2];
        }
         
        arr2[0] = temp2;
        arr2[1] = temp1;
         
        for(int j = 0;j<arr2.length;j++)
        {
            System.out.println("Left shift 2 Array["+j+"] = "+arr2[j]);
        }
    }
     
    private void Rigthshift2(int[] arr1) {
 
        System.out.println("Rigth shift 2");
        System.out.println(" ");
        int[] arr3 = new int[arr1.length];
              arr3 = arr1;
         
        int temp1 = 0;
        int temp2 = 0;
        temp1 = arr3[0];
        temp2 = arr3[1];
         
        for(int i = 0;i<arr3.length-2;i++)
        {
            arr3[i] = arr3[i+2];
        }
        arr3[arr3.length - 1] = temp2;
        arr3[arr3.length - 2] = temp1;
         
        for(int j = 0;j<arr3.length;j++)
        {
            System.out.println("Rigth shift 2 Array["+j+"] = "+arr3[j]);
        }
    }
 
    private void rightshift(int[] arr1) {
 
        System.out.println("Rigth shift 1");
        System.out.println(" ");
        int[] arr4 = new int[arr1.length];
              arr4 = arr1;
               
        int temp = 0;
        temp = arr4[arr4.length-1];
         
        for(int i = arr4.length-1;i>0;i--)
        {
            arr4[i] = arr4[i-1];
        }
        arr4[0] = temp;
         
        for(int j = 0;j<arr4.length;j++)
        {
            System.out.println("Rigth shift 1 Array["+j+"] = "+arr4[j]);
        }
    }
     
} 

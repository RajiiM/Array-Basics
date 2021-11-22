import java.util.Scanner;
 
public class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int len = sc.nextInt();
        int array[] = new int[len];
        int i;
         
        System.out.println("Enter array vales");
        for(i = 0;i<array.length;i++)
        {
            array[i] = sc.nextInt();
        }
         
        System.out.println("Before Sorting");
        for(i = 0;i<array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
         
        for(int j = 1; j<=array.length; j++)
        {
        for(i=0;i<(array.length-j);i++)
        {
            if(array[i]>array[i+1])
            {
                int temp=array[i];
                array[i]= array[i+1];
                array[i+1]=temp;
            }
        }
        }
     
        System.out.println("After Sorting");
        for(i = 0;i<array.length;i++)
        {
        System.out.print(array[i] + " ");
        }
        System.out.println();
         
        System.out.println("First highest number: " + array[array.length-1]);
        System.out.println("Second highest number: " + array[array.length-2]);
        System.out.println("Third highest number: " + array[array.length-3]);
        System.out.println("Fourth highest number: " + array[array.length-4]);
        System.out.println("Fifth highest number: " + array[array.length-5]);
    }
}
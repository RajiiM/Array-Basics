import java.util.Scanner;
 
public class SecondMin {
     
    Scanner sc = new Scanner(System.in);
    static
    {
        System.out.println("Enter array length");
    }
    int len = sc.nextInt();
    int array[] = new int[len];
    int i;
     
    public static void main(String[] args)
    {
        SecondMin demo = new SecondMin();
        demo.assignValue();
        demo.displayValue();
        demo.minValue();
    }
     
    public void assignValue()
    {
        System.out.println("Enter array values");
        for(i=0;i<array.length;i++)
        {
        array[i] = sc.nextInt();
        }
    }
     
    public void displayValue()
    {
        System.out.println("Display array values");
        for(i=0;i<array.length;i++)
        {
        System.out.println(array[i]);
        }
    }
     
    public void minValue()
    {
        int min = array[0];
        int secondMin = 0;
        for(i=1;i<array.length;i++)
        {
            if(min>array[i])
            {
                secondMin = min;
                min = array[i];
            }
            else if(secondMin>array[i])
            {
                secondMin = array[i];
            }
             
        }       
        System.out.println("Minimum value: " + min);
        System.out.println("Second minimum value: " + secondMin);               
    }
}
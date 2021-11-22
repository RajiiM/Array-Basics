import java.util.Scanner;
 
public class SecondMax {
     
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
        SecondMax demo = new SecondMax();
        demo.assignValue();
        demo.displayValue();
        demo.maxValue();
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
     
    public void maxValue()
    {
        int max = 0;
        int secondMax = 0;
        for(i=0;i<array.length;i++)
        {
            if(max<array[i])
            {
                secondMax = max;
                max=array[i];
            }
            else if(secondMax<array[i])
            {
                secondMax=array[i];
            }
        }
         
        System.out.println("Maximum value: " + max);
        System.out.println("Second maximum value: " + secondMax);
                 
    }
}
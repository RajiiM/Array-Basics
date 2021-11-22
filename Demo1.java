import java.util.Scanner;
 
public class Demo1 {
     
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
        Demo1 demo = new Demo1();
        demo.assignValue();
        demo.displayValue();
        demo.highValue();
        demo.lowValue();
        demo.divisorValue();
        demo.searchValue();
        demo.searchValue();     
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
     
    public void highValue()
    {
        int high = 0;
        for(i=0;i<array.length;i++)
        {
            if(high<array[i])
            {
                high=array[i];
            }
        }
         
        System.out.println("Highest value element: " + high);
                 
    }
     
    public void lowValue()
    {
        int low = array[0];
         
        for(i=1;i<array.length;i++)
        {
            if(low>array[i])
            {
                low=array[i];
            }
        }
         
        System.out.println("Lowest value element: " + low);
    }
     
    public void divisorValue()
    {
        System.out.println("Enter any number for check that number divide any array element");
        int divisor = sc.nextInt();
         
        for(i=0;i<array.length;i++)
        {
            if(array[i]%divisor==0)
            {
                System.out.println(divisor + ": This Number can divide the following array element " + array[i]);
            }
        }
    }
     
    public void searchValue()
    {
        System.out.println("Enter the search value");
        int search = sc.nextInt();
        boolean gotValue = false;
         
        for(i=0;i<array.length;i++)
        {
            if(search==array[i])
            {
                System.out.println("Search value is present");
                gotValue= true;
                break;
            }
        }
            if(gotValue == false)
            {
                System.out.println("Search value is not present");
            }   
    }   
}
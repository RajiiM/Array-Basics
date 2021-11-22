import java.util.Scanner;
 
public class StringSearch {
     
    Scanner sc = new Scanner(System.in);
    static
    {
        System.out.println("Enter array length");
    }
    int len = sc.nextInt();
    String array[] = new String[len];
    int i;
     
    public static void main(String[] args)
    {
        StringSearch demo = new StringSearch();
        demo.assignName();
        demo.displayName();
        demo.searchName();
        demo.searchName();      
    }
     
    public void assignName()
    {
        System.out.println("Enter names");
        for(i=0;i<array.length;i++)
        {
        array[i] = sc.next();
        }
    }
     
    public void displayName()
    {
        System.out.println("Display names");
        for(i=0;i<array.length;i++)
        {
        System.out.println(array[i]);
        }
    }
     
    public void searchName()
    {
        System.out.println("Enter the search person name");
        String search = sc.next();
        boolean gotValue = false;
         
        for(i=0;i<array.length;i++)
        {
            if(search.equals(array[i]))
            {
                System.out.println("Search person is present");
                gotValue= true;
                break;
            }
        }
            if(gotValue == false)
            {
                System.out.println("Search person is not present");
            }   
    }   
}
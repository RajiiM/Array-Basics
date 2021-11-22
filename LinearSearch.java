import java.util.Scanner;
 
public class LinearSearch {
     
    int a[] = {92, 87, 53, 10, 15, 63, 67};
    Scanner scanner_obj = new Scanner(System.in);
     
    public static void main(String[] args)
    {
        LinearSearch obj = new LinearSearch();
        obj.search_value();
         
    }
 
    public void search_value() 
    {
        System.out.println("Search the number ");
        int search = scanner_obj.nextInt();
        boolean got = false;
 
        for (int i = 0; i < a.length; i++) 
        {
            if (search == a[i]) {
                System.out.println("Present");
                got = true;
                break;
            }
        }
 
        if (got == false) 
        {
            System.out.println("Not Present");
        }
    }   
}
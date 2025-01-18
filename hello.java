import java.util.*;
public class Main
{
    static boolean mul(int arr[])
    {
        int max = arr[0], min = arr[0];
        for(int num: arr)
        {
            if(num>max)nmbk
            {
                max = num;
            }
            if(num<min)
            {
                min = num;
            }
        }
        if(max%min==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        boolean d = mul(array);
        System.out.println("Are min and max multiples of each other: " + d);
    } 
}

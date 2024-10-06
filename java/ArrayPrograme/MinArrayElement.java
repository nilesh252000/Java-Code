package ArrayPrograme;

import java.util.Scanner;

public class MinArrayElement 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size");
            int size=sc.nextInt();
            System.out.println("Enter "+size+" array elements");
            int arr[]=new int[size];
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Array elements are:");
            int min=arr[0];
            for(int i:arr)
            {
                System.out.print(i+" ");
                if(i<min)
                {
                    min=i;
                }
            }
            System.out.println("\n Minimum Number in Array Elements"+min);
            sc.close();
        }
        
    }
    
}

package ArrayPrograme;

import java.util.Scanner;

public class MaxArrayElement
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
            int max=arr[0];
            for(int i:arr)
            {
                System.out.print(i+" ");
                if(i>max)
                {
                    max=i;
                }
            }
            System.out.println(max);
            sc.close();
        }
        
    }
}

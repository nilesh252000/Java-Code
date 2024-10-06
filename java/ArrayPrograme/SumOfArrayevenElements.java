package ArrayPrograme;

import java.util.Scanner;

public class SumOfArrayevenElements 
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size");
            int size=sc.nextInt();
            System.out.println("Enter "+size+" array elements");
            int arr[]=new int[size];
            int i;
            for(i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            int sum=0;
            System.out.println("Array Elements are:");
            for( int j : arr)
            {
                System.out.print(j+" ");
                if((j&1)==0)
                sum=sum+j;
            }
            System.out.println("\nSum="+sum);
            sc.close();
        }
    }
}

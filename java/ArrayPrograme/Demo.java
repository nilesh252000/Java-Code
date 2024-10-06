package ArrayPrograme;

import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ente the Size");
            int Size=sc.nextInt();
            int arr[]=new int[Size];
            System.out.println("Enter "+Size+" array elements:");
            int i;
            for(i=0;i<Size;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Array Elements are:");
            //for(int j:arr)
            //{
              //System.out.println(j);
            //}
            for(int j=0;j<Size;j++)
            {
                System.out.println(arr[j]);

            }
        }
    
        
    }
    

    
}
package ArrayPrograme;

import java.util.Scanner;

public class primenumbersarray
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" array elements:");
        
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Array elements are:");
        for(int i : arr)
            System.out.print(i+" ");
            
        System.out.println("\nPrime elements are:");
        for(int i : arr)
        {
            int j=1;
            int count=0;
            while(j<=i){
                if(i%j==0)
                {
                    count++;
                }
                j++;   
            }
            if(count==2)
                System.out.print(i+" ");
            
        }
        sc.close();
    }
        
    }
    

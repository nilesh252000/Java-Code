package ArrayPrograme;

import java.util.Scanner;

public class Array 
{
 public static void main(String[] args)
 {
    //int arr[]={1,2,3};
    //for(int i=0;i<3;i++)
    //{
        //System.out.println(arr[i]);
    //}
    //int arr[];
    //arr=new int[]{1,2,3,4,5};
    //for(int i=0;i<5;i++)
    //System.out.println(arr[i]);

    //Without initilization except User Input Initilization
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Size");
    int Size=sc.nextInt();
    int arr[]=new int[Size];
    for(int i=0;i<Size;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("Elemrnts of array");
    for(int i:arr)
    {
        System.out.print(i);
    }
    sc.close();
    



 }   
}

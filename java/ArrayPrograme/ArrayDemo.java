package ArrayPrograme;
import java.util.Scanner;
public class ArrayDemo
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
        int sum=0;
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
            sum=sum+arr[i];
        }
        System.out.print("\n"+sum);
        int sum1=0;
        System.out.println("Array elements are:");
        for(int i : arr)
        {
            System.out.print(i+" ");
            sum1=sum1+i;
        }
        System.out.println("Sum Of array="+sum);
        int avg=sum/arr.length;
        System.out.println(avg);
        sc.close();

    }
    
    
}

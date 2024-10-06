package classMethodsinJavaPrograme;
import java.util.Scanner;
public class Methodwithoutargumentwithoutreturnvalue
{
    public void PrimeNumber()
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                 count++;
            }
        }
        if(count==2)
        {
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not Prime");
        }
        sc.close();
    }
    /*public void add()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Addition "+sum);
        sc.close();*/
   // }
    public static void main(String[] args) 
    {
        Methodwithoutargumentwithoutreturnvalue d=new Methodwithoutargumentwithoutreturnvalue();
        //d.add();
        d.PrimeNumber();
    }
}

    


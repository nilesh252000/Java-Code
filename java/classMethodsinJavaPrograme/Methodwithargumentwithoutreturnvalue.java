package classMethodsinJavaPrograme;
import java.util.Scanner;

public class Methodwithargumentwithoutreturnvalue
{
    public void ArmstrongNumber(int num1)
    {
        int sum=0,rem;
        int temp=num1;
        int count=0;
        int t=num1;
        while (t>0)
        {
            
            count++;
            t=t/10;
        }
        while (num1>0)
        {
             rem=num1%10;
             sum+=Math.pow(rem, count);
             num1=num1/10;
        }
        if(temp==sum)
        {
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is Not Armstrong Number");
        }


    } 
    /*public  void add(int num1,int num2)
    {
        int result=num1+num2;
        System.out.println("Addition "+result);

    }*/
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        Methodwithargumentwithoutreturnvalue d=new Methodwithargumentwithoutreturnvalue();
        d.ArmstrongNumber(num);
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        Methodwithargumentwithoutreturnvalue d=new Methodwithargumentwithoutreturnvalue();
        d.add(a,b);*/
        sc.close();
        
    }
}

package classMethodsinJavaPrograme;

import java.util.Scanner;

public class Methodwithoutargumentwithreturnvalue 
{
    public int  add()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The First Number");
            int a=sc.nextInt();
            System.out.println("Enter The Second Number");
            int b=sc.nextInt();
            int sum=a+b;
            return sum;
        }
    
    }
    public static void main(String[] args)
    {
        Methodwithoutargumentwithreturnvalue f=new Methodwithoutargumentwithreturnvalue ();
        //int result=f.add();
        System.out.println("Addition is:"+f.add());
    }
    
}

package classMethodsinJavaPrograme;

import java.util.Scanner;

public class Methodwithargumentwithreturnvalue 
{
    public static int  add(int num1,int num2)
    {
        int sum=num1+num2;
        return sum;
       
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The FirstNumber");
        int a=sc.nextInt();
        System.out.println("Enter The SecondNumber");
        int b=sc.nextInt();
        //Methodwithargumentwithreturnvalue wr= new Methodwithargumentwithreturnvalue ();
       //int result=wr.add(a, b);
       System.out.println("Addition is:"+Methodwithargumentwithreturnvalue.add(a,b));
       sc.close();
        

        
    }
    
}

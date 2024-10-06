package classMethodsinJavaPrograme;

import java.util.Scanner;

public class MethodDemo 
{
    public static void add()
    {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;
        
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("Addition:"+sum);
        sc.close();
    }
    public static void main(String[] args) {
        add();
        //MethodDemo.add();
        //MethodDemo d=new MethodDemo();
        //d.add();
        System.out.println(Math.sqrt(1));
    }
    
}

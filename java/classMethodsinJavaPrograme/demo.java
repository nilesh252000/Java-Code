package classMethodsinJavaPrograme;

import java.util.Scanner;

public class demo
 {
    public void add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int a=sc.nextInt();
        double area=3.14*a*a;
        System.out.println("The area of the circle is: " + area);
        sc.close();
    }
    public static void main(String[] args) 
    {
        demo s=new demo();
        s.add();
    }
    
}

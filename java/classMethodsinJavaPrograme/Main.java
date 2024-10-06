package classMethodsinJavaPrograme;

import java.util.Scanner;

public class Main 
{
    public void swappingtwoNumber(int num1,int num2)
    {
        
        num1 = num1 * num2; // Step 1: Add both numbers
        num2 = num1 / num2; // Step 2: Subtract the new num1 (which is num1 + num2) from num2 to get the original num1
        num1 = num1 / num2;
        //return new int[]{num1,num2};
        System.out.println("Nume:"+num1+" Nume:"+num2); 

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Two Numbe");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("Num1: " + a + " Num2: " + b);
        Main s= new Main();
        s.swappingtwoNumber(a,b);
        //System.out.println(result[0]+" "+result[1]);
        sc.close();   
    }
    
}

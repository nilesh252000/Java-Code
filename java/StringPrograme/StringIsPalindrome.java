package StringPrograme;

import java.util.Scanner;

public class StringIsPalindrome 
{
   public static void main(String[] args) 
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.next();
     //String str="Madam";
     str=str.toLowerCase();
     System.out.println(str);
     String str1="";
     for(int i=str.length()-1;i>=0;i--)
     {
        str1 = str1 + str.charAt(i);
        //String str2=str.charAt(i);
        //System.out.print(str1);

     }
    if(str.equals(str1))
     {
        System.out.println("String is Palindrome");

     }
     else
     {
        System.out.println("String is Not Palindrome");
     }
     sc.close();
     
   }
   
   
   

    
}

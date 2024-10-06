package StringPrograme;

public class ReverseString 
{
    public static void main(String[] args) {
        String str = "Hello";
        //System.out.println(str);
         //String str1 ="";
        //for(int i=str.length()-1;i>=0;i--){
            //System.out.println(str.charAt(i));
            // str1=str1+str.charAt(i);
        //}
         //str = str1;
         //System.out.println(str);

         for(int i=str.length()-1;i>=0;i--)
         {
            char ch=str.charAt(i);
            System.out.println(ch);
         }

         
    }
}
    


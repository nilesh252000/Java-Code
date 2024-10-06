package PatternProgrameuseNestedForloop;


public class Pattern3 
{
    public static void main(String[] args) 
    {
        int k=65;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(j<=i)
                {
                    System.out.print((char)k+++" ");
                }
                else
                {
                     System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        
    }
    
}

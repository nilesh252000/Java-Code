package PatternProgrameuseNestedForloop;

public class Pattern11 
{
    public static void main(String[] args) 
    {
        for(int  i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
        {
            // System.out.print("*");
            if(j<=i)
            {
                System.out.print(j);
            }
            else
            {
                System.out.print(" ");
            }
        }
        int k=0;
        for(int j=4;j>=1;j--)
        {
            // System.out.print("*");
            if(j<=i)
            {
                System.out.print(++k);
            }
            else
            {
                    System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}
    

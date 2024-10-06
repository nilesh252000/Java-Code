package PatternProgrameuseNestedForloop;
public class Pattern8 
{
    public static void main(String[] args) 
    {
        int k=10;
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=4;j++)
            {
                if(j<=i)
                {
                    System.out.print(k--+" ");
                }
                else
                {
                     System.out.print("");
                }
            }
            System.out.println("");
        }
    }
}

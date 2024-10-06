package PatternProgrameuseNestedForloop;

public class Pattern10 
{
    public static void main(String[] args) {
        for(int  i=4;i>=1;i--)
        {
            int k=0;
            for(int j=1;j<=4;j++)
            {
                // System.out.print("*");
        
                if(j>=i)
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

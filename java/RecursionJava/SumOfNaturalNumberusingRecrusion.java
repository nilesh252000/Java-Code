package RecursionJava;

public class SumOfNaturalNumberusingRecrusion
{
    public static int f1(int n) //1+2+3+4+5+6+7
    {
        if(n == 1) //Base case
            return 1;
        int sum = n + f1(n-1); //Recursive case
        return sum;
    }
    public static void main(String[] args)
    {
        int rs = f1(5);
        System.out.println(rs);
    }
    
}

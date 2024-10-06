package ArrayPrograme;

public class SingleDimensionalArrayy 
{
    public static void main(String[] args) 
    {
        int[]arr;
        arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        System.out.println("First array Elements");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Elements at Index"+i+":"+arr[i]);
        }
        int[]arr1={2,4,6,8,10};
        System.err.println("\nSecond array element");
        for(int i:arr1)
        {
            System.out.print(i+" ");
        }
        
    }
    
}

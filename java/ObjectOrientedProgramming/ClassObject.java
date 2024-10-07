package ObjectOrientedProgramming;

public class ClassObject //create UserDefined Class
{
    int age;//Data member - attribute- Instance vaiables
    String name;

    public void talk()//Memeber function - Instance method
    {
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }
    public static void main(String[] args)
    {
        ClassObject p1 = new ClassObject(); //Creating object
        // Person p3;
        // Person p3;
        //Person p1 = new Person(); //Creating object
        ClassObject p2 = new ClassObject(); //Creating object
        p1.age=25;
        p1.age=30;
        p1.name = "Hari";
        p1.talk();
        //p1.sleep();

        System.out.println("1st object Hash code:"+p1.hashCode());
        System.out.println("2nd object Hash code:"+p2.hashCode());
        
    }
    
}

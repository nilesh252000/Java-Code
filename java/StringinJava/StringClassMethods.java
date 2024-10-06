package StringinJava;

public class StringClassMethods 
{
    public static void main(String[] args) 
    {
        //length()
        //String str="Hello, World!";
        //int len=str.length();
        //System.out.println(len);

        //concat()
        //String s1="Radha";
        //String s2="Krishna";
        //String str=s1.concat(s2);
        //System.out.println(str);


       //charAt()
       //String str3=new String("hellow");
       //char ch=str3.charAt(5);
       //System.out.println(ch);
       //String s3=new String("hellow");
       //String s4=new String("ram");
       //boolean b=s3==s4;
       //System.out.println(b);

       //equals()
        /*String str1 = new String("r");
         String str2 = new String("r");
         boolean rs = str1.equals(str2);
         System.out.println(rs);
         System.out.println("After String Equals");
         if(rs==true)
         {
            System.out.println("Both String are Equals");
         }
         else
         {
            System.out.println("Both String are Not Equals");
         }
         System.out.println(str1.equals(str2));*/

        
        
         //equalsIgnoreCase()
         //String s=new String("r");
         //String s1=new String("r");
         //boolean b1=s.equalsIgnoreCase(s1);
         //System.out.println(b1);

         //6)compareTo()

         /*String str1="abk";
         String str2="Abk";
         int result=str1.compareTo(str2);
         if(result==0)
         {
            System.out.println("Both String are Equal");
         }
         else if(result>0)
         {
            System.out.println("First String is greater");

         }
         else
         {
            System.out.println("Second String is greater");
         }*/
        //String str1 = "abc";
        //String str2 = "abd";
        //String str3 = "ABC";
        //System.out.println(str1.compareTo(str3));
        //System.out.println(str1.compareTo(str2));
        //System.out.println(str2.compareTo(str1));

        //compareToIgnoreCase()
        //String str1 = "abc";
        //String str3 = "ABC";
        //System.out.println(str1.compareToIgnoreCase(str3));

        //startsWith()
        //String s = "Java Language ram";
        //System.out.println(s.startsWith("java"));
        //System.out.println(s.startsWith("J"));
        //System.out.println(s.startsWith("ram",14));

        //endsWith()
        //String s = "Java Language ram";
        //System.out.println(s.endsWith("Java"));
        //System.out.println(s.endsWith("Language"));
        //System.out.println(s.endsWith("ge"));

        //indexOf()
        //String str = "This is an index of an  is example";
        //System.out.println(str.indexOf('i'));
        //System.out.println(str.indexOf('y'));
        //System.out.println(str.indexOf('a',21));
        //System.out.println(str.indexOf("an"));
        //System.out.println(str.indexOf("as"));
        //System.out.println(str.indexOf("an",9));
        //System.out.println(str.indexOf("is",6));


        //lastIndexOf()
        //System.out.println(str.lastIndexOf('i'));
        //System.out.println(str.lastIndexOf("an"));
        //System.out.println(str.lastIndexOf("as"));

        //replace()
        //String str = "Java is high level language";
        //System.out.println(str);
        //String str1=str.replace('J', 'k');
        //System.out.println(str1);
        //String str2 = str.replace("Java","Python");
        //System.out.println(str2);

        //replaceAll()
       // String str1 = "abc123xyz456";
        //System.out.println(str1);
        //String s = str1.replaceAll("[0-9]","*");
        //System.out.println(s);
        // // String s = str1.replace("[0-9]","*");
        //String s1 = str1.replaceAll("[a-z]", "-");
        //System.out.println(s1);

        //substring()
        //String s = "Java Programming Language";
        //System.out.println(s.length());
        //String s2 = s.substring(1);
        //System.out.println(s2);
        //String s1 = s.substring(5,16);
        //System.out.println(s1);
        
        //toLowerCase()
        //String str1 = "JAVA";
        //System.out.println(str1);//python
        //String str3 = str1.toLowerCase();
        //System.out.println(str3);

        //toUpperCase()
        //String s = "java";
        //String str = s.toUpperCase();
        //System.out.println("Original String: "+s);
        //System.out.println("New String: "+str);


        //getChars()
        //String s = "Box is heavy";
        //char charArr[] = new char[s.length()];
        //s.getChars(0,3,charArr,0);
        //for(char i : charArr)
        //{
            //System.out.print(i);
        //}

        //getBytes()
        //String str = "Box is heavy";
        //System.out.println();
        //byte byteArr[] = str.getBytes();
        //for(byte b : byteArr)
        //{
            //System.out.print(b+" ");
        //}

        //format()
        //String str=String.format("Name:%s,Age:%d,Salary=%.2f","Nilesh",19,10.5 );
        //System.out.println(str);

        //join()
        //String[] words = {"dog","cat","rabbit","cow"};
        //String str = String.join("-",words);
        //System.out.println(str);

        //split()
        //String str1 = "Hello, Good, Morning";
        //String[] str2 = str1.split(" ");
        //for(String s : str2)
        //System.out.println(s+" ");

        //toCharArray()
        //String s = "Box is heavy,ram";
        //char charArr[] = s.toCharArray();
        //for(char i : charArr)
        //{
         //System.out.println(i+" ");
        //}

         //isEmpty
         //String str1 = "";
        //String str2 = "Hello";
        //System.out.println(str1.isEmpty());
        //System.out.println(str2.isEmpty());

        //trim():
        //String s = "   Java Language  ";
        //System.out.println("["+s+"]");
        //String s1 = s.trim();
        //System.out.println("["+s1+"]");

        //String str="ram";
        //String str2="";
        //for(int i=str.length()-1;i>=0;i--)
        //{
         //System.out.print(str.charAt(i));
         //System.out.println(str2=str2+str.charAt(i));
        }
      }



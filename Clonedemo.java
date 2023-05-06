

class Clonedemo
{
    public static void main(String Arg[])
    {
        try
        {
            student obj1 = new student("akanksha",85,25);
            student obj2 = (student)obj1.clone();

            System.out.println("name : "+obj1.name);
            System.out.println("marks : "+obj1.marks);
            System.out.println("age : "+obj1.age);


            System.out.println("name : "+obj2.name);
            System.out.println("marks: "+obj2.marks);
            System.out.println("age : "+obj2.age);
        }
        catch(Exception obj)
        {}

        }
        

    } 
class student implements Cloneable
{
    public String name;
    public int marks;
    public int age;
    public student(String str,int a,int b)
    {
        this.name = str;
        this.marks = a;
        this.age = b;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}




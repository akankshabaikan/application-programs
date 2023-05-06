




class Final2
{
    public static void main(String Arg[])

    {



    }
}

class base
{
    public void fun()
    {
        System.out.println("base fun");
    }
    final public void gun()
    {
        System.out.println("base gun");
    }


}

class derived extends base
{
    public void fun()
    {
        System.out.println("derived fun");
    }
    public void gun()
    {
        System.out.println("derived gun");
    }


}

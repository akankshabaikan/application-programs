

class Finalizeddemo
{
    public static void main(String A[])
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous(11,21);
        mobj1 = null;
        mobj2 = null;
        System.gc();
    
    }
}
class Marvellous
{
    public int no1;
    public int no2;
    public Marvellous()
    {
        System.out.println("inside default constructor");
        no1 = 0;
        no2 = 0;
    }
    public Marvellous(int a,int b)
    {
        System.out.println("inside parameterised constructor");
        no1 = a;
        no2 = b;
    }
    protected void finalize()
    {
        System.out.println("inside Finalized method");
    }

}


class A{
    void show()
    {
        System.out.println("PATRENT");
    }
}
class B extends A
{
    void show(){
        System.out.println("CHILD");
    }
    public static void main(Strinf args[])
    {
        B c=new B();
        c.show();
    }
}
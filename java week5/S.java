class A{
    A()
    {
        System.out.println("SUPER CLASS CONSTRUCTOR");
    }
    float pi=3.14f;
    void show()
    {
        System.out.println("SUPER METHOD");
    }
}
class S extends A
{
    S()
    {
        super();
        System.out.println("SUB CLASS CONSTRUCTOR");
    }
    float pi=222.21f;
    void show()
    {
        super.show();
        System.out.println("SUB CLASS METHOD"+pi);
        System.out.println(super.pi);
    }
    public static void main(String args[]){
        S m=new S();
        m.show();
    }

}
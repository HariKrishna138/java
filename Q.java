interface A{
    void sum();
}
interface B{
    void sub();
}
class Q implements A,B
{
    int a=12;
    int b=23;
    
    public void sum()
    {
        System.out.println("Result is"+(a+b));    
    }
    public void sub()
    {
        System.out.println("Result is"+(b-a));
    }
    public static void main(String args[]){
        Q w=new Q();
        w.sum();
        w.sub();
    }

}


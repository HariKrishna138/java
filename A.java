public class A{
    int z;
    public void display(){
        System.out.println("Outer class method");
    }
    static class B{
        public void show(){
            System.out.println("Static Inner class method");
        }
    }
    class C{
        public void put(){
            System.out.println("Non-Static Inner Class method");
        }
    }
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.display();
        A.C obj2 = obj1.new C();
        obj2.put();
        A.B obj3 = A.new B();
        obj3.show();
    }
}
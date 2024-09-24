import java.util.*;
abstract class area{
    abstract void square(int s);
    abstract void rectangle(int l,int b);
    abstract void triangle(int b,int h);
    abstract void circle(int r);
}
class areas{
    void square(int s){
        System.out.println("Area of square = "+(s*s));
    }
    void rectangle(int l,int b){
        System.out.println("Area of Rectangle = "+((l+b)*2));
    }
    void triangle(int b,int h){
        System.out.println("Area of triangle = "+((b*h)/2));
    }
    void circle(int r,float pi){
        System.out.println("Area of Circle"+(pi*r*r));
    }
    public static void main(String args[]){
        int a,b,c,d,e,f;
        final float pi=3.14f;
        areas r=new areas();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side:");
        a=sc.nextInt();
        System.out.println("Enter length and breadth:");
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Enter base and height:");
        d=sc.nextInt();
        e=sc.nextInt();
        System.out.println("Enter radius:");
        f=sc.nextInt();
        r.square(a);
        r.rectangle(b,c);
        r.triangle(d,e);
        r.circle(f,pi);
    }
}
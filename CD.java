import java.util.*;
import java.lang.*;
public class CD{
    public static void main(String args[]){
        int a[]={1,2,8,5,6,7};
        String b=null;
        int q=10;
        try{
            System.out.println(q/0);}
        catch(ArithmeticException e){
                System.out.println(e);}
        try{
          System.out.println(b.length());}
        catch(NullPointerException e){
            System.out.println(e);}
        try{
            System.out.println(a[55]);}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("AAAA");
        }
    }
    
}

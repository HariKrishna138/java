//EXCEPTIONS
public class DE {
    public static void main(String args[]){
        
        int a=10;
        try{
        System.out.println(a/0);
        }
        catch(Exception e){
            System.out.println("DIVISON BY ZERO IS NOT POSSIBLE");
        } 
        System.out.println(a+5);
    }
}

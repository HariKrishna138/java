//EXCEPTIOINS
import java.util.*;
public class  AB{
    public static void main(String args[]){
        try{
        String b=null;
        System.out.println(b.length());
        }
        catch(Exception e){
            System.out.println("CANNOT INVOKE LENGTH METHOD BECAUSE STRING IS NULL");
        }
    }
    
}

import java.util.*;
public class Exercise {    
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
        System.out.println("Original List: " +names);
        Set<String> my = new LinkedHashSet<>(names);
        Set<String> my1 = new TreeSet<>(my);
        System.out.println("Unique Names: "+my1);  
    }
}

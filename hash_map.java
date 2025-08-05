import java.util.*;
public class demo2 {
    public static void main(String[] args) {
        Map<Integer,String> m1 =  new HashMap<Integer,String>();
        m1.put(1,"Udemy");
        m1.put(2,"Youtube");
        m1.put(3,"Coursera");
        m1.put(4,"FreeCodeCamp");
        m1.put(5,"Discord");
        System.out.println(m1);
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        for(Map.Entry<Integer,String> n1:m1.entrySet()){
            System.out.println(n1);
        }

    }
}

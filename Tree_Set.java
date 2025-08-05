import java.util.*;
public class demo1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(22);
        set.add(33);
        set.add(44);
        set.add(55);
        set.add(66);
        Iterator<Integer> values = set.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
        int r = set.size();
        System.out.println(r);
    }
}

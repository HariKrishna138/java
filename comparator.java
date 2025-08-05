import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(29);
        list.add(32);
        list.add(46);
        list.add(50);
        Collections.sort(list, com);
        System.out.println(list);
    }

}

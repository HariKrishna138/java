import java.util.*;
enum day{
    morning,afternoon,evening,night;
}
public class enum2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time as  1.morning 2.afternoon 3.evening 4.night");
        int n = sc.nextInt();
        //day d;
        switch (n) {
            case 1: System.out.println("good " + day.morning); 
                break;
            case 2: System.out.println("good " + day.afternoon); 
                break;
            case 3: System.out.println("good " + day.evening); 
                break;
            default:
                    System.out.println("good " + day.night);
                break;
        }
        sc.close();
    }
}

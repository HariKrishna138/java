enum connection{
    established,maintenance,termination;
}
public class enum1{
    public static void main(String []args){
        connection c1[] = connection.values();
    connection c = connection.established;
    System.out.println(c);
    System.out.println(c.termination.ordinal());
    for(connection cc : c1){
        System.out.println(cc + " at index " + cc.ordinal());
    }
    }
}
public class BC{
    public static void main(String args[])
    {
        int a[]={1,2,8,5,6,7};
        try{
        System.out.println(a[11]);
        }
        catch(Exception e){
            System.out.println("ARRAY INDEX OUT OF RANGE");
        }
        System.out.println(a[2]);
    }
    
}

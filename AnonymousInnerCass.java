public class AnonymousInnerCass {
    public void show(){
        System.out.println("Base class Show Method");
    }
    public static void main(String args[]){
        AnonymasInnerCass obj = new AnonymasInnerCass()
        {
            public void show()
            {
                System.out.println("Inner class Show Method");
            }
        };
        obj.show();
    }    
}

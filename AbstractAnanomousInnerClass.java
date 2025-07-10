abstract class Abs {
    abstract public void show();
}
class AbstractAnonymousInnerCass{
    public static void main(String[] args) {
        Abs abs = new Abs() {
            public void show(){
                System.out.println("Abstract Anonymous Inner Class Method");
            }
        };
        abs.show();
    }
}
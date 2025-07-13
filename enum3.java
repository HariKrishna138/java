enum mobiles{
    vivo(18000),moto(16000),redmi(10000),iqoo(22000),realme(15500),poco(22000),oppo;
    private int price;
    private mobiles(int price){
        this.price=price;
    }
    private mobiles(){
        price = 26000;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}      
public class enum3 {
    public static void main(String args[]){
        for(mobiles mm : mobiles.values()){
            System.out.println(mm + " price: " + mm.getPrice());
        }
    }
}

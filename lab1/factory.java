package lab1;

public class factory{
    enum item{
        phone, laptop, tablet;
    }
    public final static String company_name = "TechCorp";
    private final int serial_number;
    private static int amount_produced = 0;
    private final item product_type;
    {
        amount_produced++;
        this.serial_number = amount_produced;
    }
    public factory(){
        this(item.phone);
    }
    public factory(item product_type){
        this.product_type = product_type;
}
public void checked(){
    System.out.println("Product " + serial_number + " was checked");
}
public void checked(String man){
    System.out.println("Product " + serial_number + " was checked by " + man);
}
public static void main(String args[]){
    factory f1 = new factory();
    factory f2 = new factory(item.laptop);
    factory f3 = new factory(item.tablet);
    f1.checked();
    f2.checked("Alice");
    f3.checked("Bob");
    System.out.println("Total products produced: " + amount_produced);
}
}
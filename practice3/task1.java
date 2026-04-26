package practice3;

class Animal{
    private String name;
    public Animal(){
        this.name = "Unknown";
    }
    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void info(){
        System.out.println("The animal is a/an " + this.name);
    }
}
class Cat extends Animal{
    private String characteristic;
    public Cat(){
        super();
        this.characteristic = "Fur";
    }
    public Cat(String name, String characteristic){
        super(name);
        this.characteristic = characteristic;
    }
    @Override    
    public void info(){
        super.info();
        System.out.println("The animal is a/an " + getName() + " and has " + this.characteristic);
    } 
    public void info(String characteristic){
        super.info();
        System.out.println("The animal is a/an " + getName() + " and has " + characteristic);
    }
    }
    public class task1{
        public static void main(String args[]){
            Cat cat1 = new Cat();
            cat1.info();
            Cat cat2 = new Cat("Siamese", "Blue eyes");
            cat2.info();
        }
    }
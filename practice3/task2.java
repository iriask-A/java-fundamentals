package practice3;

import java.util.*;
class Person{
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString(){
        return "Person[name = " +this.name + ", address = " + this.address + "]";
    }
}
class Student extends Person{
    private String program;
    private int year;
    private double fee;
    public Student(String name, String address, String program, int year, double fee){
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    public String getProgram(){
        return this.program;
    }
    public void setProgram(String program){
        this.program = program;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return this.fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    @Override
    public String toString(){
         return "Student[Person[name = " + getName() + ", address = " + getAddress() + "], program = " + this.program + ", year = " + this.year + ", fee = " + this.fee + "]";
    }

}
class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name,String address,String school,double pay){
        super(name,address);
        this.school = school;
        this.pay = pay;
    }
    public String getSchool(){
        return this.school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return this.pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    @Override
    public String toString(){
        return "Staff[Person[name = " + getName() + ", address = " + getAddress() + "], school = " + this.school + ", pay = " + this.pay + "]";

    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Person> list = new HashSet<>();
        
        while (true) {
            System.out.println("\n1. Add Person  2. Print All  3. Exit");
            int choice = in.nextInt();
            in.nextLine(); 

            if (choice == 1) {
                System.out.print("Type (1:Person, 2:Student, 3:Staff): ");
                int type = in.nextInt(); in.nextLine();
                
                System.out.print("Name: "); String name = in.nextLine();
                System.out.print("Address: "); String addr = in.nextLine();

                if (type == 1) {
                    list.add(new Person(name, addr));
                } else if (type == 2) {
                    System.out.print("Program: "); String prog = in.nextLine();
                    System.out.print("Year: "); int yr = in.nextInt();
                    System.out.print("Fee: "); double fee = in.nextDouble();
                    list.add(new Student(name, addr, prog, yr, fee));
                } else if (type == 3) {
                    System.out.print("School: "); String sch = in.nextLine();
                    System.out.print("Pay: "); double pay = in.nextDouble();
                    list.add(new Staff(name, addr, sch, pay));
                }
            } else if (choice == 2) {
                for (Person p : list) System.out.println(p);
            } else break;
        }
    }
}
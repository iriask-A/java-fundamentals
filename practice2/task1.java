package practice2;

import java.util.Scanner;
class Student{
    private String name;
    private int id;   
    private int yearOfStudy;
    public Student(String name, int id,int yearOfStudy){
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getYearOfStudy(){
        return yearOfStudy;
    }
    public void incrementYear(){
        this.yearOfStudy++;
    }


}
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter year of study: ");
        int yearOfStudy = scanner.nextInt();
        Student student = new Student(name, id, yearOfStudy);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Current Year of Study: " + student.getYearOfStudy());
        student.incrementYear();
        System.out.println("incremented Year of Study: " + student.getYearOfStudy());
        scanner.close();
    }
}
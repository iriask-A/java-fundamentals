package lab1;

import hw2.Student;
import java.util.*;

class Course {
    private String name, description, prerequisites;
    private int credits;

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Course: " + name + "\nDescription: " + description + "\nCredits: " + credits;
    }
}

class GradeBook {
    private Course course;
    private List<Student> students;
    private int[] grades; 

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = students;
        this.grades = new int[students.size()];
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void setGrade(int index, int grade) {
        this.grades[index] = grade;
    }

    public double determineClassAverage() {
        if (grades.length == 0) return 0.0;
        double total = 0;
        for (int g : grades) total += g;
        return total / grades.length; 
    }

    public void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] frequency = new int[11];
        for (int g : grades) {
            frequency[g / 10]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) System.out.print("  100: ");
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int stars = 0; stars < frequency[i]; stars++) System.out.print("*");
            System.out.println();
        }
    }

    public void displayGradeReport() {
        int lowG = grades[0], highG = grades[0];
        Student lowS = students.get(0), highS = students.get(0);

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < lowG) { lowG = grades[i]; lowS = students.get(i); }
            if (grades[i] > highG) { highG = grades[i]; highS = students.get(i); }
        }

        System.out.printf("\nClass average is %.2f. ", determineClassAverage());
        System.out.printf("Lowest grade is %d (%s).\n", lowG, lowS);
        System.out.printf("Highest grade is %d (%s).\n", highG, highS);
        outputBarChart();
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.getName();
    }
}

public class gradeBookTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Course myCourse = new Course("CS101 Object-oriented Programming and Design", "Java", 3, "None");
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("Student A", 1,1));
        students.add(new Student("Student B", 4,2));
        students.add(new Student("Student C", 3,3));
        students.add(new Student("Student D", 87,4));

        GradeBook myGB = new GradeBook(myCourse, students);
        myGB.displayMessage();

        System.out.println("\nPlease, input grades for students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + ": ");
            myGB.setGrade(i, input.nextInt());
        }

        myGB.displayGradeReport();
    }
}
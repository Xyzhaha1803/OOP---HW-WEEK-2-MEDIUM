/* Student Grading (Switch Statement). Create a Student class with name and marks. 
Write a method calculateGrade() that assigns a grade (A, B, C, D, F) based on marks using a switch or if-else 
ladder. Create 3 students and display their grades. */

class Student{
    String name;
    int marks;

    Student(String n, int m){
        this.name = n;
        this.marks = m;
    }

    public void calculateGrade(){
        System.out.print(name + "'s Grade: ");
        if (marks >= 90 && marks <= 100){
            System.out.println("A");
        } else if (marks >= 80 && marks < 90){
            System.out.println("B");
        } else if (marks >= 70 && marks < 80){
            System.out.println("C");
        } else if (marks >= 60 && marks < 70){
            System.out.println("D");
        } else if (marks >= 0 && marks < 60){
            System.out.println("F");
        } else {
            System.out.println("Error. Input valid marks.");
        }

        System.out.println(" ");
    }
}

public class Q03 {
    public static void main(String[] args){
        Student student1 = new Student("Mark", 85);
        Student student2 = new Student("Dylan", 65);
        Student student3 = new Student("Leland", 21);

        student1.calculateGrade();
        student2.calculateGrade();
        student3.calculateGrade();
    }
}

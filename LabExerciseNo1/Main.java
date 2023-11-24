package LabExerciseNo1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 2022, "September 15", "Computer Science");
        Instructor instructor = new Instructor("Mary", 1980, "June 10", 50000);

        System.out.println(student.toString());
        System.out.println(instructor.toString());

        student.setName("Johnny");
        instructor.setName("Marry");

        System.out.println(student.toString());
        System.out.println(instructor.toString());
    }
}
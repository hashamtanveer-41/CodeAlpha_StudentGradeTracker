import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students :");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        var students = new ArrayList<Student>();

        String name;

        for (int i = 0; i<numberOfStudents; i++){

            System.out.println("Enter the name of Student"+ (i+1) +" :");
             name = scanner.nextLine();

            System.out.println("Enter the Marks of Student"+ (i+1)+" :");
            int marks = scanner.nextInt();
            scanner.nextLine();

            students.add(new Student(name,marks));

        }

        System.out.println("\t\t Student Report");

        for (int i =0 ; i<students.size(); i++){
            Student student = students.get(i);
            System.out.println("The Student "+(i+1)+"-> Name: "+student.getName()+",Marks: "+ student.getMarks());
        }

        int obtainedMarks = 0;

        for (Student student : students) {
            obtainedMarks = obtainedMarks + student.getMarks();
        }

        System.out.println("\t\t Summary Report ");

        System.out.println("The obtained marks by all students are : "+ obtainedMarks);

        double average = (double) obtainedMarks /students.size();
        System.out.println("The average marks of Students are : "+average);

        students.sort(Comparator.naturalOrder());
        System.out.println("The Lowest marks are "+students.getFirst().getMarks()+" scored by Student "+students.getFirst().getName());

        students.sort(Comparator.reverseOrder());
        System.out.println("The Highest marks are "+students.getFirst().getMarks()+" scored by Student "+students.getFirst().getName());
    }
}


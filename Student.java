

public class  Student implements Comparable<Student> {

    private final String name;
    private final int marks ;



    @Override
    public String toString() {
        return "The Student ->" +name+", Marks"+marks ;
    }

    public String getName() {
        return name;
    }


    public int getMarks() {
        return marks;
    }

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.marks , o.marks);
    }
}
package ex1;

public class Student {

    String program;

    public Student(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                '}';
    }
}

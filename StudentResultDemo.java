import java.util.List;

class Student {
    private String name;
    private int rollNo;
    private List<Integer> marks;

    public Student(String name, int rollNo, List<Integer> marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.size();
    }

    public char calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }

    public void printResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentResultDemo {
    public static void main(String[] args) {
        List<Integer> marks = List.of(85, 90, 78, 92, 88);
        Student s1 = new Student("Alice", 101, marks);
        s1.printResult();
    }
}

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private  ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        System.out.println(this.grades);
        return this.grades;
    }

    public ArrayList<Integer> addGrade(int grade) {
        this.grades.add(grade);
        System.out.println(this.grades);
        return this.grades;

    }

    public double getGradeAverage() {
        int sum = 0;
       for (int grade : grades) {
           sum += grade;
       }
        return (double) sum / grades.size();
    }

}

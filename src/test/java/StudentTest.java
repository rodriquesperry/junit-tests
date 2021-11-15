import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class StudentTest {

    Student student;

    @Before
    public void setUpNewStudent() {
        student = new Student(42337L, "Rodriques");
    }

    @Test
    public void getIdTest() {
        assertEquals(42337, student.getId(), 0);
        assertNotEquals(" \"assertNotEquals()\" The unexpected id does match up with the actual id.",42338, student.getId(), 0);
    }

    @Test
    public void getNameTest() {
        assertSame("Rodriques", student.getName());
    }

    @Test
    public void gradesInitTest() {
        assertNotNull(student.getGrades());
    }

    @Test
    public void addGradeTest() {
        student.addGrade(100);
        assertEquals(1, student.getGrades().size(), 0);
        student.addGrade(90);
        assertEquals(2, student.getGrades().size(), 0);

    }

    @Test
    public void getGradeAverageTest() {
        student.addGrade(100);
        student.addGrade(90);
        assertEquals(95, student.getGradeAverage(), 0);
    }

    @Test
    public void updateGradeTest() {
        student.addGrade(100);
        student.addGrade(90);
        student.updateGrade(student.getGrades().indexOf(90), 95);
    }

    @Test
    public void deleteGradeTest() {
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(95);
        student.deleteGrade(student.getGrades().get(1));
    }
}
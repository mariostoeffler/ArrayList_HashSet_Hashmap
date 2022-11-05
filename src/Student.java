import java.util.Objects;

public class Student {

    public int matNr;
    public String fullName;

    public Student(int matNr, String fullName) {
        this.matNr = matNr;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matNr=" + matNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public int getMatNr() {
        return matNr;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matNr == student.matNr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matNr);
    }
}

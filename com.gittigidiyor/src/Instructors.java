import java.util.Objects;

public class Instructors {
    private String instructorName;
    private String instructorAdress;
    private long instructorPhone;

    public Instructors(String instructorName, String instructorAdress, long instructorPhone) {
        this.instructorName = instructorName;
        this.instructorAdress = instructorAdress;
        this.instructorPhone = instructorPhone;
    }

    public Instructors() {
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorAdress() {
        return instructorAdress;
    }

    public void setInstructorAdress(String instructorAdress) {
        this.instructorAdress = instructorAdress;
    }

    public long getInstructorPhone() {
        return instructorPhone;
    }

    public void setInstructorPhone(long instructorPhone) {
        this.instructorPhone = instructorPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instructors that = (Instructors) o;
        return instructorPhone == that.instructorPhone && Objects.equals(instructorName, that.instructorName) && Objects.equals(instructorAdress, that.instructorAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructorName, instructorAdress, instructorPhone);
    }

    @Override
    public String toString() {
        return "Instructors{" +
                "instructorName='" + instructorName + '\'' +
                ", instructorAdress='" + instructorAdress + '\'' +
                ", instructorPhone=" + instructorPhone +
                '}';
    }
}

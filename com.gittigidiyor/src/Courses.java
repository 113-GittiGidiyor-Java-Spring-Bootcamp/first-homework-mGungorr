import java.util.Objects;

public class Courses {
    private String courseName;
    private int courseCode;
    private int courseCreditPoint;

    public Courses() {
    }

    public Courses(String courseName, int courseCode, int courseCreditPoint) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseCreditPoint = courseCreditPoint;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseCreditPoint() {
        return courseCreditPoint;
    }

    public void setCourseCreditPoint(int courseCreditPoint) {
        this.courseCreditPoint = courseCreditPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courses courses = (Courses) o;
        return courseCode == courses.courseCode && courseCreditPoint == courses.courseCreditPoint && Objects.equals(courseName, courses.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, courseCode, courseCreditPoint);
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", courseCode=" + courseCode +
                ", courseCreditPoint=" + courseCreditPoint +
                '}';
    }
}

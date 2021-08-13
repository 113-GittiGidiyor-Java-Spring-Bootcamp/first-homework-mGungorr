import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private Date birthDate;
    private String adress;
    private Gender gender;

    public Student() {
    }

    public Student(String name, Date birthDate, String adress, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(birthDate, student.birthDate) && Objects.equals(adress, student.adress) && gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate, adress, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", adress='" + adress + '\'' +
                ", gender=" + gender +
                '}';
    }
}

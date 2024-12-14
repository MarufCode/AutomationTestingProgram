package src.oops_19_07;

public class Student implements Comparable <Student> {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student2) {
        return Integer.compare(this.id, student2.id);
    }
}

package task1;

import java.util.List;

public class Course {
    private String id;
    private String title;
    private String type;
    private List<Student> students;
    private String lecturer;

    public Course(String id, String title, String type, List<Student> students, String lecturer) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.students = students;
        this.lecturer = lecturer;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getId() {
        return id;
    }

    public int getNumberStudent(){
        return students.size();
    }

    public boolean practicalStudents(){
        return type.equals("Prac");
    }

    @Override
    public String toString() {
        return "task1.Course{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", students=" + students +
                ", lecturer='" + lecturer + '\'' +
                '}';
    }
}

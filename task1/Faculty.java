package task1;

import java.util.*;

public class Faculty {
    private String name;
    private String address;
    private List<Course> courses;

    public Faculty(String name, String address, List<Course> courses) {
        this.name = name;
        this.address = address;
        this.courses = courses;
    }

    public Course getMaxPracticalCourse() {
        Course course = null;
        int numberStudent = 0;
        for (Course cou : courses) {
            if (cou.practicalStudents()) {
                if (cou.getNumberStudent() > numberStudent) numberStudent = cou.getNumberStudent();
                course = cou;
            }
        }
        return course;
    }

    public Map<Integer, List<Student>> groupStudentsByYear() {
        Map<Integer, List<Student>> studentMap = new HashMap<>();
        for (Course course : courses) {
            for (Student student : course.getStudents()) {
                if (studentMap.containsKey(student.getYear())) {
                    studentMap.get(student.getYear()).add(student);
                } else {
                    List<Student> listStudentOfYear = new ArrayList<>();
                    listStudentOfYear.add(student);
                    studentMap.put(student.getYear(), listStudentOfYear);
                }
            }
        }
        return studentMap;
    }

    public Set<Course> filterCourses(String type) {
        Set<Course> set = new TreeSet<>(new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getStudents().size() - o2.getStudents().size();
            }
        });
        for (Course course : courses) {
            if (course.getType().equals(type)) set.add(course);
        }
        return set;
    }

    public static void main(String[] args) {
        List<Student> listStudentPractical = new ArrayList<>();
        listStudentPractical.add(new Student("1", "Nguyen Van a", 2003));
        listStudentPractical.add(new Student("2", "Nguyen Van b", 2004));
        listStudentPractical.add(new Student("3", "Nguyen Van c", 2003));

        List<Student> listStudentTheory = new ArrayList<>();
        listStudentTheory.add(new Student("4", "Phung Van d", 2003));
        listStudentTheory.add(new Student("5", "Phung Van e", 2004));
        listStudentTheory.add(new Student("6", "Phung Van f", 2003));
        listStudentPractical.add(new Student("7", "Phung Van g", 2004));

        List<Student> listStudentPrac2 = new ArrayList<>();
        listStudentPrac2.add(new Student("4", "Phung Van h", 2003));
        listStudentPrac2.add(new Student("5", "Phung Van i", 2004));
        listStudentPrac2.add(new Student("6", "Phung Van j", 2003));
        listStudentPractical.add(new Student("7", "Phung Van k", 2004));
        listStudentPractical.add(new Student("7", "Phung Van l", 2004));
        listStudentPractical.add(new Student("7", "Phung Van m", 2004));

        List<Course> listCourse = new ArrayList<>();
        listCourse.add(new Course("001", "K48", "Prac", listStudentPractical, "Thay Long"));
        listCourse.add(new Course("003", "K50", "Theory", listStudentTheory, "Thay Du"));
        listCourse.add(new Course("002", "K49", "Prac", listStudentPrac2, "Thay Linh"));

        Faculty it = new Faculty("task1.Faculty of Information technology", "DH Nong Lam TP.HCM", listCourse);

        Course res = it.getMaxPracticalCourse();
//        System.out.println(res.toString());

        Map<Integer, List<Student>> map = it.groupStudentsByYear();
//        System.out.println(map.toString());

        Set<Course> listCourses = it.filterCourses("Prac");
        System.out.println(listCourses.toString());
    }
}

package model;

public class Student implements Comparable<Student> {
    //Comparable trong java được sử dụng để sắp xếp các đối tượng của lớp do người dùng định nghĩa (user-defined). 
    //Giao diện này thuộc về gói java.lang và chỉ chứa một phương thức có tên compareTo(Object).
    private String id;
    private String studentName;
    private String semester;
    private String courseName;

    public Student() {
    }

    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public int compareTo(Student t) {
        return t.studentName.compareTo(this.studentName);
    }

    public void print() {
        System.out.printf("%-15s%-15s%-15s\n", studentName, semester, courseName);
    }
}
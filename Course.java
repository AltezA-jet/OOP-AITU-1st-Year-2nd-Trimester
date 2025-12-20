public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;
    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }
    public void addStudent(Student student, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = student;
        }
    }
    public double courseAverageGPA() {
        double totalGPA = 0.0;
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                totalGPA += student.getGpa();
                count++;
            }
        }
        return count == 0 ? 0.0 : totalGPA / count;
    }

    public Student highestCreditsStudent() {
        Student topStudent = null;
        for (Student student : students) {
            if (student != null) {
                if (topStudent == null || student.getCredits() > topStudent.getCredits()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{")
          .append("courseName='").append(courseName).append('\'')
          .append(", instructor='").append(instructor).append('\'')
          .append(", students=[");
        for (Student student : students) {
            if (student != null) {
                sb.append(student.toString()).append(", ");
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 2) == ',') {
            sb.setLength(sb.length() - 2); // Remove trailing comma and space
        }
        sb.append("]}");
        return sb.toString();
    }
}

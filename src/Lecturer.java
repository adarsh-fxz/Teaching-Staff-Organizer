public class Lecturer extends Teacher {
    private double gradedScore;
    private int yearsOfExperience;
    private String department;

    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            double gradedScore, int yearsOfExperience, String department) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.gradedScore = gradedScore;
        this.yearsOfExperience = yearsOfExperience;
        this.department = department;
    }

    public void gradeAssignment(double gradedScore2) {
        this.gradedScore = gradedScore2;
    }

    public String getGradedScore() {
        return String.valueOf(gradedScore);

    }

    public String getYearsOfExperience() {
        return String.valueOf(yearsOfExperience);
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "Teacher ID: " + getTeacherId() + ", Teacher Name: " + getTeacherName() + ", Address: " + getAddress()
                + ", Working Type: " + getWorkingType() + ", Employment Status: " + getEmploymentStatus()
                + ", Graded Score: " + gradedScore + ", Years of Experience: " + yearsOfExperience + ", Department: "
                + department;
    }
}
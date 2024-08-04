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

    public char gradeAssignment(double gradedScore) {
        if (gradedScore >= 70) {
            return 'A';
        } else if (gradedScore >= 60) {
            return 'B';
        } else if (gradedScore >= 50) {
            return 'C';
        } else if (gradedScore >= 40) {
            return 'D';
        } else {
            return 'E';
        }
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
        return super.toString() + ", Graded Score: " + gradedScore + ", Years of Experience: " + yearsOfExperience
                + ", Department: " + department;
    }
}
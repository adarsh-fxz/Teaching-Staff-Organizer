public class Tutor extends Teacher {

    private int workingHours;
    private double Salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;

    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus,
            int workingHours, double Salary, String specialization, String academicQualifications,
            int performanceIndex) {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.workingHours = workingHours;
        this.Salary = Salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
    }

    public void setSalary(double salary2) {
        this.Salary = salary2;
    }

    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours + ", Salary: " + Salary + ", Specialization: " + specialization
        + ", Academic Qualifications: " + academicQualifications + ", Performance Index: " + performanceIndex;
    }
}

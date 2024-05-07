class Teacher {

    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;

    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingType() {
        return workingType;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public String toString() {
        return "Teacher ID: " + teacherId + ", Teacher Name: " + teacherName + ", Address: " + address
                + ", Working Type: " + workingType + ", Employment Status: " + employmentStatus;
    }
}
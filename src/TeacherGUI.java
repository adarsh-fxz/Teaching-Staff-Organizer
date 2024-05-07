import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TeacherGUI {
    private ArrayList<Teacher> teachers;
    private JFrame frame;

    private JLabel teacherIdLabel, teacherNameLabel, addressLabel, workingTypeLabel, employmentStatusLabel,
            workingHoursLabel, departmentLabel, yearsOfExperienceLabel, gradedScoreLabel, salaryLabel,
            specializationLabel, academicQualificationsLabel, performanceIndexLabel;

    private JTextField teacherIdField, teacherNameField, addressField, workingTypeField, employmentStatusField,
            workingHoursField, departmentField, yearsOfExperienceField, gradedScoreField, salaryField,
            specializationField, academicQualificationsField, performanceIndexField;

    private JButton addLecturer, addTutor, gradeAssignments, setSalaryOfTutor, removeTutor, display, clear;

    public TeacherGUI() {
        teachers = new ArrayList<>();

        frame = new JFrame("Teaching Staff Organizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 720);
        frame.setVisible(true);
        frame.setLayout(null);

        Font font = new Font("Arial", Font.PLAIN, 18);

        JLabel title = new JLabel("Details of Teachers");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(450, 20, 300, 30);
        title.setFont(new Font("Arial", Font.BOLD, 25));
        frame.add(title);

        teacherIdLabel = new JLabel("Teacher ID:");
        teacherIdLabel.setBounds(120, 100, 100, 30);
        teacherIdLabel.setFont(font);

        teacherIdField = new JTextField(20);
        teacherIdField.setBounds(300, 100, 200, 30);
        teacherIdField.setFont(font);

        frame.add(teacherIdLabel);
        frame.add(teacherIdField);

        teacherNameLabel = new JLabel("Teacher Name:");
        teacherNameLabel.setBounds(120, 150, 150, 30);
        teacherNameLabel.setFont(font);

        teacherNameField = new JTextField(20);
        teacherNameField.setBounds(300, 150, 200, 30);
        teacherNameField.setFont(font);

        frame.add(teacherNameLabel);
        frame.add(teacherNameField);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(120, 200, 100, 30);
        addressLabel.setFont(font);

        addressField = new JTextField(20);
        addressField.setBounds(300, 200, 200, 30);
        addressField.setFont(font);

        frame.add(addressLabel);
        frame.add(addressField);

        workingTypeLabel = new JLabel("Working Type:");
        workingTypeLabel.setBounds(120, 250, 150, 30);
        workingTypeLabel.setFont(font);

        workingTypeField = new JTextField(20);
        workingTypeField.setBounds(300, 250, 200, 30);
        workingTypeField.setFont(font);

        frame.add(workingTypeLabel);
        frame.add(workingTypeField);

        employmentStatusLabel = new JLabel("Employment Status:");
        employmentStatusLabel.setBounds(120, 300, 200, 30);
        employmentStatusLabel.setFont(font);

        employmentStatusField = new JTextField(20);
        employmentStatusField.setBounds(300, 300, 200, 30);
        employmentStatusField.setFont(font);

        frame.add(employmentStatusLabel);
        frame.add(employmentStatusField);

        gradedScoreLabel = new JLabel("Graded Score:");
        gradedScoreLabel.setBounds(120, 350, 150, 30);
        gradedScoreLabel.setFont(font);

        gradedScoreField = new JTextField(20);
        gradedScoreField.setBounds(300, 350, 200, 30);
        gradedScoreField.setFont(font);

        frame.add(gradedScoreLabel);
        frame.add(gradedScoreField);

        yearsOfExperienceLabel = new JLabel("Years of Experience:");
        yearsOfExperienceLabel.setBounds(120, 400, 200, 30);
        yearsOfExperienceLabel.setFont(font);

        yearsOfExperienceField = new JTextField(20);
        yearsOfExperienceField.setBounds(300, 400, 200, 30);
        yearsOfExperienceField.setFont(font);

        frame.add(yearsOfExperienceLabel);
        frame.add(yearsOfExperienceField);

        departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(120, 450, 200, 30);
        departmentLabel.setFont(font);

        departmentField = new JTextField(20);
        departmentField.setBounds(300, 450, 200, 30);
        departmentField.setFont(font);

        frame.add(departmentLabel);
        frame.add(departmentField);

        workingHoursLabel = new JLabel("Working Hours:");
        workingHoursLabel.setBounds(680, 100, 150, 30);
        workingHoursLabel.setFont(font);

        workingHoursField = new JTextField(20);
        workingHoursField.setBounds(880, 100, 200, 30);
        workingHoursField.setFont(font);

        frame.add(workingHoursLabel);
        frame.add(workingHoursField);

        salaryLabel = new JLabel("Salary:");
        salaryLabel.setBounds(680, 150, 100, 30);
        salaryLabel.setFont(font);

        salaryField = new JTextField(20);
        salaryField.setBounds(880, 150, 200, 30);
        salaryField.setFont(font);

        frame.add(salaryLabel);
        frame.add(salaryField);

        specializationLabel = new JLabel("Specialization:");
        specializationLabel.setBounds(680, 200, 150, 30);
        specializationLabel.setFont(font);

        specializationField = new JTextField(20);
        specializationField.setBounds(880, 200, 200, 30);
        specializationField.setFont(font);

        frame.add(specializationLabel);
        frame.add(specializationField);

        academicQualificationsLabel = new JLabel("Academic Qualifications:");
        academicQualificationsLabel.setBounds(680, 250, 200, 30);
        academicQualificationsLabel.setFont(font);

        academicQualificationsField = new JTextField(20);
        academicQualificationsField.setBounds(880, 250, 200, 30);
        academicQualificationsField.setFont(font);

        frame.add(academicQualificationsLabel);
        frame.add(academicQualificationsField);

        performanceIndexLabel = new JLabel("Performance Index:");
        performanceIndexLabel.setBounds(680, 300, 200, 30);
        performanceIndexLabel.setFont(font);

        performanceIndexField = new JTextField(20);
        performanceIndexField.setBounds(880, 300, 200, 30);
        performanceIndexField.setFont(font);

        frame.add(performanceIndexLabel);
        frame.add(performanceIndexField);

        addLecturer = new JButton("Add Lecturer");
        addLecturer.setBounds(300, 510, 200, 50);
        addLecturer.setFont(font);
        addLecturer.setFocusable(false);
        frame.add(addLecturer);

        addLecturer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    String teacherName = teacherNameField.getText();
                    String address = addressField.getText();
                    String workingType = workingTypeField.getText();
                    String employmentStatus = employmentStatusField.getText();
                    double gradedScore = Double.parseDouble(gradedScoreField.getText());
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());
                    String department = departmentField.getText();

                    if (teacherId < 0 || teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty()
                            || employmentStatus.isEmpty() || gradedScore < 0 || yearsOfExperience < 0
                            || department.isEmpty()) {
                        throw new Exception();
                    }

                    for (Teacher teacher : teachers) {
                        if (teacher.getTeacherId() == teacherId) {
                            JOptionPane.showMessageDialog(frame, "Teacher with id " + teacherId + " already exists");
                            return;
                        }
                    }

                    Lecturer lecturer = new Lecturer(teacherId, teacherName, address, workingType, employmentStatus,
                            gradedScore, yearsOfExperience, department);
                    teachers.add(lecturer);
                    JOptionPane.showMessageDialog(frame, "Lecturer added successfully");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Teacher ID, Teacher Name, Address, Working Type, Employment Status, Graded Score, Years of Experience and Department.",
                            "Please fill all the fields with valid input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        addTutor = new JButton("Add Tutor");
        addTutor.setBounds(880, 360, 200, 50);
        addTutor.setFont(font);
        addTutor.setFocusable(false);
        frame.add(addTutor);

        addTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    String teacherName = teacherNameField.getText();
                    String address = addressField.getText();
                    String workingType = workingTypeField.getText();
                    String employmentStatus = employmentStatusField.getText();
                    int workingHours = Integer.parseInt(workingHoursField.getText());
                    double salary = Double.parseDouble(salaryField.getText());
                    String specialization = specializationField.getText();
                    String academicQualifications = academicQualificationsField.getText();
                    int performanceIndex = Integer.parseInt(performanceIndexField.getText());

                    if (teacherId < 0 || teacherName.isEmpty() || address.isEmpty() || workingType.isEmpty()
                            || employmentStatus.isEmpty() || workingHours < 0 || salary < 0
                            || specialization.isEmpty() || academicQualifications.isEmpty() || performanceIndex < 0) {
                        throw new Exception();
                    }

                    for (Teacher teacher : teachers) {
                        if (teacher.getTeacherId() == teacherId) {
                            JOptionPane.showMessageDialog(frame, "Teacher with id " + teacherId + " already exists");
                            return;
                        }
                    }

                    Tutor tutor = new Tutor(teacherId, teacherName, address, workingType, employmentStatus,
                            workingHours, salary, specialization, academicQualifications, performanceIndex);
                    teachers.add(tutor);
                    JOptionPane.showMessageDialog(frame, "Tutor added successfully");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Teacher ID, Teacher Name, Address, Working Type, Employment Status, Working Hours, Salary, Specialization, Academic Qualifications and Performance Index.",
                            "Please fill all the fields with valid input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        gradeAssignments = new JButton("Grade Assignments");
        gradeAssignments.setBounds(660, 360, 200, 50);
        gradeAssignments.setFont(font);
        gradeAssignments.setFocusable(false);
        frame.add(gradeAssignments);

        gradeAssignments.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    double gradedScore = Double.parseDouble(gradedScoreField.getText());
                    String department = departmentField.getText();
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceField.getText());

                    if (teacherId < 0 || gradedScore < 0 || department.isEmpty() || yearsOfExperience < 0) {
                        throw new Exception();
                    }

                    String message = "Teacher ID: " + teacherId + "\n" +
                            "Graded Score: " + gradedScore + "\n" +
                            "Department: " + department + "\n" +
                            "Years of Experience: " + yearsOfExperience;
                    JOptionPane.showMessageDialog(frame, message, "Entered Data", JOptionPane.INFORMATION_MESSAGE);

                    boolean teacherFound = false;
                    for (Teacher teacher : teachers) {
                        if (teacher.getTeacherId() == teacherId) {
                            teacherFound = true;
                            if (teacher instanceof Lecturer) {
                                Lecturer lecturer = (Lecturer) teacher;
                                lecturer.gradeAssignment(gradedScore);
                                JOptionPane.showMessageDialog(frame, "Graded score updated successfully");
                            } else {
                                JOptionPane.showMessageDialog(frame, "Teacher is not a lecturer");
                            }
                            break;
                        }
                    }
                    if (!teacherFound) {
                        JOptionPane.showMessageDialog(frame, "Teacher not found");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Teacher ID, Graded Score, Department and Years of Experience.",
                            "Please fill all the fields with valid input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setSalaryOfTutor = new JButton("Set Salary of Tutor");
        setSalaryOfTutor.setBounds(880, 420, 200, 50);
        setSalaryOfTutor.setFont(font);
        setSalaryOfTutor.setFocusable(false);
        frame.add(setSalaryOfTutor);

        setSalaryOfTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    double salary = Double.parseDouble(salaryField.getText());
                    int performanceIndex = Integer.parseInt(performanceIndexField.getText());

                    if (teacherId < 0 || salary < 0 || performanceIndex < 0) {
                        throw new Exception();
                    }

                    String message = "Salary: " + salary + "\n" +
                            "Performance Index: " + performanceIndex;
                    JOptionPane.showMessageDialog(frame, message, "Entered Data", JOptionPane.INFORMATION_MESSAGE);

                    boolean teacherFound = false;
                    for (Teacher teacher : teachers) {
                        if (teacher.getTeacherId() == teacherId) {
                            teacherFound = true;
                            if (teacher instanceof Tutor) {
                                Tutor tutor = (Tutor) teacher;
                                tutor.setSalary(salary);
                                JOptionPane.showMessageDialog(frame, "Salary updated successfully");
                            } else {
                                JOptionPane.showMessageDialog(frame, "Teacher is not a tutor");
                            }
                            break;
                        }
                    }
                    if (!teacherFound) {
                        JOptionPane.showMessageDialog(frame, "Teacher not found");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Teacher ID, Salary and Performance Index.",
                            "Please fill all the fields with valid input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        removeTutor = new JButton("Remove Tutor");
        removeTutor.setBounds(880, 480, 200, 50);
        removeTutor.setFont(font);
        removeTutor.setFocusable(false);
        frame.add(removeTutor);

        removeTutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int teacherId = Integer.parseInt(teacherIdField.getText());
                    if (teacherId < 0) {
                        throw new Exception();
                    }

                    boolean teacherFound = false;
                    for (Teacher teacher : teachers) {
                        if (teacher.getTeacherId() == teacherId) {
                            teacherFound = true;
                            if (teacher instanceof Tutor) {
                                teachers.remove(teacher);
                                JOptionPane.showMessageDialog(frame, "Tutor removed successfully");
                            } else {
                                JOptionPane.showMessageDialog(frame, "Teacher is not a tutor");
                            }
                            break;
                        }
                    }
                    if (!teacherFound) {
                        JOptionPane.showMessageDialog(frame, "Teacher not found");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Teacher ID.", "Please fill all the fields with valid input",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        display = new JButton("Display");
        display.setBounds(660, 420, 200, 50);
        display.setFont(font);
        display.setFocusable(false);
        frame.add(display);

        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String output = "";
                for (Teacher teacher : teachers) {
                    output += teacher.toString() + "\n";
                }
                if (output.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "No teachers found");
                } else {
                    JOptionPane.showMessageDialog(frame, output, "Teachers", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        clear = new JButton("Clear");
        clear.setBounds(660, 480, 200, 50);
        clear.setFont(font);
        clear.setFocusable(false);
        frame.add(clear);

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherIdField.setText("");
                teacherNameField.setText("");
                addressField.setText("");
                workingTypeField.setText("");
                employmentStatusField.setText("");
                workingHoursField.setText("");
                departmentField.setText("");
                yearsOfExperienceField.setText("");
                gradedScoreField.setText("");
                salaryField.setText("");
                specializationField.setText("");
                academicQualificationsField.setText("");
                performanceIndexField.setText("");
            }
        });

        frame.repaint();
    }

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
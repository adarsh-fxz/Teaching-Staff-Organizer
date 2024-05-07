# Teaching Staff Organizer

1. Your GUI should contain the same components, but you are free to use a different layout if you feel that it improves the aesthetics, ease of use, etc. The TeacherGUI class should store an array list (not an array) of the type Teacher class to hold Lecturer and Tutor objects. There should be text fields for entering:


Teacher id, Teacher name, Address, Working Type, Employment Status, Working hours, Department, Years of Experience, Graded Score, Salary, Specialization, Academic Qualifications, Performance Index

2. The GUI should have the following buttons to
#### i. Add a Lecturer

When this button is pressed, the input values of teacher id, teacher name, address, working type, employment status, gradedScore, and YearsOfExperience are used to create a new object of type Lecturer which is added to an array list of Teacher class.

#### ii. Add a Tutor

When this button is pressed, the input values of teacher Id, teacher name, address, working type, employment status, working hours, salary, specialization, academic qualifications and performanceIndex are used to create a new object of the type Tutor which is added to an array list of Teacher class.

#### iii. Grade the Assignments
The teacher id, gradedScore, department, and YearsOfExperience are entered in the
GUI. When the valid teacher ID is entered in the text box along with gradedScore,
department, and YearsOfExperience display an information dialog that displays all data that have been entered. When the grade assignment button is pressed, the input value of teacher ID is compared to the existing teacher ID, and if a valid teacher id has been entered, it is used to grade the assignments from lecturer class. The method to grade assignments from lecturer is called here.
Hint: An object of Teacher is cast as Lecturer

#### iv. Set the salary of Tutor
The teacher id, new salary, and new performance Index are entered in the GUI. When the valid teacher ID is entered in the text box, the respective new salary and new performance Index are displayed in the information dialog. When this button is pressed, the input value of teacher ID is compared to the existing teacher ID, and if a valid teacher id has been entered, it is used to set the salary of the tutor. The method to set the salary from the Tutor class is called here.
Hint: An object of Teacher is cast as Tutor.

#### v. Remove the tutor
The teacher id is entered in the GUI. When this button is pressed, the input value of teacher ID is compared to the existing teacher ID, and if a valid teacher id has been entered, it is used to remove the tutor. The method to remove the tutor from the Tutor class is called here.
Hint: An object of Teacher is cast as Tutor.

#### vi. Display
When this button is pressed, the information relating to the appropriate class is displayed.

#### vii. Clear 
When this button is pressed, the values from text fields are cleared. 

3. Additional Information:

Return the values of each of the text fields using the getText() method. For the number type variable get the text from the text field, convert it to a whole number and return the whole number.

Additionally, use try & catch blocks to catch any Number Format Exception that might be thrown in converting the string to an integer or double. If the text input is incorrect in any way and output a suitable error message in a message dialog box.
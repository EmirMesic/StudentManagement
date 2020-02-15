package studentManagement;

import java.util.ArrayList;

public class StudentManagement {
	ArrayList<Student> students = new ArrayList<Student>();
	
	public void createSutdent(String studentId, String firstName, String lastName, String dob, String indexNumber) {
		students.add(new Student(studentId, firstName, lastName, dob, indexNumber));
	}
	
	public boolean studentExists(String id) {
		for (Student student : students) {
			if(student.getStudentId().equals(id))
				return false;
		}
		return true;
	}
	
	public void viewAllStudents() {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
	
	public boolean viewStudentById(String id) {
		for (Student student : students) {
			System.out.println(id);
			if(student.getStudentId().equals(id)) {
				System.out.println(student.toString());
				return true;
			}
			else {
				System.out.println("Student doesn't exist ");
			}	
		}
		
		return false;
	}
	
	public boolean editStudentById(String studentId, String newFirstName, String newLastName, String newDob, String newIndexNumber) {
		for (Student student : students) {
			if(student.getStudentId().equals(studentId)) {
				System.out.println(student.toString());
				student.setFirstName(newFirstName);
				student.setLastName(newLastName);
				student.setDob(newDob);
				student.setIndexNumber(newIndexNumber);
				return true;
			}	
		}
		return false;
	}
	
	public void deleteStudentById(String id) {
		for (Student student : students) {
			if(student.getStudentId().equals(id) && students.size()>1) {
				students.remove(student);
			}
			else {
				System.out.println("Student doesn't exist or last student can't be removed ");
			}	
		}
	}
}

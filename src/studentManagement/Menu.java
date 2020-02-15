package studentManagement;

import java.util.Scanner;

public class Menu {
	StudentManagement studentManagement = new StudentManagement();

	public void startMenu() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int menuChoice;
		do {
			printMenu();
			System.out.println("Please choose: ");
			menuChoice = input.nextInt();

			switch (menuChoice) {
			// Create new student
			case 1:
				System.out.println("Creating new student.");
				System.out.print("Input student's Id: ");
				String studentId = input.next();
				System.out.print("Input student's First Name: ");
				String firstName = input.next();
				System.out.print("Input student's Last Name: ");
				String lastName = input.next();
				System.out.print("Input student's Date of Birth: ");
				String dob = input.next();
				System.out.print("Input student's Index Number: ");
				String indexNumber = input.next();
				if (!studentManagement.studentExists(studentId)) {
					System.out.println("Student already exists");
				} else {
					studentManagement.createSutdent(studentId, firstName, lastName, dob, indexNumber);
				}
				break;

			// View all students
			case 2:
				studentManagement.viewAllStudents();
				break;

			// View student by Id
			case 3:
				System.out.print("Input student's Id: ");
				studentId = input.next();
				while(!studentManagement.viewStudentById(studentId)) {
					System.out.println("Student id: " + studentId + " does not exist please enter diferent student id (enter 0 to exit): ");
					int exit = input.nextInt();
					if (exit==0)
						break;
				}
				break;

			// Edit student by Id
			case 4:
				System.out.print("Input student's Id: ");
				studentId = input.next();
				System.out.println("Editing student.");

				System.out.print("Input new student's First Name: ");
				firstName = input.next();
				System.out.print("Input new student's Last Name: ");
				lastName = input.next();
				System.out.print("Input new student's Date of Birth: ");
				dob = input.next();
				System.out.print("Input new student's Index Number: ");
				indexNumber = input.next();
				
				while(!studentManagement.editStudentById(studentId, firstName, lastName, dob, indexNumber)) {
					System.out.println("Student id: " + studentId + " does not exist please enter diferent student id (enter 0 to exit):");
					int exit = input.nextInt();
					if (exit==0)
						break;
				}
				break;

			// Delete student by Id
			case 5:
				System.out.print("Input student's Id: ");
				studentId = input.next();
				studentManagement.viewStudentById(studentId);
				System.out.println("Are you shure you want to delete this student? (press '1' for Yes! )");
				int answer = input.nextInt();
				if(answer==1)
					studentManagement.deleteStudentById(studentId);
				break;

			default:
				break;
			}

		} while (menuChoice != 0);
		System.out.println("Goodbye!");
	}

	public void printMenu() {
		System.out.print(
				"\n1. Add new student \n2. View all students \n3. View student by Id \n4. Edit student by Id \n5. Delete student \n0. Exit \n");
	}

}

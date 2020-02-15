package studentManagement;

import java.util.Scanner;

public class Menu {
	public static void startMenu() {
		Scanner input = new Scanner(System.in);
		int menuChoice;
		do {
			printMenu();
			
			menuChoice = input.nextInt();

		} while (menuChoice!=0);

	}
	
	public static void printMenu() {
		System.out.print("\n1. Add new student \n2. View all students \n3. View student by Id \n4. Edit student \n5. Delete student \n0. Exit");
	}
	
}

package com.itvedent.student;

import java.util.List;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("\nChoose the operation to be performed from the list below:");
			System.out.println("1. Display All Records");
			System.out.println("2. Insert Records");
			System.out.println("3. Delete Records");
			System.out.println("4. Search Records");
			System.out.println("5. Update Records");
			System.out.println("0. Exit from Menu");
			
			System.out.print("Enter Your Choice: ");
			int choice = s.nextInt();
			System.out.println();
			
			if(choice == 0)
				break;
			else {
				StudentDAO sd = new StudentDAO();
				int id = 0;
				String name = "";
				int age = 0;
				double marks = 0.0;
				switch(choice) {
				case 1: List<Student> studs = sd.getRecords();
						studs.forEach(n->System.out.println(n));
						break;
				case 2: System.out.print("Enter Name: ");
						name = s.next();
						System.out.print("Enter Age: ");
						age = s.nextInt();
						System.out.print("Enter Marks: ");
						marks = s.nextDouble();
						
						boolean b = sd.insertRecord(name, age, marks);
						if(b)
							System.out.println("Records Inserted");
		        		break;
				case 3: System.out.println("Delete");
		        	break;
				case 4: System.out.println("Search");
					break;
				case 5: System.out.println("Update");
						System.out.println("What you want to update?");
						System.out.println("a. Name");
						System.out.println("b. Age");
						System.out.println("c. Salary");
						System.out.print("Enter Your Choice: ");
						char updateChoice = s.next().charAt(0);
						
						switch(updateChoice) {
						case 'a': System.out.println("Update Name");	
							break;
						case 'b': System.out.println("Update Age");	
							break;
						case 'c': System.out.println("Update Marks");	
							break;
						default: System.out.println("Enter the correct choice next time...\n");
						}
		        	break;
		        default: System.out.println("Enter the correct number for choice next time....\n");
				}
			}
		}		
	}
}

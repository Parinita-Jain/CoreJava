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
				//Display all records
				case 1: List<Student> studs = sd.getRecords();
						studs.forEach(n->System.out.println(n));
						break;
						
				//Insert Records
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
		        		
		        //Delete Records	        		
				case 3: studs = sd.getRecords();
						studs.forEach(n->System.out.println(n));
						System.out.print("Enter the ID of the student whose records needs to be deleted: ");
						id = s.nextInt();
						b = sd.deleteRecord(id);
						if(b)
							System.out.println("Records Deleted");
		        		break;
		        		
		        //Search Records
				case 4: System.out.print("Enter the name of the student whose record you want to search: ");
						name = s.next();						
						Student st = sd.searchRecord(name);
						if(st==null)
							System.out.println("No Record Found");
						else
							System.out.println(st);
						break;
						
				//Update Records
				case 5: studs = sd.getRecords();
						studs.forEach(n->System.out.println(n));
						
						System.out.print("Enter the name of the student whose records you want to update: ");
						name = s.next();
						
						st = sd.searchRecord(name);
						if(st==null)
							System.out.println("No Record Found");
						else {							
							System.out.println("What you want to update?");
							System.out.println("a. Name");
							System.out.println("b. Age");
							System.out.println("c. Salary");
							System.out.print("Enter Your Choice: ");
							char updateChoice = s.next().charAt(0);
						
							switch(updateChoice) {
							case 'a': System.out.print("Enter New Name: ");
										name = s.next();
										st.setName(name);
										break;
							case 'b': System.out.print("Enter New Age: ");
										age = s.nextInt();
										st.setAge(age);
										break;
							case 'c': System.out.print("Enter New Marks: ");
										marks = s.nextDouble();
										st.setMarks(marks);
										break;
							default: System.out.println("Enter the correct choice next time...\n");
							}
							
							b = sd.updateRecord(st);
							if(b)
								System.out.println("Record Updated");
						}
		        	break;
		        default: System.out.println("Enter the correct number for choice next time....\n");
				}
			}
		}		
	}
}

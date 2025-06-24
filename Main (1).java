package Student.kit;

import java.util.*;



public class Main {
	public static void main(String[] args) {
		StdService ser=new StdService();
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do 
		{
			System.out.println(".........STUDENT MANAGEMENT SYSTEM........");
			System.out.println("1.Creating Student data...");
			System.out.println("2.View Student");
			System.out.println("3.Grade Calculation");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) 
			{
			case 1->{
				System.out.print("Enter student id:");
				int id =sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Student name:");
				String name=sc.nextLine();
				ser.addStudent(new Student(id,name));
			}
			case 2-> ser.viewStudent();
			
			case 3-> {
				System.out.print("Enter student id:");
				int id =sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the number of subject mark count :");
				int count =sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the mark :");
				ser.avgStudent(id,count);
			}
		
			case 0-> System.out.print("Exiting......");
			default-> System.out.println("Please Enter a valid choice....!");
			}
		}while(choice!=0);

	}

}

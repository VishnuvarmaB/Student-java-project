package Student.kit;

import java.util.ArrayList;
import java.util.*;

public class StdService {
    public double total=0;
    public int[] mark;
    Scanner sc=new Scanner(System.in);
	public final List<Student> students=new ArrayList<>();
	
	public void addStudent(Student st) {
		students.add(st);
		System.out.println("Student Added successfully....");
	}
	public void viewStudent() {
		if(students.isEmpty()) {
			System.out.println("no Student data to view....");
		}
		else {
			students.forEach(System.out::println);
		}
	}
	
	public void avgStudent(int id,int count) {
		for(Student st : students){
			if(st.getId()==id) 
			{
				this.mark=new int[count];
				for(int i=0;i<count;i++) {
					System.out.println("enter the mark "+(i+1)+" :");
					mark[i]=sc.nextInt();
					this.total+=mark[i];
					}
				double avg=total/count;
				System.out.println("the average of the student is : "+avg);
				if(avg>90) {
					System.out.println("the sudent "+id+"  grade is 'A'");
				}
				else if(avg>75&&avg<=90) {
					System.out.println("the sudent "+id+"  grade is 'B'");
				}
				else if(avg>55&&avg<=75) {
					System.out.println("the sudent "+id+"  grade is 'C'");
				}
				else {
					System.out.println(id+" is fail");
				}
		   }
		}
		System.out.println("Student id not found........");
	}
}

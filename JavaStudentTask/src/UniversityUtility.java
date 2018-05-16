

import java.util.ArrayList;
import java.util.List;



public class UniversityUtility{

	 Student s=new Student(1, "Vikas", "EC",66, 23);
     Student s1=new Student(2, "Shiva", "EC", 63,24);
	 Student s2=new Student(3, "Kathir", "EE",60, 25);
     Student s3=new Student(4, "Mallikarjuna", "CS",61, 26);
     Student s4=new Student(5, "Vikesh", "CS",63, 25);
     
	
    
	public  List<Student> getStudentsList(){
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println(al);
		return al;
	}
	
	public  void modifyStudent(Student s){
		if(s.equals(s)){
			int a=s.getAge();
			int age=a+1;
			s.setAge(age);
			System.out.println(s);
		}
		else if(s.equals(s1)){
			int a=s1.getAge();
			int age=a+1;
			s1.setAge(age);
			System.out.println(s1);
		}
		else if(s.equals(s2)){
			int age=s2.getAge() +1;
		;
			s2.setAge(age);
			System.out.println(s2);
		}
		else if(s.equals(s3)){
			int age=(s3.getAge())+1;
			
			s3.setAge(age);
			System.out.println(s3);
		}
		else if(s.equals(s4)){
			int age=(s4.getAge())+1;
			s4.setAge(age);
			System.out.println(s4);
		}
	}
	
	public void findStudent(Student s,String name){
		
		String name1=s.getName();
		String name2=s1.getName();
		String name3=s2.getName();
		String name4=s3.getName();
		String name5=s4.getName();

		if(name1.equalsIgnoreCase(name)){
			System.out.println(s);
		}
		if(name2.equalsIgnoreCase(name)){
			System.out.println(s1);
		}
		if(name3.equalsIgnoreCase(name)){
			System.out.println(s2);
		}
		if(name4.equalsIgnoreCase(name)){
			System.out.println(s3);
		}
		if(name5.equalsIgnoreCase(name)){
			System.out.println(s4);
		}
		
	}
	
	public void findStudent(Student s,int age){
		int aS1=s.getAge();
		int aS2=s1.getAge();
		int aS3=s2.getAge();
		int aS4=s3.getAge();
		int aS5=s4.getAge();
		
		if(aS1>age && aS2>age && aS3>age && aS4>age && aS5>age){
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
		}
		else if(aS2>age && aS3>age && aS4>age && aS5>age){
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
		}
		else if(aS3>age && aS4>age && aS5>age){
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
		}
		else if(aS4>age && aS5>age){
			System.out.println(s3);
			System.out.println(s4);
		}
		else if(aS5>age){
			System.out.println(s4);
		}

	}
	
	
}



import java.util.List;



import java.util.Scanner;

public class Test extends University{

public static void main(String[] args) {
	 Scanner scan =new Scanner(System.in);
     Scanner sc=new Scanner(System.in);
     Scanner sage=new Scanner(System.in);
     

	 Student s=new Student(1, "Vikesh", "CSE",61,25 );
 	
	University u=new University();
	
	System.out.println("Initializinng University Class");
	u.intialize();
	
	UniversityUtility universityutility=new UniversityUtility();
	System.out.println("press 1 to get Student list");
	System.out.println("press 2 to modify Student");
	System.out.println("press 3 to find student by name");
	System.out.println("press 4 to find student by age");
	int n=scan.nextInt();
	if(n==1){
	System.out.println("Showing list");
    universityutility.getStudentsList();
	}
	else if(n==2){
	System.out.println("modifying");
	universityutility.modifyStudent(s);
	}else if (n==3){
		System.out.println("find student by name");
		System.out.println("enter name");
		String name=sc.nextLine();
	universityutility.findStudent(s, name);}
	else if(n==4){
	System.out.println("findStudent  by age");
	int aage= sage.nextInt();
	universityutility.findStudent(s, aage);
	}
	else{
		System.out.println("please enter correct choice");
	}

   scan.close();
   sc.close();
   sage.close();
}
}

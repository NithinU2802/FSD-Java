/******************************************************************************

Make a student detail storage structure....

Input:
Enter Number of student: 2
student N0 1
Name:Nithin 
Roll No: 71
Age: 20

student N0 2
Name: Name 
Roll No: 98
Age: 21

Output:
Entered Student details are

Student No: 1
Name: Nithin
Roll No: 71
Age: 20

Student No: 2
Name: name 
Roll No: 98 
Age: 21


*******************************************************************************/

import java.util.*;

class student{
    String name;
    int rollno;
    int age;
}

public class studentDetails
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	System.out.print("Enter Number of Student: ");
	int n=x.nextInt();
	student[] s=new student[n];
	for(int i=0;i<n;i++) s[i]=new student();
	for(int i=0;i<n;i++){ 
	System.out.println();
	System.out.println("Student No "+(i+1));
	System.out.print("Name: ");
	s[i].name=x.next();
	System.out.print("Roll No: ");
	s[i].rollno=x.nextInt();
	System.out.print("Age: ");
	s[i].age=x.nextInt();
	}
	System.out.println();
	System.out.println("Entered Student details are ");
	for(int i=0;i<n;i++){ 
	System.out.println();
	System.out.println("Student No: "+(i+1));
	System.out.println("Name: "+s[i].name);
	System.out.println("Roll No: "+s[i].rollno);
	System.out.println("Age: "+s[i].age);
	}
	}
}

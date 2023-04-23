/******************************************************************************

Encapsulation Implementation..

Output:
Student name is Nithin, Age is 21, from Trichy
Student name is Nithin, Age is 21, from Tirunelveli

*******************************************************************************/

class Student{

private String name;
private int age;
private String city;

public Student(String name,int age,String city){
this.name=name;
this.age=age;
this.city=city;
}
public void setName(String name){
this.name=name;
}
public void setAge(int age){
this.age=age;
}
public void setCity(String city){
this.city=city;
}

public String getName(){
return name;
}

public int getAge(){
return age;
}

public String getCity(){
return city;
}

@Override
public String toString(){
return ("Student name is "+this.getName()+", Age is "+this.getAge()+", from "+this.getCity());
}

public static void main(String[] arg){
Student s=new Student("Nithin",21,"Trichy");
System.out.println("Current Details: "+s.toString());
s.setCity("Tirunelveli");
System.out.println("Current Details: "+s.toString());
}

}

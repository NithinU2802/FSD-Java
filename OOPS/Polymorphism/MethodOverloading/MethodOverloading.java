class MethodOverloading{

int multiply(int a,int b){
return a*b;
}

int multiply(int a,int b,int c){
return a*b*c;
}

double multiply(double a,double b){
return a*b;
}

public static void main(String[] arg){
MethodOverloading m=new MethodOverloading();
System.out.println(m.multiply(2,3));
System.out.println(m.multiply(2,3,4));
System.out.println(m.multiply(5.0,3.0));
}
}
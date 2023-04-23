class MethodOverriding{
public static void main(String[] arg){
Mountain m=new Mountain(20,10,5);
System.out.println("Details:");
System.out.println("Speed = "+m.speed);
System.out.println("Gear  = "+m.gear);
System.out.println("Height= "+m.height);
m.setSpeed(30);
m.setGear(40);
m.setHeight(20);
System.out.println("\nDetails:");
System.out.println("Speed = "+m.speed);
System.out.println("Gear  = "+m.gear);
System.out.println("Height= "+m.height);
}
}
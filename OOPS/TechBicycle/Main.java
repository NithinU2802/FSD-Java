import java.util.*;

class Main{
public static void main(String[] arg){
Scanner x=new Scanner(System.in);
int height=x.nextInt();
int speed=x.nextInt();
int gear=x.nextInt();
MountainBicycle mount=new MountainBicycle(height,speed,gear);
while(true){
System.out.println("\nManaging System of BiCycle..!!\n");
System.out.println("1.Apply Gear\n2.Apply Brake\n3.Get Status\n4.Apply Height\n5.Exit\n");
System.out.print("Enter Choice: ");
int ch=x.nextInt();
if(ch==1)
mount.applyGear(1);
else if(ch==2)
mount.brake(5);
else if(ch==3)
mount.getDetails();
else if(ch==4){
System.out.print("Enter Height: ");
int ht=x.nextInt();
mount.setHeight(ht);
}else if(ch==5) break;
else System.out.println("Invalid Option");
}
}
}
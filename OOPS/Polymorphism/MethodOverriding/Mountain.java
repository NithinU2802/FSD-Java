class Mountain extends Bicycle{

public int height;
public Mountain(int height,int speed,int gear){
super(speed,gear);
this.height=height;
}

@Override
void setGear(int gear){
this.gear=gear+10;
}

@Override
void setSpeed(int speed){
this.speed=speed+10;
} 

void setHeight(int height){
this.height=height;
}

}
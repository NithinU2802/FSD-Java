class MountainBicycle extends Bicycle{
    protected int height;
    public MountainBicycle(int height,int speed,int gear){
        super(height,speed,gear);
        this.height=height;
    }
    
    public void setHeight(int height){
        this.height=height;
    }
    public void getDetails(){
    System.out.println("Speed is  "+speed);
    System.out.println("Gear is   "+gear);
    System.out.println("Height is "+height);
    }
}
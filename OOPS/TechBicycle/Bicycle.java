class Bicycle{
    protected int speed;
    protected int gear;
    public Bicycle(int height,int speed,int gear){
        this.speed=speed;
        this.gear=gear;
    }
    public void brake(int dec){
        speed-=dec;
    }
    public void applyGear(int inc){
        gear+=1;
        if(gear==6)
        gear=5;
        speed+=15;
    }
}

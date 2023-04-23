public abstract class GraphicObject{
GraphicObject(){
System.out.println("I am Base Abstract Class");
}
void moveTo(int x,int y){
System.out.println("Move to x: "+x+"Move to y: "+y); 
}
abstract void draw();
abstract void resize();
}
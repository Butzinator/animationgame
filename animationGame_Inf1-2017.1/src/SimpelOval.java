
public class SimpelOval extends GeometricObject{
	
	public SimpelOval (double w,double h,Vertex pos){
		super(w,h,pos); }
	
	public SimpelOval (double w,double h,double x,double y){
		super (w,h,new Vertex(x,y));}
	
	
@Override public double area(){return Math.PI*width*height/4;}

@Override public String toString(){
	return "SimpelOval("+super.toString()+")";}

@Override public boolean equals(Object that){
	return (that instanceof SimpelOval && super.equals(that));
}
}



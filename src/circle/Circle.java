package circle;
import java.util.Scanner;

public class Circle  {
	private double radius;
	Circle(){
		this.radius = 0;
	}
	Circle(double r){
		this.radius = r;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}; 
 
    public double getPerimeter() {
    	return 2*Math.PI*this.radius;
    }; 
    void disp() {
        System.out.println("radius="+ this.radius); 	
    	System.out.println("perimeter="+this.getPerimeter()); 
        System.out.println("area="+ this.getArea()); 
    }
    public static void main(String[] args) {         
        Scanner s = new Scanner(System.in); 
        double r = s.nextDouble();
        Circle c = new Circle(r);
        c.disp();
            } 
} 
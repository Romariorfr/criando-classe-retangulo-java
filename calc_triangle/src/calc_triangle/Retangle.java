package calc_triangle;

public class Retangle {
	public double width; 
	public double heigth; 
	
	//Function return the area of the rectangle
	public double Area() {
		return width *heigth;
	}
	
	//function return the perimeter of the rectangle
	public double Perimeter() {
		double perimeter = 2 * (width + heigth);
		return perimeter;
	}
	
	public double Diagonal() {
		double diagonal = (width * width) + (heigth * heigth);
		diagonal = Math.sqrt(diagonal);
		return diagonal;
	}
}

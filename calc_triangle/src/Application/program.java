package Application;
import java.util.Scanner;
import calc_triangle.Retangle;
public class program {
	
	public static void main(String[] args) {
		System.out.println("Enter retangle width and heigth:");
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		retangle.heigth = sc.nextDouble();
		retangle.width = sc.nextDouble();
		
		System.out.printf("Area do retangulo: %.2f\n",retangle.Area());
		System.out.printf("Perimetro do retangulo: %.2f\n",retangle.Perimeter());
		System.out.printf("Diagonal do retangulo: %.2f\n",+retangle.Diagonal());
		
		sc.close();
	}

}

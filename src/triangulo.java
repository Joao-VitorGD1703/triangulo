import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, z;
		
		System.out.println("lado1 :  ");
		x = sc.nextDouble();
		System.out.println("lado2 :  ");
		y = sc.nextDouble();
		System.out.println("lado3 : ");
		z = sc.nextDouble();
		
		if( x < z + y && y < x + z && z < x + y) {
			System.out.println("� poss�vel formar um tri�ngulo");
		}else {
			System.out.println(" N�o � poss�vel");
		}

	}

}

package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = sc.nextInt();
		
		System.out.print("Nhap b: ");
		int b = sc.nextInt();
		
		System.out.println("Tong: " + (a + b) );
		System.out.println("Hieu: " + (a - b) );
		System.out.println("Tich: " + (a * b) );
		System.out.println("Thuong: " + (a / b) );
		
		boolean c = a > b;
		boolean d = a < b;
		boolean e = a >= b;
		boolean f = a <= b;
		
		
		System.out.println("a > b: " + c);
		System.out.println("a < b: " + d);
		System.out.println("a >= b: " + e);
		System.out.println("a <= b: " + f);
	}

}

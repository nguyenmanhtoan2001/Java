package Bai2;
import java.util.Scanner;
public class Square {
	private float canh ;
	Scanner sc = new Scanner(System.in);
	public float getCanh() {
		return canh;
	}

	public void setCanh(float canh) {
		this.canh = canh;
	}
	public void input() {
		System.out.println("Nhap canh");
		canh = sc.nextFloat();
	}
	public void canh() {
		System.out.printf("Canh: %.2f \n", canh );
	}
	public void P() {
		System.out.printf("Chu vi: %.2f \n", canh*4);
	}
	public void S() {
		System.out.printf("Dien tich: %.2f \n", canh*canh);
	}
	public void Show() {
		canh();
		P();
		S();
	}
}

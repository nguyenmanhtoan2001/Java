package Bai2;

import java.util.Scanner;

public class Rectangle {
	private float dai ;
	public float getDai() {
		return dai;
	}

	public void setDai(float dai) {
		this.dai = dai;
	}

	public float getRong() {
		return rong;
	}

	public void setRong(float rong) {
		this.rong = rong;
	}
	private float rong ;
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Nhap chieu dai:");
		dai = sc.nextFloat();
		System.out.println("Nhap chieu rong:");
		rong = sc.nextFloat();
	}
	public void canh() {
		System.out.printf("Chieu dai: %.2f \n", dai );
		System.out.printf("Chieu rong: %.2f \n", rong );
	}
	public void P() {
		System.out.printf("Chu vi: %.2f \n", (dai+rong)*2);
	}
	public void S() {
		System.out.printf("Dien tich: %.2f \n", dai*rong);
	}
	public void Show() {
		canh();
		P();
		S();
	}
}

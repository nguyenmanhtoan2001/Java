package test1;
import java.util.Scanner;
public class GiaDien {
	private int mucTieuThu;
	Scanner sc = new Scanner(System.in);
	public int getMucTieuThu() {
		return mucTieuThu;
	}

	public void setMucTieuThu(int mucTieuThu) {
		this.mucTieuThu = mucTieuThu;
	}
	public void Input() {
		System.out.println("Nhap muc tieu thu:");
		mucTieuThu = sc.nextInt();
	}
	public float Tinh() {
		if(mucTieuThu>0&&mucTieuThu<=50) {
			return 1678*mucTieuThu; 
		}
		else if(mucTieuThu>=51&&mucTieuThu<=100) {
			return 1734*mucTieuThu;
		}
		else if(mucTieuThu>=101&&mucTieuThu<=200) {
			return 2014*mucTieuThu;
		}
		else if(mucTieuThu>=201&&mucTieuThu<=300) {
			return 2536*mucTieuThu;
		}
		else if(mucTieuThu>=301&&mucTieuThu<=400) {
			return 2834*mucTieuThu;
		}
		else if(mucTieuThu>=401) {
			return 2928*mucTieuThu;
		}
		else
			System.out.println("Nhap sai!");
		return 0;
	}
	public static void main(String[] args) {
		GiaDien d = new GiaDien();
		d.Input();
		System.out.printf("Tien dien: %.1f d",d.Tinh());
	}
}

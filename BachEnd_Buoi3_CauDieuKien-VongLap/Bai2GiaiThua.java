package NguyenCanHVinh05;

import java.util.Scanner;

public class Bai2GiaiThua {

	public static void main(String[] args) {
		int n ,giaiThua;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("Nhap so can tính giai thừa: ");
			n=Integer.parseInt(sc.nextLine());
		}while(n<=0);
		giaiThua = 1;
		for(int i=1;i<=n;i++){
		    giaiThua *= i;
		}
		System.out.println(n + "! = " + giaiThua);
	}

}

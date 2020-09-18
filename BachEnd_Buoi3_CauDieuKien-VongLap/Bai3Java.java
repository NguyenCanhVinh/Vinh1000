package NguyenCanHVinh05;

public class Bai3Java {

	public static void main(String[] args) {
		for (int i = 20; i <= 200; i++) {
            if (i%7 ==0 && i%5 !=0) {
                System.out.println("Các số chia hết cho 7 và không chia hết cho 5 (20 đến 200):"+i);
            }
        }

	}

}

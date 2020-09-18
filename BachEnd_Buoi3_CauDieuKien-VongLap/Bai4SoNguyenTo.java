package NguyenCanHVinh05;

import java.util.Scanner;

public class Bai4SoNguyenTo {
	public static void main(String[] args) {
        int N,i;
        Scanner sc= new Scanner(System.in);
        do {
        	System.out.println("Nhap vao so N: ");
        	N=Integer.parseInt(sc.nextLine());
        }while(N<=0);
        System.out.println("---Cac so nguyen to nho hon N="+N);
        for(i = 1; i <= N; i++)
        {
            if(SoNguyenTo(i)==true) {
            	System.out.println("  "+i);
            }
        }
	}

	private static boolean SoNguyenTo(int N) {
        int i;
	    if(N == 1)
	        return false;
	    else
	    {
	        for( i = 2; i < N; i++)
	        { 
	            if(N % i == 0)
	                return false;
	        }
	        return true;
	    }
	}
	
}

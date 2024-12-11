package day03;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int iH = scan.nextInt();
		int iM = scan.nextInt();

		int tiM = iH * 60 + iM;
		int toM = tiM - 45;
		int oH = toM / 60;
		int oM = toM % 60;

		if (oH > 24) {
			oH = oH % 24;
		}

		System.out.print(oH + " " + oM);
	}
}
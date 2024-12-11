package day03;

public class Example2 {

	public static void main(String[] args) {
		// Q1
		int myAge = 23;
		int teacherAge = 38;

		boolean value = (myAge > 25);
		System.out.println(value);

		value = (myAge <= 25);
		System.out.println(myAge == teacherAge);

		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';

		System.out.println(ch);

		// Q2
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num); // 10

		// Q3
		int num2 = 10;
		System.out.println(num2); // 10
		System.out.println(num2++); // 10
		System.out.println(num2); // 10
		System.out.println(--num2); // 10

		// Q4
		int num3 = 10;
		int num4 = 20;
		boolean result;

		result = ((num3 > 10) && (num4 > 10));
		System.out.println(result);
		result = ((num3 > 10) || (num4 > 10));
		System.out.println(result);
		System.out.println(!result);

		// Q6
		int num5 = 8;
		System.out.println(num5 += 10);
		System.out.println(num5 -= 10);

		// Q7
		int num6 = 10;
		int num7 = 20;
		int result2 = num6 >= 10 ? num7 + 10 : num7 - 10;
		System.out.println(result2);
	}
}

package week1.day2.assignments;

public class Calculator {
	public int add(int num1, int num2, int num3) {
		int sum = (num1 + num2 + num3);
		System.out.println(sum);
		return sum;
	}
	public int sub(int num1, int num2) {
		int res = (num1 - num2 );
		System.out.println(res);
		return res;
	}
	public double mul(double num1, double num2) {
		double res1 = (num1 * num2 );
		System.out.println(res1);
		return res1;
	}
	public float div(float num1, float num2) {
		float res2 = (num1 / num2 );
		System.out.println(res2);
		return res2;
	}

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		int num3 = 10;
		Calculator calc = new Calculator();
		calc.add(num1,num2,num3);
		calc.sub(num1,num2);
		calc.mul(num1,num2);
		calc.div(num1,num2);
	

	}

}
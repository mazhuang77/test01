package day04.ex;

//1.写一个方法，接受一个整数，返回这个整数是几位数
public class Test02{
	
	// n代表输入的整数，返回值代表位数
	static int count(int n) {
		// 123
		int m = n;
		int c = 0;
		while(m > 0) {
			m = m / 10; // 0
			c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
		int d = count(422222);
		System.out.println("位数共:" + d);
	}

}

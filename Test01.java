package day04.ex;

//1.дһ������������һ��������������������Ǽ�λ��
public class Test02{
	
	// n�������������������ֵ����λ��
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
		System.out.println("λ����:" + d);
	}

}

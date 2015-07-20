package src;

//����� ����� ������ ����� � �� ���������� � ��������� �� 1 �� 99

public class ClassLoop {
	public static int[] main(String args[]) {
		int sum = 0;
		int kol = 0;
		for (int i = 1; i < 100; i++) {
			if ((i % 2) == 0) {
				++sum;
				kol += i;
			}
		}

		int[] result = new int[2];
		result[0] = sum;
		result[1] = kol;
		return result;
	}

// ��������� ������� �� �����?

	static String prime_number(int num) {
		String result = null;

		if (num <= 1)
			result = "����� �� �������";
		if (num == 2 || num == 3)
			result = "����� �������";
		else {
			for (int i = 2; i * i <= num; i++) {
				if (num % i == 0) {
					result = "����� �� �������";
					break;
				} else
					result = "����� �������";
			}
		}
		return result;

	}

// ����� ������ ������������ ����� � ��������� �� ������

	static int root(int x) {
		int div = 1, result = 0;
		while (x > 0) {
			x -= div;
			div += 2;
			result += x < 0 ? 0 : 1;
		}
		return result;

	}
// ��������� ��������� ����� n. n! = 1*2*...*n�1*n;!

	static int fun(int n) {
		int res = 0;
		if (n == 1)
			return 1;
		res = fun(n - 1) * n;
		return res;
	}
	
// ��������� ����� ���� ��������� �����

	public static int sum(int n)

	{
		int sum = 0;
		while (n != 0) {

			sum = sum + (n % 10);
			n /= 10;
		}
		return sum;
	}

	public static int mirror(int num) {
		int mirror = 0;
		while (num != 0) {
			mirror = mirror * 10 + (num % 10);
			num = num / 10;
		}
		return mirror;
	}

}

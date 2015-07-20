package src;

//Если а – четное посчитать а*б, иначе а+б

public class ClassIfs {

	public static void main(String[] args) {

	}

	static int fun(int a, int b) {
		int result = 0;
		if ((a % 2) == 0) {
			return a * b;
		} else if ((a % 2) != 0) {
			return a + b;
		}
		return result;
	}

// Определить какой четверти принадлежит точка с координатами (х,у)

	public static int quater(int x, int y) {
		int ret = 0;
		if (x > 0 && y > 0) {
			ret = 1;
		} else if (x < 0 && y > 0) {
			ret = 2;
		} else if (x < 0 && y < 0) {
			ret = 3;
		} else if (x > 0 && y < 0) {
			ret = 4;
		}

		return ret;
	}

// Найти сумму только положительных из трех чисел

	public static int fun_1(int num1, int num2, int num3) {
		int result = 0;
		if (num1 > 0) {
			result = num1;
		}
		if (num2 > 0) {
			result = result + num2;
		}
		if (num3 > 0) {
			result = result + num3;
		}
		return result;
	}

// Посчитать выражение макс(а*б*с, а+б+с)+3

	public static int fun_2(int x, int y, int z) {
		int max = 0;
		if (x + y + z > x * y * z) {
			max = x + y + z + 3;
		} else {
			max = x * y * z + 3;

		}
		return max;

	}

// Написать программу определения оценки студента по его рейтингу

	static String student_assessment(int num) {
		String str = null;
		if (num <= 100 && num >= 90) {
			str = "A";
		}
		if (num <= 89 && num >= 75) {
			str = "B";
		}
		if (num <= 74 && num >= 60) {
			str = "C";
		}
		if (num <= 59 && num >= 40) {
			str = "D";
		}
		if (num <= 39 && num >= 20) {
			str = "E";
		}
		if (num <= 19 && num >= 0)

			str = "F";

		return str;
	}
}

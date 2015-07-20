package src;

//Найти минимальный элемент массива----------------------------
public class ArreyTask {

	public static void main(String[] args) {

	}

	public static int min() {
		final int[] loc = { 25, 11, 250, 5 };

		int min = loc[0];
		for (int i = 0; i != loc.length; i++) {
			if (min > loc[i])
				min = loc[i];
		}

		return min;
	}

	// Найти максимальный элемент массива-------------------------

	public static int max() {
		final int[] loc = { 25, 11, 250, 5 };

		int max = loc[0];
		for (int i = 0; i != loc.length; i++) {
			if (max < loc[i])

				max = loc[i];
		}

		return max;
	}

	// Найти индекс минимального элемента массива-----------------
	
	public static int min_index() {
		final int[] min = { 25, 11, 250, 5 };
		int index = 0;
		int currentMin = min[0];
		for (int i = 0; i < min.length; i++) {
			if (currentMin > min[i]) {
				currentMin = min[i];
				index = i;
			}
		}

		return index;

	}

	// Найти индекс максимального элемента массива-----------------

	public static int max_index() {
		final int[] max = { 25, 11, 250, 5 };
		int index = 0;
		int currentMax = max[0];
		for (int i = 0; i < max.length; i++) {
			if (currentMax < max[i]) {
				currentMax = max[i];
				index = i;
			}
		}

		return index;

	}

	// Посчитать сумму элементов массива с нечетными индексами-------------

	public static int sum() {
		final int[] sum = { 1, 2, 3, 4, 5, 6, 7, 11 };
		int total = 0;
		for (int k = 0; k < sum.length; k++) {
			if (k % 2 != 0) {
				total += sum[k];
			}

		}
		return total;
	}

	// Сделать реверс массива (массив в обратном направлении)-----------
	public static int[] ar() {

		final int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] b = new int[a.length];
		for (int i = a.length; i > 0; i--) {
			b[a.length - i] = a[i - 1];
		}

		return b;
	}

	// Посчитать количество нечетных элементов массива--------------------

	public static int count() {
		final int[] count = { 1, 2, 3, 4, 5, 6, 7, 11 };
		int kol = 0;
		for (int k = 0; k < count.length; k++) {
			if (count[k] % 2 != 0) {
				kol++;
			}

		}
		return kol;
	}

	// Поменять местами первую и вторую половину массива, например, для массива
	// 1 2 3

	public static int[] swap() {
		final int[] sum = { 1, 2, 3, 4, 5, 6, 7, 11 };
		for (int k = 0; k < sum.length / 2; k++) {
			int tmp = sum[k];
			sum[k] = sum[k + sum.length / 2];
			sum[k + sum.length / 2] = tmp;
		}
		return sum;
	}

	// Отсортировать массив (пузырьком (Bubble), выбором (Select), вставками
	// (Insert))

	// Bubble
	public static int[] bubble_sort(int array[]) {
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					swapNumbers(i, k, array);
				}
			}

		}
		return array;
	}

	private static void swapNumbers(int i, int j, int[] array) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// Insert

	public static int[] insertionsort(int[] input) {

		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}

	// Select
	public static int[] selection_sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}
}

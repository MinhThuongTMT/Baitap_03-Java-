package baitap_03;

class PhanMemMayTinhBoTui implements MayTinhBoTui, SapXep {
	public double cong(double a, double b) {
		return a + b;
	}

	public double tru(double a, double b) {
		return a - b;
	}

	public double nhan(double a, double b) {
		return a * b;
	}

	public double chia(double a, double b) {
		return a / b;
	}

	public void sapXepTang(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}

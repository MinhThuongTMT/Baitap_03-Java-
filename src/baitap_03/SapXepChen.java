package baitap_03;

class SapXepChen implements SapXep {
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			double key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			double key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}

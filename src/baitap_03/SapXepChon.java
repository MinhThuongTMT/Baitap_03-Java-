package baitap_03;

class SapXepChon implements SapXep {
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			double temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int max_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] > arr[max_idx])
					max_idx = j;
			double temp = arr[max_idx];
			arr[max_idx] = arr[i];
			arr[i] = temp;
		}
	}
}

package baitap_03;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test câu a:");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinaCal500MS mvn500 = new MayTinhVinaCal500MS();
		System.out.println("5 + 3 = " + mfx500.cong(5, 3));
		System.out.println("7 - 2 = " + mvn500.tru(7, 2));
		System.out.println("4 * 5 = " + mvn500.nhan(4, 5));
		System.out.println("4 / 4 = " + mvn500.chia(4, 4));

		System.out.println("Test câu b:");
		double[] arr1 = { 1, 8, 9, 2, 5, 4, 3 };
		double[] arr2 = { 3, 9, 7, 2, 4, 8, 1 };
		SapXepChen sxChen = new SapXepChen();
		SapXepChon sxChon = new SapXepChon();

		sxChen.sapXepTang(arr1);
		System.out.print("Mảng arr1 sau khi sắp xếp tăng dần: ");
		for (double num : arr1)
			System.out.print(num + " ");
		System.out.println();

		sxChon.sapXepGiam(arr2);
		System.out.print("Mảng arr2 sau khi sắp xếp giảm dần: ");
		for (double num : arr2)
			System.out.print(num + " ");
		System.out.println();

		System.out.println("Test câu c:");
		double[] arr3 = { 0, 6, 9, 2, 5, 4, 3 };
		PhanMemMayTinhBoTui pmmt = new PhanMemMayTinhBoTui();
		pmmt.sapXepTang(arr3);
		System.out.print("Mảng arr3 sau khi sắp xếp tăng dần: ");
		for (double num : arr3)
			System.out.print(num + " ");
		System.out.println();
	}
}

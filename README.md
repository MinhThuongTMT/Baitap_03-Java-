# Bài Tập: Sử Dụng Interface trong Java

## Mô tả Bài Tập
Bài tập áp dụng việc sử dụng **Interface** trong Java bằng cách tạo các Interface và các lớp implement chúng.

---
## **Yêu Cầu Bài Tập**

### **Phần a: Tạo Interface MayTinhBoTui**
- **Interface**: `MayTinhBoTui` gồm các phương thức `cong()`, `tru()`, `nhan()`, `chia()`.
- **Lớp Implement**:
  - `MayTinhCasioFX500`
  - `MayTinhVinaCal500MS`

### **Phần b: Tạo Interface SapXep**
- **Interface**: `SapXep` gồm các phương thức `sapXepTang()` và `sapXepGiam()`.
- **Lớp Implement**:
  - `SapXepChen`
  - `SapXepChon`

### **Phần c: Kết hợp hai Interface**
- **Lớp Implement cả hai Interface**: `PhanMemMayTinhBoTui`.

---
## **Yêu Cầu Thực Hiện**
1. **Vẽ Sơ Đồ Lớp**
2. **Tạo Lớp Test**: Kiểm tra kết quả của các phương thức.
   - **Tạo các đối tượng** `cafx500`, `vncal500` và kiểm tra các phép tính.
   - **Sắp xếp mảng theo từng phương pháp**:
     - `double[] arr1 = {1,8,9,2,5,4,3};` (Sắp xếp chèn - tăng dần)
     - `double[] arr2 = {3,9,7,2,4,8,1};` (Sắp xếp chọn - giảm dần)
   - **Sắp xếp mảng với lớp PhanMemMayTinhBoTui**:
     - `double[] arr3 = {0,6,9,2,5,4,3};` (Tăng dần)

---
## **Phụ Lục: Các Giải Thuật Sắp Xếp**
### **1. Sắp Xếp Chèn (Insertion Sort)**
```java
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
```

### **2. Sắp Xếp Chọn (Selection Sort)**
```java
public void sapXepTang(double[] arr) {
    int n = arr.length;
    int i, j, min_idx;
    for (i = 0; i < n - 1; i++) {
        min_idx = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min_idx]) {
                min_idx = j;
            }
        }
        double temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }
}

public void sapXepGiam(double[] arr) {
    int n = arr.length;
    int i, j, max_idx;
    for (i = 0; i < n - 1; i++) {
        max_idx = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] > arr[max_idx]) {
                max_idx = j;
            }
        }
        double temp = arr[max_idx];
        arr[max_idx] = arr[i];
        arr[i] = temp;
    }
}
```

---
## **Hướng Dẫn Chạy Chương Trình**
1. Clone repository:
   ```bash
   git clone https://github.com/MinhThuongTMT/Baitap_03-Java-.git
   ```
2. Mở project trong IDE (Eclipse, IntelliJ IDEA,...)
3. Chạy lớp `Test.java` để kiểm tra kết quả.

---
## **Liên Hệ**
Mọi đóng góp hoặc thắc mắc, vui lòng liên hệ: tranminhthuong08082003@gmail.com


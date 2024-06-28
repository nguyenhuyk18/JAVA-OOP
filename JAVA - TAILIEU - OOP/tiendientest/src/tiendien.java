/*
 * @ (#) tiendien.java       2.0         8/24/2023
 *
 * Copyright (c) 2023 IUH. All rights reserved.
 * Ho Chi Minh City
 */

/*
 * @description:
 * @author:  Hoang Nghiem Ly
 * @date:    8/24/2023
 * @verison: 2.0
 */
public class tiendien {
    // 1.2Cho sẳn chương trình tính tiền điện, sinh viên tạo các unit test theo giá trị ở bảng 2 để kiểm thử. Điền vào bảng báo cáo theo file excel được cung cấp trên (copy sheet 1 sang thành sheet 2 và cập nhật trên sheet 2)

        public static void main(String[] args) {
            int chiSoCu = 5417; // Chỉ số cũ
            int chiSoMoi = 5417; // Chỉ số mới
            int tienDien = getTienDien(chiSoCu, chiSoMoi); // Tiền điện
            System.out.println("Tiền điện: " + tienDien);
        }

        public static int getTienDien(int chiSoCu, int chiSoMoi){

            final double THUE = 0.1; // Thuế VAT

            int soKWh = chiSoMoi - chiSoCu; // Số kWh tiêu thụ
            int tienDien = getSoKWh(soKWh, 400, Integer.MAX_VALUE) * 3015
                    + getSoKWh(soKWh, 300, 400) * 2919
                    + getSoKWh(soKWh, 200, 300) * 2612
                    + getSoKWh(soKWh, 100, 200) * 2074
                    + getSoKWh(soKWh, 50, 100) * 1786
                    + getSoKWh(soKWh, 0, 50) * 1728;

            return tienDien + (int)Math.ceil(tienDien * THUE);
        }

        public static int getSoKWh(int soKWh, int soDau, int soCuoi){

            if(soKWh < soDau)
                return 0;
            if(soKWh <= soCuoi)
                return soKWh - soDau;

            return soCuoi - soDau;
        }
    }
    // tạo JUnit test case
    import org.junit.Test;
    import static org.junit.Assert.*;
    // tạo class test
    public class tiendienTest {
        // tạo hàm test
        @Test
        public void testGetTienDien() {
            // tạo biến
            int chiSoCu = 5417;
            int chiSoMoi = 5417;
            // tạo biến kết quả
            int expResult = 0;
            // tạo biến kết quả thực tế
            int result = tiendien.getTienDien(chiSoCu, chiSoMoi);
            // so sánh kết quả thực tế với kết quả mong đợi
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            // fail("The test case is a prototype.");
        }
        // tạo nhiều test case không cần viết lại hàm
        @Test

        public void testGetTienDien1() {
            int chiSoCu = 5417;
            int chiSoMoi = 5418;
            int expResult = 1728;
            int result = tiendien.getTienDien(chiSoCu, chiSoMoi);
            assertEquals(expResult, result);
        }
        @Test
        public void testGetTienDien2() {
            int chiSoCu = 5417;
            int chiSoMoi = 5419;
            int expResult = 3456;
            int result = tiendien.getTienDien(chiSoCu, chiSoMoi);
            assertEquals(expResult, result);
        }


}

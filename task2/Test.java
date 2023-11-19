package task2;

import java.lang.reflect.AccessibleObject;

public class Test {
    public static void main(String[] args) {
        DanhMucAnPham dmap = new DanhMucAnPham();

        AnPham stk1 = new SachThamKhao("A", 120, 2023, "AA", 50000, "AAA");
        AnPham stk2 = new SachThamKhao("B", 234, 2043, "BB", 40000, "BBB");
        AnPham stk3 = new SachThamKhao("C", 140, 2023, "AA", 43000, "AAA");

        ChuongSach c1 = new ChuongSach("a", 5);
        ChuongSach c2 = new ChuongSach("b", 6);
        ChuongSach c3 = new ChuongSach("c", 7);
        ChuongSach c4 = new ChuongSach("d", 8);
        ChuongSach c5 = new ChuongSach("e", 9);
        ChuongSach c6 = new ChuongSach("f", 10);
        ChuongSach c7 = new ChuongSach("g", 11);
        ChuongSach c8 = new ChuongSach("h", 12);
        ChuongSach c9 = new ChuongSach("j", 13);

        stk1.addChuongSach(c1);
        stk1.addChuongSach(c2);
        stk1.addChuongSach(c3);
        stk1.addChuongSach(c4);
        stk1.addChuongSach(c5);
        stk2.addChuongSach(c6);
        stk3.addChuongSach(c7);
        stk3.addChuongSach(c8);
        stk3.addChuongSach(c9);

        AnPham tc1 = new TapChi("D", 12, 2023, "DD", 12000, "DDD");
        AnPham tc2 = new TapChi("D", 15, 2024, "EE", 12000, "EEE");
        AnPham tc3 = new TapChi("F", 17, 2024, "FF", 12000, "FFF");

        dmap.add(stk1);
        dmap.add(stk2);
        dmap.add(stk3);
        dmap.add(tc1);
        dmap.add(tc2);
        dmap.add(tc3);

        //test cau7
//        System.out.println(dmap.kiemTraTapChiXuatBan(stk1));
//        System.out.println(dmap.kiemTraTapChiXuatBan(tc1));
        // test cau8
//        System.out.println(dmap.kiemTraCungLoaiCungTacGia(stk1, stk2));
//        System.out.println(dmap.kiemTraCungLoaiCungTacGia(stk1, stk3));
        //test cau 9
//        System.out.println(dmap.tinhTongTien());
        //test cau10
//        System.out.println(dmap.timSachThamKhaoCoChuongNhieuTrang());
        //test cau 11
//        System.out.println(dmap.timTapChi("EEh"));
        //test cau 12
//        System.out.println(dmap.timTapChiTheoNam(2024).toString());
        //test cau 13
//        System.out.println(dmap.getDsAnPham().toString());
//        dmap.sapXepDSAnpham();
//        System.out.println(dmap.getDsAnPham().toString());
        //test cau 13
        System.out.println(dmap.thongKeAnPham().toString());
    }
}

package task2;

import java.util.*;

public class DanhMucAnPham {
    private List<AnPham> dsAnPham;

    //cau 6
    public DanhMucAnPham() {
        this.dsAnPham = new ArrayList<>();
    }

    public List<AnPham> getDsAnPham() {
        return dsAnPham;
    }

    public void add(AnPham ap){
        dsAnPham.add(ap);
    }
    //cau 6
    public boolean laTapChi(AnPham anPham) {
        return anPham instanceof TapChi;
    }

    public boolean laSachThamKhao(AnPham anPham) {
        return anPham instanceof SachThamKhao;
    }

    public boolean cungLoai(AnPham a1, AnPham a2) {
        return ((laTapChi(a1) && laTapChi(a2)) || (laSachThamKhao(a1) && laSachThamKhao(a2)));
    }

    // cau 7
    public boolean kiemTraTapChiXuatBan(AnPham anPham) {
        if (laTapChi(anPham)) {
            if (2021 - anPham.getNamXuatBan() < 10) return true;
        }
        return false;
    }

    // cau 8
    public boolean kiemTraCungLoaiCungTacGia(AnPham a1, AnPham a2) {
        if (a1.getTacGia().equals(a2.getTacGia())) {
            return cungLoai(a1, a2);
        }
        return false;
    }

    // cau 9
    public int tinhTongTien() {
        int sum = 0;
        for (AnPham a : dsAnPham) {
            sum += a.getGiaTien();
        }
        return sum;
    }

    // cau 10
    public AnPham timSachThamKhaoCoChuongNhieuTrang() {
        AnPham anPhamCanTim = null;
        int maxTrangSach = 0;
        for (AnPham ap : dsAnPham) {
            if (laSachThamKhao(ap)) {
                if (ap.maxSoTrangCuaChuongAnPham() > maxTrangSach) {
                    maxTrangSach = ap.maxSoTrangCuaChuongAnPham();
                    anPhamCanTim = ap;
                }
            }
        }
        return anPhamCanTim;
    }
    //cau 11
    public boolean timTapChi(String title) {
        for (AnPham ap : dsAnPham) {
            if (laTapChi(ap)) {
                if (ap.timTenTapChi(title)) {
                    return true;
                }
            }
        }
        return false;
    }
    ///cau 12
    public List<AnPham> timTapChiTheoNam(int year){
        List<AnPham> listTapChiNam = new ArrayList<>();
        for(AnPham ap : dsAnPham){
            if(laTapChi(ap) && ap.getNamXuatBan()== year){
                listTapChiNam.add(ap);
            }
        }
        return listTapChiNam;
    }

    //cau 13
    public void sapXepDSAnpham(){
        dsAnPham.sort(new Comparator<AnPham>() {
            @Override
            public int compare(AnPham o1, AnPham o2) {
                int compare = o1.getTieuDe().compareTo(o2.getTieuDe());
                if(compare == 0){
                    compare = o2.getNamXuatBan() - o1.getNamXuatBan();
                }
                return compare;
            }
        });
    }
    //cau 14
    public Map<Integer, Integer> thongKeAnPham(){
        Map<Integer, Integer> dsDaThongKe = new HashMap<>();
        for(AnPham ap : dsAnPham){
            dsDaThongKe.put(ap.getNamXuatBan(), dsDaThongKe.getOrDefault(ap.getNamXuatBan(), 0)+1);
        }
        return dsDaThongKe;
    }

}

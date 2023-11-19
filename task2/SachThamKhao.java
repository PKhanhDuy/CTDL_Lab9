package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SachThamKhao extends AnPham {
    private String linhVuc;
    private List<ChuongSach> dsChuongSach;

    public SachThamKhao(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien, String linhVuc) {
        super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
        this.linhVuc = linhVuc;
        this.dsChuongSach = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SachThamKhao that)) return false;
        if (!super.equals(o)) return false;
        return linhVuc.equals(that.linhVuc) && dsChuongSach.equals(that.dsChuongSach);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), linhVuc, dsChuongSach);
    }

    public void addChuongSach(ChuongSach cs){
        dsChuongSach.add(cs);
    }
    @Override
    public int maxSoTrangCuaChuongAnPham() {
        int max = 0;
        for (ChuongSach cs : dsChuongSach) {
            if(cs.getSoTrang() > max) max = cs.getSoTrang();
        }
        return max;
    }

    @Override
    public boolean timTenTapChi(String title) {
        return false;
    }

    @Override
    public String toString() {
        return "SachThamKhao{" +
                "linhVuc=" + linhVuc + '\'' +
                ", dsChuongSach=" + dsChuongSach +
                ", tieuDe=" + tieuDe + '\'' +
                ", soTrang=" + soTrang +
                ", namXuatBan=" + namXuatBan +
                ", tacGia=" + tacGia + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}

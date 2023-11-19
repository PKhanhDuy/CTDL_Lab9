package task2;

import java.util.List;
import java.util.Objects;

public class TapChi extends AnPham {
    private String tenTapChi;

    public TapChi(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien, String tenTapChi) {
        super(tieuDe, soTrang, namXuatBan, tacGia, giaTien);
        this.tenTapChi = tenTapChi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TapChi tapChi)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(tenTapChi, tapChi.tenTapChi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tenTapChi);
    }

    @Override
    public int maxSoTrangCuaChuongAnPham() {
        return 0;
    }

    @Override
    public boolean timTenTapChi(String title) {
        return tenTapChi.equals(title);
    }

    @Override
    public void addChuongSach(ChuongSach cs) {}

    @Override
    public String toString() {
        return "TapChi{" +
                "tenTapChi='" + tenTapChi + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", soTrang=" + soTrang +
                ", namXuatBan=" + namXuatBan +
                ", tacGia='" + tacGia + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }
}

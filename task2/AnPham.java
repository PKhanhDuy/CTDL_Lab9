package task2;

import java.util.Objects;

public abstract class AnPham {
    protected String tieuDe;
    protected int soTrang;
    protected int namXuatBan;
    protected String tacGia;
    protected int giaTien;

    protected AnPham(String tieuDe, int soTrang, int namXuatBan, String tacGia, int giaTien) {
        this.tieuDe = tieuDe;
        this.soTrang = soTrang;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
        this.giaTien = giaTien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnPham anPham)) return false;
        return getSoTrang() == anPham.getSoTrang() && getNamXuatBan() == anPham.getNamXuatBan() && getGiaTien() == anPham.getGiaTien() && Objects.equals(getTieuDe(), anPham.getTieuDe()) && Objects.equals(getTacGia(), anPham.getTacGia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTieuDe(), getSoTrang(), getNamXuatBan(), getTacGia(), getGiaTien());
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public abstract int maxSoTrangCuaChuongAnPham();

    public abstract boolean timTenTapChi(String title);

    public abstract void addChuongSach(ChuongSach cs);

}

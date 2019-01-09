package comm.example.pc.storepham;

public class Commodity {
    private String TenSanPham;
    private String Hang;
    private int Hinhanh;
    private String Kichthuoc;
    private String Baohanh;
    private String Soluongcon;
    private  String Gia;

    public Commodity(String tenSanPham, String hang, int hinhanh, String kichthuoc, String baohanh, String soluongcon, String gia) {
        TenSanPham = tenSanPham;
        Hang = hang;
        Hinhanh = hinhanh;
        Kichthuoc = kichthuoc;
        Baohanh = baohanh;
        Soluongcon = soluongcon;
        Gia = gia;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String hang) {
        Hang = hang;
    }

    public int getHinhanh() {
        return Hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        Hinhanh = hinhanh;
    }

    public String getKichthuoc() {
        return Kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        Kichthuoc = kichthuoc;
    }

    public String getBaohanh() {
        return Baohanh;
    }

    public void setBaohanh(String baohanh) {
        Baohanh = baohanh;
    }

    public String getSoluongcon() {
        return Soluongcon;
    }

    public void setSoluongcon(String soluongcon) {
        Soluongcon = soluongcon;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }
}

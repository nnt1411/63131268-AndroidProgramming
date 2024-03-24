package ntu.mssv63131268;

public class DanhBa {
    private String Ten;
    private String SoDienThoai;
    private int idAnh;

    public DanhBa(String ten, String soDienThoai, int idAnh) {
        Ten = ten;
        SoDienThoai = soDienThoai;
        this.idAnh = idAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public void setIdAnh(int idAnh) {
        this.idAnh = idAnh;
    }
}


package thanh.edu.listviewmenumonan;

public class MonAn {
    private String TenMonAn;
    private Double DonGia;
    private String MoTa;
    private int idAnhMinhHoa;

    //ham tao

    public MonAn(String tenMonAn, Double donGia, String moTa, int idAnhMinhHoa) {
        TenMonAn = tenMonAn;
        DonGia = donGia;
        MoTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    public String getTenMonAn() {
        return TenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        TenMonAn = tenMonAn;
    }

    public Double getDonGia() {
        return DonGia;
    }

    public void setDonGia(Double donGia) {
        DonGia = donGia;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}

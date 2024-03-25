package ntu.mssv63131268;

public class ThongTin {
    private String TTin;
    private String CTiet;

    public ThongTin(String TTin, String CTiet) {
        this.TTin = TTin;
        this.CTiet = CTiet;
    }

    public String getTTin() {
        return TTin;
    }

    public void setTTin(String TTin) {
        this.TTin = TTin;
    }

    public String getCTiet() {
        return CTiet;
    }

    public void setCTiet(String CTiet) {
        this.CTiet = CTiet;
    }
}

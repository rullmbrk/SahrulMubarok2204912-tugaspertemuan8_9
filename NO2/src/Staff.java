public class Staff extends Employee {
    private String title;

    public Staff(String nama, String alamat, String nomortelepon, String alamatemail, String kantor, double gaji, MyDate dateHired, String title) {
        super(nama, alamat, nomortelepon, alamatemail, kantor, gaji, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, nama: " + getnama() + ", kantor: " + getkantor() + ", gaji: " + getgaji() + ", tanggal dipekerjakan: " + getDateHired() + ", Title: " + title;
    }

}

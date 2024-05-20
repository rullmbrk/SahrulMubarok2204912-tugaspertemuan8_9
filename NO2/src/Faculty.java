public class Faculty extends Employee {
    private int kantorHours;
    private String rank;

    public Faculty(String nama, String alamat, String nomortelepon, String alamatemail, String kantor, double gaji, MyDate dateHired, int kantorHours, String rank) {
        super(nama, alamat, nomortelepon, alamatemail, kantor, gaji, dateHired);
        this.kantorHours = kantorHours;
        this.rank = rank;
    }

    public int getkantorHours() {
        return kantorHours;
    }

    public void setkantorHours(int kantorHours) {
        this.kantorHours = kantorHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, nama: " + getnama() + ", kantor: " + getkantor() + ", gaji: " + getgaji() + ", tanggal dipekerjakan: " + getDateHired() + ", kantor Hours: " + kantorHours + ", Rank: " + rank;
    }

}

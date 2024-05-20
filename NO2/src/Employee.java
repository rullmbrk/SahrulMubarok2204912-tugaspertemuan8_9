public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate dateHired;

    public Employee(String nama, String alamat, String nomortelepon, String alamatemail, String kantor, double gaji, MyDate dateHired) {
        super(nama, alamat, nomortelepon, alamatemail);
        this.kantor = kantor;
        this.gaji = gaji;
        this.dateHired = dateHired;
    }

    public String getkantor() {
        return kantor;
    }

    public void setkantor(String kantor) {
        this.kantor = kantor;
    }

    public double getgaji() {
        return gaji;
    }

    public void setgaji(double gaji) {
        this.gaji = gaji;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, nama: " + getnama() + ", kantor: " + kantor + ", gaji: " + gaji + ", tanggal dipekerjakan: " + dateHired;
    }

}

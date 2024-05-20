public class Student extends Person {
    public static final String MahasiswaBaru = "Mahasiswa Baru";
    public static final String MahasiswaTahunKedua = "Mahasiswa Tahun Kedua";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";

    private String status;

    public Student(String nama, String alamat, String nomortelepon, String emailalamat, String status) {
        super(nama, alamat, nomortelepon, emailalamat);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, nama: " + getnama() + ", Status: " + status;
    }

}

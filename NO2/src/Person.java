public class Person {
    private String nama;
    private String alamat;
    private String nomortelepon;
    private String alamatemail;

    public Person(String nama, String alamat, String nomortelepon, String alamatemail) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomortelepon = nomortelepon;
        this.alamatemail = alamatemail;
    }

    public String getnama() {
        return nama;
    }

    public String getalamat() {
        return alamat;
    }

    public String getnomortelepon() {
        return nomortelepon;
    }

    public String getalamatemail() {
        return alamatemail;
    }

    @Override
    public String toString() {
        return "Class: Person, nama: " + nama + ", alamat: " + alamat + ", nomortelepon: " + nomortelepon + ", Email: " + alamatemail;
    }

}

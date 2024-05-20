public class TestClasses {
    public static void main(String[] args) {
        Person person = new Person("Ujang", "setiabudi", "087828", "ujang.com");
        Student student = new Student("Asep", "gerlong", "082212", "asep.com", Student.MahasiswaTahunKedua);
        MyDate dateHired = new MyDate(2020, 5, 15);
        Employee employee = new Employee("Udin", "gerum", "088919", "udin.com", "kantor 1", 500000, dateHired);
        Faculty faculty = new Faculty("Komar", "cilimus", "085672", "komar.com", "kantor 2", 500000, dateHired, 10, "Professor");
        Staff staff = new Staff("madun", "ledeng", "089121", "madun.com", "kantor 3", 500000, dateHired, "Manager");

        System.out.println("Person Information:");
        System.out.println("nama: " + person.getnama());
        System.out.println("alamat: " + person.getalamat());
        System.out.println("nomortelepon: " + person.getnomortelepon());
        System.out.println("Email: " + person.getalamatemail());
        System.out.println();

        System.out.println("Student Information:");
        System.out.println("nama: " + student.getnama());
        System.out.println("alamat: " + student.getalamat());
        System.out.println("nomortelepon: " + student.getnomortelepon());
        System.out.println("Email: " + student.getalamatemail());
        System.out.println("Status: " + student.getStatus());
        System.out.println();

        System.out.println("Employee Information:");
        System.out.println("nama: " + employee.getnama());
        System.out.println("alamat: " + employee.getalamat());
        System.out.println("nomortelepon: " + employee.getnomortelepon());
        System.out.println("Email: " + employee.getalamatemail());
        System.out.println("kantor: " + employee.getkantor());
        System.out.println("gaji: " + employee.getgaji());
        System.out.println("tanggal dipekerjakan: " + employee.getDateHired());
        System.out.println();

        System.out.println("Faculty Information:");
        System.out.println("nama: " + faculty.getnama());
        System.out.println("alamat: " + faculty.getalamat());
        System.out.println("nomortelepon: " + faculty.getnomortelepon());
        System.out.println("Email: " + faculty.getalamatemail());
        System.out.println("kantor: " + faculty.getkantor());
        System.out.println("gaji: " + faculty.getgaji());
        System.out.println("tanggal dipekerjakan: " + faculty.getDateHired());
        System.out.println("kantor Hours: " + faculty.getkantorHours());
        System.out.println("Rank: " + faculty.getRank());
        System.out.println();

        System.out.println("Staff Information:");
        System.out.println("nama: " + staff.getnama());
        System.out.println("alamat: " + staff.getalamat());
        System.out.println("nomortelepon: " + staff.getnomortelepon());
        System.out.println("Email: " + staff.getalamatemail());
        System.out.println("kantor: " + staff.getkantor());
        System.out.println("gaji: " + staff.getgaji());
        System.out.println("tanggal dipekerjakan: " + staff.getDateHired());
        System.out.println("Title: " + staff.getTitle());
    }
}

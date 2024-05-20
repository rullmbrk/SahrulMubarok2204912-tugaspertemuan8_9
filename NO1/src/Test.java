import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan sisi pertama: ");
            double side1 = input.nextDouble();
            input.nextLine(); 

            System.out.print("Masukkan sisi kedua: ");
            double side2 = input.nextDouble();
            input.nextLine();

            System.out.print("Masukkan sisi ketiga: ");
            double side3 = input.nextDouble();
            input.nextLine(); 

            System.out.print("Masukkan warna: ");
            String warna = input.nextLine();

            System.out.print("Apakah segitiga terisi (true/false): ");
            boolean terisi = input.nextBoolean();

            Segitiga segitiga = new Segitiga(side1, side2, side3);
            segitiga.setwarna(warna);
            segitiga.setterisi(terisi);

            System.out.println("Luas segitiga: " + segitiga.getArea());
            System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
            System.out.println("Warna segitiga: " + segitiga.getwarna());
            System.out.println("Apakah segitiga terisi: " + segitiga.isterisi());
            System.out.println(segitiga);
        } finally {
            input.close(); 
        }
    }
}

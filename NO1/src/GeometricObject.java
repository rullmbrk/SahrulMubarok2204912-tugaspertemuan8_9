public class GeometricObject {
    private String warna;
    private boolean terisi;

    public GeometricObject() {
        warna = "white";
        terisi = false;
    }

    public GeometricObject(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getwarna() {
        return warna;
    }

    public void setwarna(String warna) {
        this.warna = warna;
    }

    public boolean isterisi() {
        return terisi;
    }

    public void setterisi(boolean terisi) {
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return "warna: " + warna + " and terisi: " + terisi;
    }
}

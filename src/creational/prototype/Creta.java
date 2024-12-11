package creational.prototype;

public class Creta extends Car {

    private String sunRoof = "normal";

    public void topEnd() {
        this.sunRoof = "Panaromic";
    }

    @Override
    public String toString() {
        ;
        return super.toString() + "Creta{" +
                "sunRoof='" + sunRoof + '\'' +
                '}';
    }

    @Override
    public void reset() {
        this.body = null;
        this.engine = null;
        this.interior = null;
    }
}

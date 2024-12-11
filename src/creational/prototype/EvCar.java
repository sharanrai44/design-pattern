package creational.prototype;

public class EvCar extends Car {
    public String battery = " battery enabled";

    @Override
    public EvCar clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Connot clean clone of ev car");
    }

    @Override
    public void reset() {
        this.body = null;
        this.engine = null;
        this.interior = null;
    }

    @Override
    public String toString() {
        return "EvCar{" +
                "battery='" + battery + '\'' +
                ", body='" + body + '\'' +
                ", engine='" + engine + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}

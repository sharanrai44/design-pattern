package creational.prototype;


//Prototype design patter is simple. it just talks about how to create a cloned copy of the object
// instead creating a new object every time. so in the abstact class we should provied method to clone
//as well as method to reset  details when we clone an object
// we can return a shallow copy if we can change the most of the fields and except  final fields and deep copy if all the fields needs to be changed
public abstract class Car implements Cloneable {

    protected   String body;
    protected   String engine;
    protected String interior;

    public Car() {
        this.body="Steel body";
        this.engine="toyota";
        this.interior="basic interior";
    }

    public Car(String body, String engine, String interior) {
        this.body = body;
        this.engine = engine;
        this.interior = interior;
    }


  public  abstract void reset();

    @Override
    public Car clone() throws CloneNotSupportedException {
            Car clone = (Car) super.clone();
            clone.initialize();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;

    }

    private void initialize() {
        this.body="Steel body";
        this.engine="toyota";
        this.interior="basic interior";
        reset();
    }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                ", engine='" + engine + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}

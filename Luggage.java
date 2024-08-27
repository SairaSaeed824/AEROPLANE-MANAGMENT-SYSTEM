public class Luggage {
    private String type;
    private double weight;
    private double length;
    private double width;
    private double height;
    private Passenger owner;  // Reference to the owner of the luggage

    public Luggage(String type, double weight, double length, double width, double height, Passenger owner) {
        this.type = type;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Passenger getOwner() {
        return owner;
    }

    public void setOwner(Passenger owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", owner=" + owner.getName() +
                '}';
    }
}

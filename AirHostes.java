public class AirHostes extends Person{
    private double height;
    private double weight;
    private String qualification;
    private AirHostesType type;

    public AirHostes(String name, String cnic, String phoneNumber, String email, String nationality, String gender, double height, double weight, String qualification, AirHostesType type) {
        super(name, cnic, phoneNumber, email, nationality, gender);
        this.height = height;
        this.weight = weight;
        this.qualification = qualification;
        this.type = type;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public AirHostesType getType() {
        return type;
    }

    public void setType(AirHostesType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AirHostes{"+super.toString() +
                "height=" + height +
                ", weight=" + weight +
                ", qualification='" + qualification + '\'' +
                ", type=" + type +
                '}';
    }
}

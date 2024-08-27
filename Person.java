public abstract class Person {
    private String name;
    private String Cnic;
    private String PhoneNumber;
    private String email;
    private String nationality;
    private String Gender;

    public Person(String name, String cnic, String phoneNumber, String email, String nationality, String gender) {
        this.name = name;
        Cnic = cnic;
        PhoneNumber = phoneNumber;
        this.email = email;
        this.nationality = nationality;
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return Cnic;
    }

    public void setCnic(String cnic) {
        Cnic = cnic;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Cnic='" + Cnic + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", nationality='" + nationality + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}

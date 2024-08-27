public class Pilot extends Person{
    private int experienceYears;
    private PilotType type;

    public Pilot(String name, String cnic, String phoneNumber, String email, String nationality, String gender, int experienceYears, PilotType type) {
        super(name, cnic, phoneNumber, email, nationality, gender);
        this.experienceYears = experienceYears;
        this.type = type;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public PilotType getType() {
        return type;
    }

    public void setType(PilotType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pilot{" +super.toString()+
                "experienceYears=" + experienceYears +
                ", type=" + type +
                '}';
    }
}

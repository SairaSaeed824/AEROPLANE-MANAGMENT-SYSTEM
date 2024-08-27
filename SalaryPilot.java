public class SalaryPilot {
    PilotType type;
    public SalaryPilot(PilotType type) {
        this.type=type;
    }

    public void Salary(PilotType type){
        double salary= type.payPilot;
        System.out.println("SALARY OF"+type+" is "+ salary);
    }
}

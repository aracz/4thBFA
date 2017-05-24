
public class Pilot extends Employee {

    private boolean compass;

    public Pilot(String name, int phone, int DOB, int salary, boolean uniform, boolean compass){
        super(name, phone, DOB, salary, uniform);
        this.compass = compass;
    }


}

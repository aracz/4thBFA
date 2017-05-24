
public class Employee extends People {

    private int salary;
    private boolean uniform;

    public Employee(String name, int phone, int DOB, int salary, boolean uniform) {
        super(name, phone, DOB);
        this.salary = salary;
        this.uniform = uniform;

    }


    public int getSalary() { return this.salary; }
    public void setSalary(int salary) { this.salary = salary; }


    public boolean isUniform() {
        return uniform;
    }

    public void setUniform(boolean uniform) {
        this.uniform = uniform;
    }

    public void setYearPassed(){
        setUniform(true);

    }
}



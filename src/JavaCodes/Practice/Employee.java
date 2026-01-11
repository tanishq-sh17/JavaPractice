package JavaCodes.Practice;

public sealed class Employee permits FullTimeEmployee, ContractorEmployee {
    private String name;
    private int id;

    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printEmployeeType(){
        System.out.println("Employee");
    }
}

final class ContractorEmployee extends Employee {

    ContractorEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public void printEmployeeType() {
        System.out.println("ContractorEmployee");
    }
}

final class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public void printEmployeeType() {
        System.out.println("FullTimeEmployee");
    }
}
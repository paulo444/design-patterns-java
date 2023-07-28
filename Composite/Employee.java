package Composite;

public class Employee implements ChurrosCompany {

    private String employeeName;

    Employee(String employee){
        employeeName = employee;
    }

    @Override
    public String getSectionName() {
        return employeeName;
    }

    @Override
    public void addSection(ChurrosCompany churro) {
        throw new UnsupportedOperationException("Unimplemented method 'addSection'");
    }

    @Override
    public void generateHierarchy() {
        System.out.println("-Employee: " + employeeName);
    }
    
}

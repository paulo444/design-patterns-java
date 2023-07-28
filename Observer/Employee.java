package Observer;

public class Employee implements ObserverInt {

    private String employeeName;

    public Employee(String name){
        employeeName = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(employeeName + ": " + msg);
    }
}

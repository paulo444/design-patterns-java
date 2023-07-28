package Composite;

public class Main {
    public static void main(String[] args){
        //COMPOSITE
        ChurrosCompany churrosCompany = new CompanySection("Churros Company");

        ChurrosCompany productionEmployees = new CompanySection("Production Employees");
        ChurrosCompany salesEmployees = new CompanySection("Sales Employees");
        ChurrosCompany distributionStores = new CompanySection("Distribution Stores");
        ChurrosCompany mainStore = new CompanySection("Main Store");

        ChurrosCompany employeeP1 = new Employee("Production Employee 1");
        ChurrosCompany employeeS1 = new Employee("Sales Employee 1");
        ChurrosCompany employeeS2 = new Employee("Sales Employee 2");
        ChurrosCompany employeeMS1 = new Employee("Main Store Employee 1");
        ChurrosCompany employeeMS2 = new Employee("Main Store Employee 2");
        ChurrosCompany employeeMS3 = new Employee("Main Store Employee 3");
        ChurrosCompany employeeMS4 = new Employee("Main Store Employee 4");

        churrosCompany.addSection(productionEmployees);
        churrosCompany.addSection(salesEmployees);
        churrosCompany.addSection(distributionStores);
        distributionStores.addSection(mainStore);

        productionEmployees.addSection(employeeP1);
        salesEmployees.addSection(employeeS1);
        salesEmployees.addSection(employeeS2);
        mainStore.addSection(employeeMS1);
        mainStore.addSection(employeeMS2);
        mainStore.addSection(employeeMS3);
        mainStore.addSection(employeeMS4);

        churrosCompany.generateHierarchy();
    }
}

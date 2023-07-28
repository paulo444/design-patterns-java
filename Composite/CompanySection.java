package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompanySection implements ChurrosCompany{

    private String sectionName;
    private List<ChurrosCompany> employees;

    CompanySection(String section){
        sectionName = section;
        employees = new ArrayList<ChurrosCompany>();
    }

    @Override
    public String getSectionName() {
        return sectionName;
    }

    @Override
    public void addSection(ChurrosCompany churro) {
        employees.add(churro);
    }

    @Override
    public void generateHierarchy() {
        System.out.println(sectionName);
        for(int i=0; i<employees.size(); i++){
            employees.get(i).generateHierarchy();
        }
        System.out.println("/" + sectionName);
    }
    
}

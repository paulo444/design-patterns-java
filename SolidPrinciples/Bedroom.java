package SolidPrinciples;

public class Bedroom implements Room {
    Television television;

    public Bedroom(Television tv){
        television = tv;
    }

    public void sleep(){

    }

    public void prepareFood(){

    }

    @Override
    public void turnLight() {
        
    }
}

package SolidPrinciples;

class Solid{
    public static void sleep(Bed bed){
        bed.sleep();
    }

    public static void main(String[] args){
        Bed bed = new SingleBed();
        Bed kingBed = new KingBed();

        sleep(bed);
        sleep(kingBed);
    }

}
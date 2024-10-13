package PlantHotel;

public class cactus extends plants implements type {

    private double mineralWaterIntake = 0.02;
    private String plantType = "Kaktusen";

    public cactus(String name, double length, String drink) {
        super(name, length, drink);
    }

    public double drinks(){
        return mineralWaterIntake;
    }

    public String typePlant() {
        return plantType;
    }


}


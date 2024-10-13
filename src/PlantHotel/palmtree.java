package PlantHotel;

public class palmtree extends plants implements type { //klassen PlantHotel.palmtree ärver klassen PlantHotel.plants

    private double waterIntake = 0.5;
    private double drinks;
    private String plantType = "Palmen";


    public palmtree(String name, double length, String drink) {
        super(name, length, drink);
    }


    public double drinks() {
        return waterIntake * length;

    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String typePlant() {
        return plantType;
    }

}


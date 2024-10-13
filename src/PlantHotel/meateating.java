package PlantHotel;

public class meateating extends plants implements type { //klassen meateating ärver klassen plants

    private double proteinDrinkDaily = 0.1;
    private double proteinDrinkAdded = 0.2;
    private String plantType = "Köttätande växten";


    public meateating(String name, double lenght, String drink){
        super(name, lenght, drink);
    }

    public double drinks() {
        return proteinDrinkDaily + (length * proteinDrinkAdded);

    }

    public String typePlant() {
        return plantType;
    }


}

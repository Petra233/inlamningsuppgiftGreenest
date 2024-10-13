package PlantHotel;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        plants Laura = new palmtree("Laura", 5, "kranvatten"); //Här har vi polymofism då dom
        plants Olof = new palmtree("Olof", 1, "kranvatten");//polymorfism
        plants MeatLoaf = new meateating("Meatloaf", 0.7, "proteindryck"); //polymorfism
        plants Iggy = new cactus("Igge", 0.2, "mineralvatten"); // polymorfism

        ArrayList<plants> allPlants = new ArrayList<>(); // Skapar en arraylista där alla växter finns
        allPlants.add(Laura);
        allPlants.add(Olof);
        allPlants.add(MeatLoaf);
        allPlants.add(Iggy);

        String option = JOptionPane.showInputDialog(null, "Vilken växt vill du vattna?"); //frågar användaren vilken växt dom vill vattna

        plants selectedPlant = null; //loopar igenom arraylistan PlantHotel.plants för att se om namnet inmatat finns
        if (option != null) {
            for (plants p : allPlants)
                if (option.equals(p.getName())) {
                    selectedPlant = p;  // om namnet finns så blir variabeln selectedPlant det namnet.
                    break;
                }
        }

        if (selectedPlant != null) // Här används interfacet PlantHotel.type för att beskriva vilken typ av växt det är.
            JOptionPane.showMessageDialog(null,   selectedPlant.typePlant()+" " + selectedPlant.getName() + " dricker " + selectedPlant.drinks()+  " liter " +selectedPlant.getDrink()); // Här anropad interfacet PlantHotel.type för att beskriva vilken typ av växt det är.

        else {
            JOptionPane.showMessageDialog(null, "Error! Skriv ett annat namn");


        }
    }
}


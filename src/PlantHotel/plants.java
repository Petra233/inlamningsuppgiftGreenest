package PlantHotel;

public abstract class plants {

    protected String name;
    protected double length;
    protected String drink;


    public plants(String name, double length, String drink) {
        this.name = name;
        this.length = length;
        this.drink = drink;

    }

    public String getName() {
        return name;

    }

    public double getLength() {
        return length;


    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "PlantHotel.plants{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }

    public abstract double drinks();

    public abstract String typePlant();

}








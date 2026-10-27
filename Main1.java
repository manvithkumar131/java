public class Main1 {
    public static void main(String[] args) {
        EnergySource e;

        e = new SolarEnergy(101, "Solar Panel", 4000);
        e.displayDetails();

        e = new WindEnergy(102, "Wind Turbine", 6000);
        e.displayDetails();
    }
}
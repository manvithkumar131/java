abstract class EnergySource {
    int sourceID;
    String sourceName;
    double energyGenerated;

    EnergySource(int id, String name, double energy) {
        sourceID = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID: " + sourceID);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
        System.out.println();
    }
}
class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    
    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}
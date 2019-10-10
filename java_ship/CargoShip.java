/**
 @author Kevin M. Mallgrave
 */
import java.util.Scanner;
public class CargoShip extends Ship {
    //instance variables
    private int maximumCargo;

    //constructors
    public CargoShip() {
        this.setName("Unnamed");
        this.setYearBuilt(2000);
        this.setMaximumCargo(500);
    }

    public CargoShip(String name, int yearBuilt, int maxCargo) {
        this.setName(name);
        this.setYearBuilt(yearBuilt);
        this.setMaximumCargo(maxCargo);
    }

    // getters
    public int getMaximumCargo() {
        return this.maximumCargo;
    }

    //setters
    public void setMaximumCargo(int maximumCargo) {
        this.maximumCargo = maximumCargo;
    }
    //output methods
    public boolean equals(CargoShip shipObject) {
        boolean equals = false;
        if ((shipObject != null) && (shipObject instanceof Ship)) {
            Ship shipInstance = (Ship)shipObject;
            equals =
                    super.equals(shipInstance) &&
                            this.getMaximumCargo() == shipObject.getMaximumCargo();
        }
        return equals;
    }

    public String toString() {
        String objectInfo = "";
        objectInfo = super.toString() +
                "\nShip max cargo: " + this.getMaximumCargo();
        return objectInfo;
    }
}

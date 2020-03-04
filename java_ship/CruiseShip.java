/**
 @author Kevin M. Mallgrave
 mv*/
import java.util.Scanner;
public class CruiseShip extends Ship {
  //instance variables
  private int maximumPassengers;

  //constructors
  public CruiseShip() {
    this.setName("Unnamed");
    this.setYearBuilt(2000);
    this.setMaximumPassengers(1000);
  }

  public CruiseShip(String name, int yearBuilt, int maximumPassengers) {
    this.setName(name);
    this.setYearBuilt(yearBuilt);
    this.setMaximumPassengers(maximumPassengers);
  }

  // getters
  public int getMaximumPassengers() {
    return this.maximumPassengers;
  }

  //setters
  public void setMaximumPassengers(int maximumPassengers) {
    this.maximumPassengers = maximumPassengers;
  }
  //output methods

  public boolean equals(CruiseShip shipObject) {
    boolean equals = false;
    if ((shipObject != null) && (shipObject instanceof Ship)) {
      Ship shipInstance = (Ship)shipObject;
      equals = super.equals(shipInstance) && this.getMaximumPassengers() == shipObject.getMaximumPassengers();
    }
    return equals;
  }

  public String toString() {
    String objectInfo = "";
    objectInfo = "\nCruise ship information:" +
            super.toString() +
            "\nShip max passengers: " + this.getMaximumPassengers();
    return objectInfo;
  }
}
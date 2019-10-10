/**
 @author Kevin M. Mallgrave
 */
import java.util.Scanner;
public class Ship {
  //instance variables
  private String name;
  private int yearBuilt;

  //constructors
  public Ship() {
    this.name = "Unnamed";
    this.yearBuilt = 2000;
  }
  public Ship(String name, int yearBuilt) {
    this.setName(name);
    this.setYearBuilt(yearBuilt);
  }
  // getters
  public int getYearBuilt() {
    return this.yearBuilt;
  }
  public String getName() {
    return this.name;
  }
  // setters
  public void setYearBuilt(int yearBuilt) {
    Scanner keyboard = new Scanner(System.in);
    while (yearBuilt < 1900 || yearBuilt > 2019) {
      System.out.printf("Please enter a valid year, 1900-2019\n");
      yearBuilt = keyboard.nextInt();
    }
    this.yearBuilt = yearBuilt;
  }

  public void setName(String name) {
    this.name = name;
  }
  //output methods
  public boolean equals(Ship shipObject) {
    boolean equals = false;
    if ((shipObject != null) && (shipObject instanceof Ship)) {
      Ship shipInstance = (Ship)shipObject;
      equals =
              this.getName() == shipObject.getName() &&
              this.getYearBuilt() == shipObject.getYearBuilt();
    }
    return equals;
  }

  public String toString() {
    String objectInfo = "";
    objectInfo = "\nShip information:" +
    "\nShip name:        " + this.getName()+
    "\nShip year built:  " + this.getYearBuilt();
    return objectInfo;
  }
}


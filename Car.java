public class Car{

    private String carName;

    private double milesDriven;

    private double gallonsUsed;

    public Car(){
        carName ="";
        milesDriven = 0;
        gallonsUsed = 0;
    }
    
    public Car(String carName, double milesDriven, double gallonsUsed){
        this.carName = carName;
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
    }
    
     // Getter
  public String getcarName() {
    return carName;
  }
  // Setter
  public void setName(String newName) {
    this.carName = newName;   
}


 // Getter
  public double getmilesDriven() {
    return milesDriven;
  }
  // Setter
  public void setmiles(double newMiles) {
    this.milesDriven = newMiles;   
}


 public double getgallonsUsed() {
    return gallonsUsed;
  }
  // Setter
  public void setgallons(double newGallons) {
    this.gallonsUsed = newGallons;   
}


public double calculateAverage(){
    
    double mpg = ((int)(milesDriven/gallonsUsed)*10)/10.0;
   
    return mpg;
}

public String toString(){
    return carName + "averaged" + calculateAverage() + "miles per gallon";
}

}

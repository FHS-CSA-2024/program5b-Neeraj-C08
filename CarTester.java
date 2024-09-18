import java.util.Scanner;


public class CarTester{
    
    Scanner myCar = new Scanner(System.in);
    
    public void main(String[] args){
        
        Car newcar = new CarTester().addCar();
        
        System.out.println(newcar);
        
         System.out.println("--------------------NEXT CAR----------------------");
         
        Car newcar2 = new CarTester().addCar();
        
        System.out.println(newcar2);
    }

    public Car addCar(){
        
     System.out.println("Enter your car name:");
     
    String newcarName = myCar.nextLine();
    
      System.out.println("Enter your miles driven:");
      
    double newmilesDriven = myCar.nextDouble();
    
    System.out.println("Enter your gallons used:");
        
    double newgallonsUsed =  myCar.nextDouble();
    
    return new Car(newcarName, newmilesDriven, newgallonsUsed);
    }
    
        
    
    
    
    
    
    
    
}


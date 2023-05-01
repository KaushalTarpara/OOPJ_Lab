import java.util.Scanner;

public class T1 {

  public static void main(String[] args) {
  
 
    Scanner sc = new Scanner(System.in);
    
 
    double wattage, hours, rate, cost;
    
 
    System.out.println("Enter the wattage of the device in watts:");
    
 
    wattage = sc.nextDouble();
    
 
    System.out.println("Enter the number of usage hours per day:");
    
 
    hours = sc.nextDouble();
    
 
    System.out.println("Enter the electricity rate per kWh in paisa:");
    
 
    rate = sc.nextDouble();
    
 
    sc.close();
    
    cost = (wattage * hours * rate) / 1000;
    
 
    System.out.println("The cost of using the device per day is " + cost + " paisa or " + (cost / 100) + " rupees.");
  }
}
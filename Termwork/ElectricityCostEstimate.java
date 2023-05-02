import java.util.Scanner;
import java.util.InputMismatchException;

public class ElectricityCostEstimate {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        do{        

            System.out.println("------------------------------------------------------");
            System.out.println("|    Welcome to Electricity Cost Estimation System    |");        
            System.out.println("------------------------------------------------------");
            
            try {
                  
            // Get rate  
            System.out.print("Enter your kWh rate (Rs): ");
            double kWhRate = sc.nextDouble();

            // Get number of devices            
            int numDevices;
                  System.out.print("Enter the number of devices: ");
                  do {
                     numDevices = sc.nextInt();
                     if(numDevices < 0 || numDevices > 30){
                        System.out.println("Please enter device in between 0 and 30.");
                     }
                  } while (numDevices < 0 || numDevices > 30);

            // Create array of devices
            Device[] devices = new Device[numDevices];

            // Get device details
            for (int i = 0; i < numDevices; i++) {
                  System.out.println("------------------------------------------------------");
                  System.out.println("\nEnter details for Device " + (i+1) + ":");

                  // Get device name
                  System.out.print("Name: ");
                  String name = sc.next();

                  // Get device wattage
                  System.out.print("Wattage: ");
                  double wattage = sc.nextDouble();

                  // Get device usage hours per day
                  double usageHours;
                  System.out.print("Hours ( per day ): ");
                  do {
                     usageHours = sc.nextDouble();
                     if(usageHours < 0 || usageHours > 24){
                        System.out.println("Invalid input. Please enter a value between 0 and 24.");
                     }
                  } while (usageHours < 0 || usageHours > 24);

                  // Create device object
                  Device device = new Device(name, wattage, usageHours, kWhRate);

                  // Add device object to array
                  devices[i] = device;
            }

           
            // Calculate and print device electricity cost
            System.out.println("------------------------------------------------------");
            System.out.println("|              Electricity Cost Estimate              |");        
            System.out.println("------------------------------------------------------");
            System.out.printf("| %-20s | %-10s | %-15s |\n", "Name", "Cost/Day", "Cost/Month");
            System.out.println("------------------------------------------------------");
            double totalCost = 0;
            for (Device device : devices) {
                  double costPerDay = device.calculateCost();
                  double costPerMonth = costPerDay * 30;
                  totalCost += costPerMonth;
                  System.out.printf("| %-20s | %-10.2f | %-15.2f |\n", device.getName(), costPerDay, costPerMonth);
            }
            System.out.println("------------------------------------------------------");
            System.out.printf("| %-33s | %-15.2f |\n", "Total Cost  ", totalCost);
            System.out.println("------------------------------------------------------");
            
            
            
            System.out.print("For calculate another cost estimation press Y ....");

             }catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a Valid value next time.");
                    
            }


        } while (sc.next().equalsIgnoreCase("Y"));
       
        System.out.println("------------------------------------------------------");
        System.out.println("|          Thank you for using ECE System.            |");        
        System.out.println("------------------------------------------------------");
       
        System.out.println("");
        sc.close();
    }
}

class Device {
    private String name;
    private double wattage;
    private double usageHours;
    private double costPerkWh;

    public Device(String name, double wattage, double usageHours,double costPerkWh) {
        this.name = name;
        this.wattage = wattage;
        this.usageHours = usageHours;
        this.costPerkWh = costPerkWh;
    }

    public String getName() {
        return name;
    }

    public double calculateCost() {
        double wattHours = wattage * usageHours;
        double kWh = wattHours / 1000;
        return kWh * costPerkWh;
    }
}

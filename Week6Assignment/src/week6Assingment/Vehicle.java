package week6Assingment;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

// Class with private variables
public class Vehicle {
	private int vehicleYear;
	private double mileage;
	private String vehicleId;
	private String vehicleColor;
	private String vehicleMake;
	private String vehicleModel;
	private String drivetrain;
	private String vehicleCategory;
	
	// Constructor
	public Vehicle() {
		this.vehicleYear = 0;
		this.mileage = 0.0;
		this.vehicleId = null;
		this.vehicleColor = null;
		this.vehicleMake = null;
		this.vehicleModel = null;
		this.drivetrain = null;
		this.vehicleCategory = null;
	}
	
	// Constructor with parameters
	public Vehicle(int year, double miles, String id, String color, String make, String model, String drive, String category) {
		this.vehicleYear = year;
		this.mileage = miles;
		this.vehicleId = id;
		this.vehicleColor = color;
		this.vehicleMake = make;
		this.vehicleModel = model;
		this.drivetrain = drive;
		this.vehicleCategory = category;
	}
	
	// Method to add a vehicle
	public String AddVehicle(int year, double miles, String id, String color, String make, String model, String drive, String category) {
		this.vehicleYear = year;
		this.mileage = miles;
		this.vehicleId = id;
		this.vehicleColor = color;
		this.vehicleMake = make;
		this.vehicleModel = model;
		this.drivetrain = drive;
		this.vehicleCategory = category;
		return "Vehicle added.";
	}
	
	// Method to delete a vehicle
	public String DeleteVehicle() {
		this.vehicleYear = 0;
		this.mileage = 0.0;
		this.vehicleId = null;
		this.vehicleColor = null;
		this.vehicleMake = null;
		this.vehicleModel = null;
		this.drivetrain = null;
		this.vehicleCategory = null;
		return "Vehicle deleted.";
	}
	
	// Method to update vehicle
	public String UpdateVehicle(int year, double miles, String id, String color, String make, String model, String drive, String category) {
		this.vehicleYear = year;
		this.mileage = miles;
		this.vehicleId = id;
		this.vehicleColor = color;
		this.vehicleMake = make;
		this.vehicleModel = model;
		this.drivetrain = drive;
		this.vehicleCategory = category;
		return "Vehicle updated.";
	}
	
	// View vehicle
	public String ViewVehicle() {
		if(vehicleYear == 0 || mileage == 0.0 || vehicleId == null || vehicleColor == null || vehicleMake == null || vehicleModel == null ||
		drivetrain == null || vehicleCategory == null) {
			return "No vehicle found.";
		}
		return "Vehicle ID: " + vehicleId + ", Year: " + vehicleYear + ", Make: " + vehicleMake + ", Model: " + vehicleModel + ", Color: " + vehicleColor +
				", Drive: " + drivetrain + ", Category: " + vehicleCategory + ", Miles: " + mileage;
	}
	
	// Testing method
	public static void main(String[] args) {
		Vehicle userVehicle = new Vehicle();
		
		// add
		userVehicle.AddVehicle(1998, 98453.20, "XYZ123", "white", "Dodge", "Stratus", "FWD", "sedan");
		System.out.println(userVehicle.ViewVehicle());
		
		// update
		userVehicle.UpdateVehicle(1998, 98741.45, "XYZ123", "blue", "Dodge", "Stratus", "FWD", "sedan");
		System.out.println(userVehicle.ViewVehicle());
		
		// delete
		System.out.println(userVehicle.DeleteVehicle());
		System.out.println(userVehicle.ViewVehicle());
	}
}






	



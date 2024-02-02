/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
* Class: 44542-01 Object-Oriented Programming
*
* @author - S572551 - Gowtam naga Satya Krishna Kanumilli
* Description: Making sure everything works
* Due: 02/01/2024
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student, internet, or any other source.
* I will not share my source code with anyone under any circumstances.
*/

public class Car {
     // Taking Attributes
    private String model;
    private String brand;
    private String steering;
    private double price;
    private String splFeature;
    private double starRating;

    // Using Parameterized Constructor with Arguments
    public Car(String model, String brand, String steering, double price, String splFeature, double starRating) {
        this.model = model;
        this.brand = brand;
        this.steering = steering;
        this.price = price;
        this.splFeature = splFeature;
        this.starRating = starRating;
    }

    // Using Getter methods
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public String getSteering(){
        return steering;
    }
    public double getPrice(){
        return price;
    }
    public String getSplFeature(){
        return splFeature;
    }
    public double getStarRating(){
        return starRating;
    }
    
   //Using Setter Method
    public void setModel(String model) {
        this.model = model;
}
 public void setBrand(String brand) {
        this.brand = brand;
}
 public void setSteering(String steering) {
        this.steering = steering;
}
 public void setPrice(double price) {
        this.price = price;
}
 public void setSplFeature(String splFeature) {
        this.splFeature = splFeature;
}
 public void setStarRating(double starRating) {
        this.starRating = starRating;
}
    /**
     * Returns a String representation of the Car object.
     * 
     * @return String representation of the Car object.
     */
    @Override
    public String toString() {
        return "Car [model=" + model + ", brand=" + brand + ", steering=" + steering + ", price=" + price
                + ", splFeature=" + splFeature + ", starRating=" + starRating + "]";
    }

    /**
     * Returns the price based on the special feature selected.
     * 
     * @param strn Special feature entered by the user.
     * @return Price (in lakhs) based on the brand.
     */
    public double getSplFeature(String strn) {
        switch (strn.toLowerCase()) {
            case "ai/voice controlled":
                return getBrandSpecificPrice(brand, "ai/voice controlled");
            case "hybrid":
                return getBrandSpecificPrice(brand, "hybrid");
            case "electric":
                return getBrandSpecificPrice(brand, "electric");
            default:
                return 0.0; // Default price for unknown special features
        }
    }

    /**
     * Returns the price based on the steering type selected.
     * 
     * @param str Steering type entered by the user.
     * @return Price (in lakhs) based on the brand.
     */
    public double getSteering(String str) {
        switch (str.toLowerCase()) {
            case "power steering":
                return getBrandSpecificPrice(brand, "power steering");
            case "manual steering":
                return getBrandSpecificPrice(brand, "manual steering");
            default:
                return 0.0; // Default price for unknown steering types
        }
    }

    /**
     * Returns the price based on the safety star rating entered.
     * 
     * @param num Safety star rating entered by the user.
     * @return Price (in lakhs) based on the brand.
     */
    public double getStarRating(double num) {
        return getBrandSpecificPrice(brand, String.valueOf(num));
    }

    /**
     * Prints the details of the Car in the specified format.
     */
    public void printDetails(){
        double total = calculateTotalPrice();
        System.out.println("Car Details:");
        System.out.println("--------------");
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Steering: " + steering);
        System.out.println("Special Feature: " + splFeature);
        System.out.println("Star Rating: " + starRating);
        System.out.println("Base Price: $" + price);
        System.out.println("Total Price (including taxes): $" + total);
    }
    // Helper method to get brand-specific price based on category
    private double getBrandSpecificPrice(String brand, String category) {
        // Implement logic to get price based on brand and category from the provided tables
        // For simplicity, a dummy value is returned. You should replace this with actual logic.
        return 1000.0;
    }
    // Helper method to calculate total price including taxes
    private double calculateTotalPrice() {
        double salesTax = price * 0.10;
        double exciseTax = price * 0.03;
        double registrationTax = price * 0.05;
        return price + salesTax + exciseTax + registrationTax;
    }
}

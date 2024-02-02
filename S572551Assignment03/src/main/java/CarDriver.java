
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author S572551
 */
public class CarDriver {
     private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Northwest Car Showroom");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select what brand motor you are looking for");
        System.out.println("1. Ford");
        System.out.println("2. Chevrolet");
        System.out.println("3. Tata");
        System.out.println("4. Nissan");
        System.out.println("5. Toyata");
            
        int brandChoice = scanner.nextInt();
            // Prompt the user for customization
            System.out.println("please select your desired model");
            // Implement customization logic based on user choice
            Car selectedCar = createDummyCar(brandChoice);
//            System.out.println("QQQQQQQQ"+selectedCar.toString());
            if(selectedCar!=null) {
                // Customize the selected car
//            System.out.println("WWWWWWWWW"+selectedCar.toString());
            int check=customizeCar(scanner, selectedCar);
//            System.out.println("444444444"+check);
            // Print the final details of the customized car
            
            if(check != -1){
                selectedCar.printDetails();
            }
            }
        // Closing the scanner
        scanner.close();
    }
    // Helper method to create a dummy Car object for testing
    private static Car createDummyCar(int brandChoice) {
        Car selectedCar = null;

        switch (brandChoice) {
            case 1: // Using Car Brand Ford from given Data
                displayFordModels();
                int fordModelChoice = scanner.nextInt();
                selectedCar = createFordCar(fordModelChoice);
                break;
                           
            case 2: // Using Car Brand Chevrolet From Given Data
                displayChevroletModels();
                int chevroletModelChoice = scanner.nextInt();
                selectedCar = createChevroletCar(chevroletModelChoice);
                break;
                
            case 3: // Using Car Brand Tata From Given Data
                displayTataModels();
                int tataModelChoice = scanner.nextInt();
                selectedCar = createTataCar(tataModelChoice);
                break;
            case 4: // Using Car Brand Nissan From Given Data
                displayNissanModels();
                int nissanModelChoice = scanner.nextInt();
                selectedCar = createNissanCar(nissanModelChoice);
                break;
                
            case 5: // Using Car Brand Toyota From Given Data
                displayToyotaModels();
                int toyotaModelChoice = scanner.nextInt();
                selectedCar = createToyotaCar(toyotaModelChoice);
                break;
                
            default:
                System.out.println("Error, you have selected an invalid brand.");
                break;
        }
        return selectedCar;
    }

    // Helper method to display Toyota models
    private static void displayToyotaModels() {
        System.out.println("1. Camry");
        System.out.println("2. Corolla");
        System.out.println("3. RAV4");
        System.out.println("4. Prius");
        System.out.println("5. Highlander");
    }

    //Using Helper method to create Toyota car based on model choice
    private static Car createToyotaCar(int modelChoice) {
        Car selectedCar = null;

        switch (modelChoice) {
            case 1:
                selectedCar = new Car("Camry", "Toyota", "Power Steering", 24255.99, "AI/Voice Controlled", 4.0);
                break;
            case 2:
                selectedCar = new Car("Corolla", "Toyota", "Power Steering", 22500.99, "AI/Voice Controlled", 3.5);
                break;
            case 3:
                selectedCar = new Car("RAV4", "Toyota", "Power Steering", 26500.00, "AI/Voice Controlled", 4.2);
                break;
            case 4:
                selectedCar = new Car("Prius", "Toyota", "Power Steering", 24560.12, "AI/Voice Controlled", 4.2);
                break;
            case 5:
                selectedCar = new Car("Highlander", "Toyota", "Power Steering", 24788.50, "AI/Voice Controlled", 4.2);
                break;
            default:
                System.out.println("Error, you have selected an invalid model.");
                break;
        }
        
        return selectedCar;
    }

    // Usinig Helper method to display Nissan models
    private static void displayNissanModels() {
        System.out.println("1. Altima");
        System.out.println("2. Rogue");
        System.out.println("3. Pathfinder");
        System.out.println("4. Titan");
    }

    // Using Helper method to create Nissan car based on model choice
    private static Car createNissanCar(int modelChoice) {
        Car selectedCar = null;

        switch (modelChoice) {
            case 1:
                selectedCar = new Car("Altima", "Nissan", "Power Steering", 23555.00, "AI/Voice Controlled", 3.8);
                break;
            case 2:
                selectedCar = new Car("Rogue", "Nissan", "Power Steering", 25500.00, "AI/Voice Controlled", 4.0);
                break;
            case 3:
                selectedCar = new Car("Pathfinder", "Nissan", "Power Steering", 23899.99, "AI/Voice Controlled", 3.5);
                break;
            case 4:
                selectedCar = new Car("Titan", "Nissan", "Power Steering", 24778.99, "AI/Voice Controlled", 4.2);
                break;
            default:
                System.out.println("Error, you have selected an invalid model.");
                break;
        }

        return selectedCar;
    }

    //Using Helper method to display Tata models
    private static void displayTataModels() {
        System.out.println("1. Nano");
        System.out.println("2. Safari");
        System.out.println("3. Harrier");
        System.out.println("4. Sumo");
        System.out.println("5. Indica");
    }

    //Using Helper method to create Tata car based on model choice
    private static Car createTataCar(int modelChoice) {
        Car selectedCar = null;

        switch (modelChoice) {
            case 1:
                selectedCar = new Car("Nano", "Tata", "Power Steering", 20000.59, "AI/Voice Controlled", 3.2);
                break;
            case 2:
                selectedCar = new Car("Safari", "Tata", "Power Steering", 18999.99, "AI/Voice Controlled", 3.7);
                break;
            case 3:
                selectedCar = new Car("Harrier", "Tata", "Power Steering", 15999.56, "AI/Voice Controlled", 4.0);
                break;
            case 4:
                selectedCar = new Car("Sumo", "Tata", "Power Steering", 21000.99, "AI/Voice Controlled", 3.5);
                break;
            case 5:
                selectedCar = new Car("Indica", "Tata", "Power Steering", 18567.58, "AI/Voice Controlled", 3.9);
                break;
            default:
                System.out.println("Error, you have selected an invalid model.");
                break;
        }

        return selectedCar;
    }

    //Using Helper method to display Chevrolet models
    private static void displayChevroletModels(){
        System.out.println("1. Silverado");
        System.out.println("2. Malibu");
        System.out.println("3. Equinox");
        System.out.println("4. Traverse");
        System.out.println("5. Camaro");
    }

    // Using Helper method to create Chevrolet car based on model choice
    private static Car createChevroletCar(int modelChoice) {
        Car selectedCar = null;

        switch (modelChoice) {
            case 1:
                selectedCar = new Car("Silverado", "Chevrolet", "Power Steering", 25233.55, "AI/Voice Controlled", 4.2);
                break;
            case 2:
                selectedCar = new Car("Malibu", "Chevrolet", "Power Steering", 24544.67, "AI/Voice Controlled", 3.8);
                break;
            case 3:
                selectedCar = new Car("Equinox", "Chevrolet", "Power Steering", 22000.50, "AI/Voice Controlled", 4.0);
                break;
            case 4:
                selectedCar = new Car("Traverse", "Chevrolet", "Power Steering", 23766.55, "AI/Voice Controlled", 3.5);
                break;
            case 5:
                selectedCar = new Car("Camaro", "Chevrolet", "Power Steering", 16550.99, "AI/Voice Controlled", 4.5);
                break;
            default:
                System.out.println("Error, you have selected an invalid model.");
                break;
        }
        
        return selectedCar;
    }

    // Using Helper method to display Ford models
    private static void displayFordModels() {
        System.out.println("1. Mustang");
        System.out.println("2. Explorer");
        System.out.println("3. Escape");
        System.out.println("4. Fusion");
        System.out.println("5. F-150");
    }

    // Using Helper method to create Ford car based on model choice
    private static Car createFordCar(int modelChoice) {
        Car selectedCar = null;

        switch (modelChoice) {
            case 1:
                selectedCar = new Car("Mustang", "Ford", "Power Steering", 21599.76, "AI/Voice Controlled", 4.3);
                break;
            case 2:
                selectedCar = new Car("Explorer", "Ford", "Power Steering", 18976.59, "AI/Voice Controlled", 4.1);
                break;
            case 3:
                selectedCar = new Car("Escape", "Ford", "Power Steering", 19999.09, "AI/Voice Controlled", 3.9);
                break;
            case 4:
                selectedCar = new Car("Fusion", "Ford", "Power Steering", 12765.78, "AI/Voice Controlled", 3.7);
                break;
            case 5:
                selectedCar = new Car("F-150", "Ford", "Power Steering", 19876.98, "AI/Voice Controlled", 4.0);
                break;
            default:
                System.out.println("Error, you have selected an invalid model.");
                break;
        }

        return selectedCar;
    }

    // Using Helper method to customize the selected car
    private static int customizeCar(Scanner scanner, Car car) {
        
        // Customize safety star rating
        System.out.println("Enter the safety star rating for your car (3.0 to 5.0):");
        System.out.println("1.3.0");
        System.out.println("2.3.8");
        System.out.println("3.4.0");
        System.out.println("4.4.5");
        System.out.println("5.5.0");
        int starRating = scanner.nextInt();
        if(!(starRating>=1 && starRating<=5)){
            System.out.println("Error, you have selected an invalid safety star rating value.");     
            return -1;
        }else{
        
        
        car.setStarRating(starRating);

        // Customize steering type
        System.out.println("Choose a steering type for your car:");
        // Implement logic to display available steering types based on the provided tables
        // For simplicity, a dummy list is printed. You should replace this with actual logic.
        System.out.println("1. Power Steering");
        System.out.println("2. Manual Steering");
        int steeringChoice = scanner.nextInt();
        // Set the chosen steering type for the car
        switch (steeringChoice) {
            case 1:
                car.setSteering("Power Steering");
                break;
            case 2:
                car.setSteering("Manual Steering");
                break;
            default:
                System.out.println("Error, you have selected an invalid steering type.");
                return -1;
        }
        
        System.out.println("Are you interested in adding a new feature ?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        
        int booleanFeature = scanner.nextInt();
        if(booleanFeature==1||booleanFeature==2){
            
        }
        else{
            System.out.println("Error, you have selected an invalid option.");
            return -1;
        }

        // Customize special feature
        System.out.println("Choose a special feature for your car:");
        // Implement logic to display available special features based on the provided tables
        // For simplicity, a dummy list is printed. You should replace this with actual logic.
        System.out.println("1. AI/Voice Controlled");
        System.out.println("2. Hybrid");
        System.out.println("3. Electric");
        int splFeatureChoice = scanner.nextInt();
        // Set the chosen special feature for the car
        switch (splFeatureChoice) {
            case 1:
                car.setSplFeature("AI/Voice Controlled");
                break;
            case 2:
                car.setSplFeature("Hybrid");
                break;
            case 3:
                car.setSplFeature("Electric");
                break;
            default:
                System.out.println("Error, you have selected an invalid special feature.");
                return -1;
        }
    }
        return 0;
    }
}   

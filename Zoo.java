import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Zoo
 */
public class Zoo {
    
    ArrayList<String> animalOptions = new ArrayList<>(Arrays.asList("Lion", "Monkey")); 
    ArrayList<Animal>residents = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public static void playZoo(Zoo z) {
        int choice = promptUser();
        z.createAnimal(choice);
        z.displayResidences();

    }

    /*
     * @returns: The index of the arraylist indicating what animal they want to create
     */
    public static int promptUser() {
        System.out.println("Welcome to your new Zoo! What would you like to do?");
        
        return 1;
    }

    // Creates instance of the animal they want to create
    public void createAnimal(int choice) {
        String animal = animalOptions.get(choice - 1);
        String newName = getAnimalName();
        if (animal == "Lion") {
            Lion l = new Lion(newName);
            residents.add(l);
        }
    }

    public String getAnimalName() {
        System.out.println("What would you like to name your aniaml?\n");
        String animalName = scanner.nextLine();
        return animalName;
    }

    public void displayResidences() {
        System.out.println("residents of your zoo : \n");
        
        for (Animal animal : residents) {
            System.out.println(animal + "\n");
        }

    }
    

    public static void main(String[] args) {
        System.out.println("\n");

        Zoo z = new Zoo();
        playZoo(z);

    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Zoo
 */
public class Zoo {
    
    ArrayList<String> animalOptions = new ArrayList<>(Arrays.asList("Lion", "Monkey")); 
    ArrayList<Animal>residents = new ArrayList<>();



    public static void playZoo(Zoo z) {
        int choice = promptUser();
        z.createAnimal(choice);
        z.displayResidences();

    }

    /*
     * @returns: The index of the arraylist indicating what animal they want to create
     */
    public static int promptUser() {
        return 1;
    }

    // Creates instance of the animal they want to create
    public void createAnimal(int choice) {
        String animal = animalOptions.get(choice - 1);
        if (animal == "Lion") {
            Lion l = new Lion("Lenny");
            residents.add(l);
            Lion l2 = new Lion("Larry");
            residents.add(l2);
        }
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

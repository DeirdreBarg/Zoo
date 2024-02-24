import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Zoo
 */
public class Zoo {
    
    ArrayList<String> animalOptions = new ArrayList<>(Arrays.asList("1: Lion", "2: Monkey")); 
    ArrayList<Animal>residents = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String[] actions = {"1: Create an animal ","2: List Animals"} ;



    public static void playZoo(Zoo z) {
        boolean wantsToPlay = true;
        while (wantsToPlay) {
            int userChoice = z.getUserAction();
            z.doAction(userChoice);
            if (!z.keepPlaying()) {
                wantsToPlay = false;
            } 
        }
        

    }

    /**
     * Dispatches necessary functions based off of userChoice
     * @param userChoice The int repesenting the index of the desired action (i.e. 1: Create animal)
     */
    public void doAction(int userChoice) {       
        switch (userChoice) {
            case 1:
                createAnimal();
                break;     
            case 2:
                displayResidences();
                break;
            default:
                throw new UnsupportedOperationException("Unimplemented user choice");
        }
    }

    /**
     * Prompt user ncessecary info about the animal they want to create and then create that animal. The animal will be added to residence list
     */
    public void createAnimal() {
        System.out.println("");
        System.out.println("What kind of animal would you like to create?");
        for (String animalOptions : animalOptions) {
            System.out.println(animalOptions);
            System.out.println("");
        }
        int userAnimalChoice = sc.nextInt();
        String name = getAnimalName();
        switch (userAnimalChoice) {
            case 1:
                Animal lion = new Lion(name);
                residents.add(lion);
                break;
            case 2:
                Animal monkey = new Monkey(name);
                residents.add(monkey);
                break;
            default:
                break;
        }

    }

    /**
     * Prompts user with action choices
     * @return The int index of the options array which indicates the user option (i.e. create an animal)
     */
    public int getUserAction() {
        System.out.println("");
        System.out.println("Welcome to your new Zoo! What would you like to do?\n");
        for (String action : actions) {
            System.out.println(action);
            System.out.println("");
        }
        int userChoice = sc.nextInt();
        return userChoice;
    }


    public String getAnimalName() {
        System.out.println("");
        System.out.println("What would you like to name your animal?\n");
        String animalName = sc.next();
        return animalName;
    }

    public void displayResidences() {
        System.out.println("");
        System.out.println("residents of your zoo : \n");
        
        for (Animal animal : residents) {
            System.out.println(animal + "\n");
        }

    }

    public boolean keepPlaying() {
        System.out.println("");
        System.out.println("Would you like to keep building your zoo? \nEnter 1 for Yes!\nEnter 2 for No:(\n");
        int result = sc.nextInt();
        boolean keepGoing = false;
        if (result == 1) {
            keepGoing = true;
        }
        else if (result == 2) {
            keepGoing = false;
        }
       return keepGoing;
    }
    

    public static void main(String[] args) {
        System.out.println("\n");
        Zoo z = new Zoo();
        playZoo(z);

    }

}

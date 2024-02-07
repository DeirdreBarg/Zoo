public class Monkey extends Animal {
    
    private static final String DISPLAY_NAME = "Monkey";

    Monkey(String name) {
        super(name);
    }

    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }
}

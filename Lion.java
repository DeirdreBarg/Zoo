public class Lion extends Animal{
    
    private static final String DISPLAY_NAME = "Lion";

    
    Lion(String name) {        
        super(name);
    }

    @Override
    public String getDisplayName() {
        return DISPLAY_NAME;
    }    
}

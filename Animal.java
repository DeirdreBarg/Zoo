public abstract class Animal {
    
    private String name;    
    

    Animal(String name) {
        this.name = name;
    }

    public abstract String getDisplayName();
        
    public String toString() {
        return name + " (" + this.getDisplayName() + ")";        
    }
}

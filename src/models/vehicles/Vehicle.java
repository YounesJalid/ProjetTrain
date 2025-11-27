/**
 * Vehicle - Abstract base class for all vehicles
 * Provides unique ID generation and common attributes
 */
public abstract class Vehicle implements Drawable {
    // Static counter for unique ID generation
    private static int idCounter = 1;
    
    // Instance attributes
    private final int id;
    private final int length;
    
    /**
     * Default constructor
     */
    public Vehicle() {
        this.id = idCounter++;
        this.length = 10;
    }
    
    /**
     * Parameterized constructor
     * @param length Length of the vehicle
     */
    public Vehicle(int length) {
        this.id = idCounter++;
        this.length = Math.max(1, length); // Ensure positive length
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public int getLength() {
        return length;
    }
    
    /**
     * Abstract method to be implemented by subclasses
     */
    @Override
    public abstract void draw();
    
    @Override
    public String toString() {
        return "Vehicle [ID=" + id + ", Length=" + length + "]";
    }
}

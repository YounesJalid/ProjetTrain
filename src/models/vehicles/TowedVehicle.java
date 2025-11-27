/**
 * TowedVehicle - Abstract class for all towed vehicles
 * Represents vehicles that cannot move by themselves
 */
public abstract class TowedVehicle extends Vehicle {
    
    /**
     * Default constructor
     */
    public TowedVehicle() {
        super();
    }
    
    /**
     * Parameterized constructor
     * @param length Length of the towed vehicle
     */
    public TowedVehicle(int length) {
        super(length);
    }
    
    /**
     * Abstract method to be implemented by concrete towed vehicles
     */
    @Override
    public abstract void draw();
    
    @Override
    public String toString() {
        return "TowedVehicle [ID=" + getId() + ", Length=" + getLength() + "]";
    }
}

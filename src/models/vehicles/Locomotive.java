/**
 * Locomotive - Concrete class representing a train engine
 * Can be positioned at head or tail of the train
 */
public class Locomotive extends Vehicle {
    private final int power; // Power in kW
    private boolean isAtHead; // Position: true = head, false = tail
    
    /**
     * Default constructor
     */
    public Locomotive() {
        super(10);
        this.power = 1600;
        this.isAtHead = true;
    }
    
    /**
     * Parameterized constructor
     * @param length Length of the locomotive
     * @param power Power in kW
     * @param isAtHead Position (true = head, false = tail)
     */
    public Locomotive(int length, int power, boolean isAtHead) {
        super(length);
        this.power = Math.max(1, power);
        this.isAtHead = isAtHead;
    }
    
    // Getters
    public int getPower() {
        return power;
    }
    
    public boolean isAtHead() {
        return isAtHead;
    }
    
    // Setters
    public void setAtHead(boolean atHead) {
        this.isAtHead = atHead;
    }
    
    /**
     * Draws the locomotive representation
     * Format: <1600#### (head) or ####1600> (tail)
     */
    @Override
    public void draw() {
        String lengthStr = "";
        for (int i = 0; i < getLength(); i++) {
            lengthStr += "#";
        }
        
        if (isAtHead) {
            System.out.print("<" + power + lengthStr);
        } else {
            System.out.print(lengthStr + power + ">");
        }
    }
    
    @Override
    public String toString() {
        return "Locomotive [ID=" + getId() + ", Power=" + power + " kW, Length=" + 
               getLength() + ", Position=" + (isAtHead ? "Head" : "Tail") + "]";
    }
}

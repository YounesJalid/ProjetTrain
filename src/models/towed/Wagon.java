public class Wagon {
    private int maxLoad;
    private int currentLoad;
    
    // Constructeur
public Wagon(int maxLoad, int currentLoad) {
        this.maxLoad = maxLoad;
        this.currentLoad = currentLoad;
    }
    // Getters
public int getMaxLoad(){
    return maxLoad;
}
public int getCurrentLoad(){
    return currentLoad;
}
    // Setter avec validation 
public void setCurrentLoad(int currentLoad){
        if(currentLoad >= 0 && currentLoad <= maxLoad){
            this.currentLoad = currentLoad;
        } else {
            System.out.println("Erreur : La charge ne peut pas dépasser la charge maximale !");
        }
        
    }
    // Methode pour dessiner une representation textuelle du wagon
 public String draw() {
        return "┌─────────────┐\n" +
               "│   WAGON     │\n" +
               "│ Max: " + String.format("%4d", maxLoad) + "kg │\n" +
               "│ Act: " + String.format("%4d", currentLoad) + "kg │\n" +
               "└─────────────┘\n" +
               "  ◉─────────◉  ";
    }
    // Méthode toString()
    @Override
    public String toString() {
        return "Wagon [maxLoad=" + maxLoad + ", currentLoad=" + currentLoad + "]";
    }
}
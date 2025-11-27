import java.util.ArrayList;
import java.util.List;

public class Train{
    private String departure;
    private String destination; 
    private Locomotive locomotive;
    private List<Vehicle> vehicles;

    // Constructeur
    public Train(String departure, String destination, Locomotive locomotive) {
        this.departure = departure;
        this.destination = destination;
        this.locomotive = locomotive;
        this.vehicles = new ArrayList<>();
    }

    // Getters
    public String getDeparture() {
        return departure;
    }
    public String getDestination() {
        return destination;
    }
    public Locomotive getLocomotive() {
        return locomotive;
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    //ajouter un locomotive
    public void addLocomotive(Locomotive locomotive){
        if (this.locomotive != null) {
            System.out.println("Attention : Une locomotive existe déjà. Elle sera remplacée. !");
        } else {
            this.locomotive = locomotive;
        }
        this.locomotive = locomotive;
        System.out.println("Locomotive ajoutée au train.");
    }

    // Retirer une locomotive
    public void removeLocomotive() {
        if (this.locomotive == null) {
            System.out.println("Aucune locomotive à retirer.");
        } else {
            this.locomotive = null;
            System.out.println("Locomotive retirée du train.");
        }
    }
    // Methode pour ajouter un véhicule
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
     // Methode pour supprimier un véhicule
    public void addVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    
    // Méthode toString()
    @Override
    public String toString() {
        return "Train [departure=" + departure + ", destination=" + destination + 
               ", locomotive=" + locomotive + ", vehicles=" + vehicles + "]";
    }

    // Méthode pour dessiner une représentation textuelle du train
}
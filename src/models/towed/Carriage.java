public class Carriage {
    private int seats;
    private int passangers;

    // Constructeur
    public Carriage(int seats, int passangers) {
        this.seats = seats;
        this.passangers = passangers;
    }
 
    // Getters
    public int getSeats(){
        return seats;
    }
    public int getPassangers(){
        return passangers;
    }

    // Setter avec validation
    public void setPassangers(int passangers){
        if(passangers >= 0 && passangers <= seats){
            this.passangers = passangers;
        } else {
            System.out.println("Erreur : Le nombre de passagers ne peut pas dépasser le nombre de sièges !");
        }
        
    }
    // Methode pour dessiner une representation textuelle du wagon
    public String draw() {
        return "┌─────────────┐\n" +
               "│  CARRIAGE   │\n" +
               "│ Seats: " + String.format("%4d", seats) + "   │\n" +
               "│ Pass: " + String.format("%4d", passangers) + "   │\n" +
               "└─────────────┘\n" +
               "  ◉─────────◉  ";
    }
}
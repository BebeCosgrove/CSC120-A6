/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor
     * @param name name of cafe
     * @param address address of cafe
     * @param nFloors number of floors in cafe
     * @param nCoffeeOunces number of coffee ounces in inventory remaining
     * @param nSugarPackets number of sugar packets remaining in inventory
     * @param nCreams number of splashes of cream remaining in inventory
     * @param nCups number of cups remaning in inventory
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Decreases the cafe's inventory when a cup of coffee is sold
     * @param size number of ounces of cup of coffee
     * @param nSugarPackets number of sugar packets used
     * @param nCreams number of creams used 
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces < size && this.nSugarPackets < nSugarPackets && this.nCreams < nCreams && this.nCups - 1 <= 0){
            restock(size, nSugarPackets, nCreams, nCups); // inputted 0 to indicate that there didn't need to be anything restocked
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
            System.out.println(("Amount of coffee ounces in inventory: " +this.nCoffeeOunces));
            System.out.println("Amount of sugar packets in inventory: " + this.nSugarPackets);
            System.out.println("Amount of cream in inventory: " + this.nCreams);
            System.out.println("Amount of cups in inventory: " + this.nCups);


        } else if (this.nCoffeeOunces < size && this.nSugarPackets < nSugarPackets && this.nCreams < nCreams && this.nCups - 1 > 0){
            restock(size, nSugarPackets, nCreams, 0); // inputted 0 to indicate that there didn't need to be anything restocked
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
            System.out.println(("Amount of coffee ounces in inventory: " +this.nCoffeeOunces));
            System.out.println("Amount of sugar packets in inventory: " + this.nSugarPackets);
            System.out.println("Amount of cream in inventory: " + this.nCreams);
            System.out.println("Amount of cups in inventory: " + this.nCups);

        } else if (this.nCoffeeOunces < size && this.nSugarPackets < nSugarPackets && this.nCreams >= nCreams && this.nCups - 1 > 0){
            restock(size, nSugarPackets, 0, 0); // inputted 0 to indicate that there didn't need to be anything restocked
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
            System.out.println(("Amount of coffee ounces in inventory: " +this.nCoffeeOunces));
            System.out.println("Amount of sugar packets in inventory: " + this.nSugarPackets);
            System.out.println("Amount of cream in inventory: " + this.nCreams);
            System.out.println("Amount of cups in inventory: " + this.nCups);

        } else if (this.nCoffeeOunces < size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups - 1 > 0){
            restock(size, 0, 0, 0); // inputted 0 to indicate that there didn't need to be anything restocked
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
            System.out.println(("Amount of coffee ounces in inventory: " +this.nCoffeeOunces));
            System.out.println("Amount of sugar packets in inventory: " + this.nSugarPackets);
            System.out.println("Amount of cream in inventory: " + this.nCreams);
            System.out.println("Amount of cups in inventory: " + this.nCups);

        } else if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups - 1 > 0){
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
            System.out.println(("Amount of coffee ounces in inventory: " +this.nCoffeeOunces));
            System.out.println("Amount of sugar packets in inventory: " + this.nSugarPackets);
            System.out.println("Amount of cream in inventory: " + this.nCreams);
            System.out.println("Amount of cups in inventory: " + this.nCups);
        }
        
    }

    /**
     * Restocks inventory when cafe is out of something
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        if (nCoffeeOunces > 0){ // if variable is 0 that means that it doesn't need to be restocked
            this.nCoffeeOunces = nCoffeeOunces + 50 ;
        } if (nSugarPackets > 0){ 
            this.nSugarPackets = nSugarPackets + 50;
        } if (nCreams > 0) {
            this.nCreams = nCreams;
        } if (nCups > 0){
            this.nCups = nCups;
        }

    

    }
    /**
     * Main method 
     * @param args command line arguments passed into method
     */
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("compass cafe", "1 chapin way", 2, 12, 10, 3, 4);
        myCafe.sellCoffee(15, 3, 1);
    }
    
}

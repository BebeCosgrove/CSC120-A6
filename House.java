/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {
  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }


  /**
   * Getter for hasDiningRoom
   * @return boolean for whether or not house has dining room or not
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;

  }

  /**
   * Getter for number of residents in house
   * @return int of size of array list of residents
   */
  public int nResidents(){
    return residents.size();

  }

  /**
   * Adds name to list of people in house as long as name isn't already in house
   * @param name name of person
   */
  public void moveIn(String name){
    if(isResident(name) == true){
      throw new RuntimeException("Person is already in house");
    } else{
      residents.add(name);
    }
  }

  /**
   * Removes someone from house and from the array list of residents or prints out an error if that person is not in house
   * @param name name inputted
   * @return name inputted
   */
  public String moveOut(String name){
    if (isResident(name) == true){
      residents.remove(name);
      return name;
    } else{
      throw new RuntimeException("Resident is not in house.");
    }
    

  }

  /**
   * Checks whether or not the person is a resident of the house
   * @param person name inputted
   * @return boolean based on whether person is either in house or not
   */
  public boolean isResident(String person){
    if(residents.contains(person)){
      return true;
    } else{
      return false;
    }
  }

  /**
     * Main method 
     * @param args command line arguments passed into method
     */
  public static void main(String[] args) {
    new House();
  }

}
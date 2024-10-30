/* This is a stub for the Library class */

import java.util.Hashtable;
import java.util.Set;

public class Library extends Building{
  private Hashtable<String, Boolean> collection;
  
    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<>();

      System.out.println("You have built a library: 📖");
    }

    /**
     * Adds a title to the library
     * @param title
     */
    public void addTitle(String title){
      if (containsTitle(title) == false){
        collection.put(title, true);
      } else{
        throw new RuntimeException("Book is already in library");
      }
      }
      
      

    
    /**
     * Removes a title from collection and returns the title
     * @param title title of book or the key in collection
     * @return the title of book removed
     */
    public String removeTitle(String title){
      if (containsTitle(title) == true){
        if (isAvailable(title) == true){
          collection.remove(title);
          return title;

        } else{
          throw new RuntimeException("Book is checked out and cannot be removed until it is checked back in.");

        }
      } else{
        throw new RuntimeException("Book is not in library.");
      }
    
    }

    /**
     * Checks out a book if it is available 
     * @param title title of book or the key in collection
     */
    public void checkOut(String title){
      if (isAvailable(title) == true){
        collection.replace(title, false);
      }

    }
    
    /**
     * Returns book to library if it is not available
     * @param title title of book or the key in collection
     */
    public void returnBook(String title){
      if (containsTitle(title)== true){
        if (isAvailable(title) == false){
          collection.replace(title, true);
        } else{
          throw new RuntimeException("Book has not been checked out and therefore can't be returned.");
        }
    } else{
      throw new RuntimeException("Book is not in library");
    }
  }

    /**
     * Checks if the title is a key in the library and returns true if so and false if not
     * @param title title of book and is the key for the collection
     * @return T/F depending on whether or not title is a key or not
     */
    public boolean containsTitle(String title){
      if(collection.containsKey(title) == true){
        return true;
      } else {
        return false;
      }
    }

    /**
     * Checks if title is in library and if it is, checks if it is available and if it is, returns true and if not, returns false
     * @param title title of book or the key
     * @return T/F depending on whether or not title is available in library
     */
    public boolean isAvailable(String title){
      if(containsTitle(title) == true){
        if(collection.get(title) == true){
          return true;
        } else{
          return false;
        }
      } else{
        return false;
      }
    } 


    /**
     * Prints out the library collection alongside checkout status
     */
    public void printCollection(){
      Set<String> setofTitles = collection.keySet(); // creates a set of the keys in collection
      for (String title: setofTitles){
        System.out.println("Title:" + title);
        if (isAvailable(title)){
          System.out.println("Item is available");
        } else{
          System.out.println("Item is not available");
        }
      }
    }
       

  /**
     * Main method 
     * @param args command line arguments passed into method
     */
    public static void main(String[] args) {
      new Library();
    }
  
  }
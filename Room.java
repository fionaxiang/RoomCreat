/**
 * Creat rooms
 * @author fiona
 *Date:4/5/2015
 */
/**
 * 2 types of classes
 * @author fiona
 * Create a class to use in another class. i.e Class Room(use in another class)
 *Maker class(has a main method)
*/

public class Room {
	/**
	 * encapsulate the attributes by adding private modifiers
	 */
     private String walls;
     private String floor;
     private int windows;
     private String color;
     
     
     
     /**
      * constructor :is a method that use to initialize the values of the attributes.Constructor has the room as class room  
      */
    public Room(){
    	this.color = "yellow";
    	this.floor = "hard wood";
    	this.windows = 1;
    }
    public Room(String color,String floor, int windows){
    	this.color =color;
    	this.floor = floor;
    	this. windows = windows;
    	
    }
    /**
     * the main methods to creat a room
     * @return
     */
	
	public String getFloor(){
    	 return this.floor;
    	 
     }
     public void setFloor(String floor){
    	 this.floor = floor;
     }
     public String getColor(){
    	 return this.color;
     }
     public void setColor(String color){
    	 this.color = color;
     }
     public int getWindows(){
    	 return this.windows;
     }
     public void setWindows(int windows){
    	 this.windows = windows;
     }
     public String toString(){
    	 return "The room is painted " + this.color + " with " + this.floor + " floors " + ", it has  " + this. windows +
    	 		" window";
     }
}

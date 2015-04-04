import java.util.Scanner;

public class RoomMaker {
 public  static void main(String []args){
	 Room room = new Room();
	 System.out.println(room);
	 Room SecondRoom =new Room("purple","tiled",0);
	 //keyboard is an instance variable
	 System.out.println(SecondRoom);
	Room ThirdRoom =new Room (" white", "carpeted",3);
	System.out.println(ThirdRoom);
	Scanner keyboard = new Scanner(System.in);
	 System.out.println("Please provide the forth room's color :");
	 String color=keyboard.next();
	 room.setColor(color);
	 System.out.println(room);
 }
}

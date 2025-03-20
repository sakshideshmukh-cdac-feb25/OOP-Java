


import java.util.*;
class Room{
	int height;
   int	width; 
   int breadth;
   int volume;
   
   
  public Room(int height,int width,int breadth){
	  this.height=height;
	  this.width=width;
	  this.breadth=breadth;
  }
	public void volume(){
	 volume=height*width*breadth;
	 System.out.println("volume of room is : "+volume);}
	 
	public void display(){
	 System.out.println("enter height of room : "+height);
	 System.out.println("enter width of room : "+width);
	System.out.println("enter breadth of room : ");
	}
	 
	
	 }
class RoomDemo{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	 System.out.println("enter height of room : ");
	 int height=sc.nextInt();
	System.out.println("enter width of room : ");
	 int width=sc.nextInt();
	System.out.println("enter bredth of room : ");
	 int breadth=sc.nextInt();
	 sc.close();
	
	Room room=new Room(height,width,breadth);
	room.display();
	room.volume();
	
	}
}

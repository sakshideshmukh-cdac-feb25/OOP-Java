

import java.util.*;
class Box{

	int height;
	int width; 
	int breadth;
	int volume;
	int area;
	
	public Box(int height, int width, int breadth ){  
	this.height=height;
	this.width=width;
	this.breadth=breadth;
	
	}
	
	public void getVolume(){ 
	volume= height*width*breadth;  
	}
	public void getArea(){     
	area=  2 *( height * width+ width * breadth+ height* breadth ); 
	
	}
	
	public void display(){
	System.out.println("enter height of box : "+height);
System.out.println("enter width of box : " +width);
System.out.println("enter breadth of box : "+breadth);
System.out.println("volume of box : "+volume);
System.out.println("Area of box : "+area);
}

}
class BoxDemo{
public static void main(String[] args){



Scanner sc=new Scanner(System.in);
System.out.println("enter height of box1 : ");
int h1=sc.nextInt();
System.out.println("enter width of box 1: ");
int w1=sc.nextInt();
System.out.println("enter breadth of box 1: ");
int b1=sc.nextInt();

Box box1=new Box(h1,w1,b1);
box1.getVolume();
box1.getArea();
box1.display();




System.out.println("enter height of box 2: ");
int h2=sc.nextInt();
System.out.println("enter width of box 2: ");
int w2=sc.nextInt();
System.out.println("enter breadth of box 2: ");
int b2=sc.nextInt();

Box box2=new Box(h2,w2,b2);
box2.getVolume();
box2.getArea();
box2.display();
sc.close();
}


}
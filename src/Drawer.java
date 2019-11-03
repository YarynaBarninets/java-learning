
public class Drawer 
{
	public static void main(String[] args)
	{
		Drawer object = new Drawer();
		object.drawAction(new Circle());
		object.drawAction(new Rect());
		object.drawAction(new Square());
	}		

	public void drawAction(Shape shape1)
	{
		for(int i = 0; i < 10; i++)
		{
			shape1.draw();
		}
	}
}

interface Shape 
{
	public void draw();
}

class Circle implements Shape 
{
	public void draw()
	{
		System.out.print("draw a circle\n");
	}
}

class Rect implements Shape 
{
	public void draw()
	{
		System.out.print("draw a rectangle\n");
	}
}
	
class Square implements Shape 
{
	public void draw()
	{
		System.out.print("draw a square\n");
	}
}

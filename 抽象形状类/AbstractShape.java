abstract class Shape{					//抽象类
	abstract public double area();		//抽象方法：括号后接；
}

class Rectangle extends Shape{			//继承父类的定义矩形类
	private double width,height; 		//设置为private是为了保存封装性，无法在类外直接改变需要在类中添加方法来改变
	public Rectangle(double j,double k)
	{
		width=j;
		height=k;
	}
	public double area()
	{
		return width*height;
	}
}

public class AbstractShape{
	public static void main(String args[])
	{
		Shape s[]=new Shape[3];			//因为Shape是抽象类所以无法直接创建Shape对象，但可以创建Shape数组，
										//数组可以存放子类,是多态基础
		s[0]=new Rectangle(10,20);
		System.out.println(s[0].area());
	}

}
//利用多态，让父类数组存放子类对象，并调用子类的重写方法，实现“同一方法，不同实现”
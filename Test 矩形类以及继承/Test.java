//父类（矩形，包含长宽，x，y。
class Rect{
	double x=0;
	double y=0;
	Rect()							//无参构造函数：最好写一下，避免子类没有构造函数
	{
		this(0,0);					//调用本类中的有参构造函数|this调用构造方法，需要是第一个语句
	}
	Rect(double x,double y)			//有参构造函数		是多态的一种体现
	{
		this.x=x;					//把参数传给成员变量|this区分同名变量
		this.y=y;
	}
	double calArea()				//成员方法：计算矩形面积
	{
		return x*y;
	}
}
//子类：长方体。extends Rect表示Cylinder继承于父类Rect
class Cylinder extends Rect
{
	double z;
	Cylinder(double x,double y,double z)
	{ 
		super(x,y);   				//super调用父类构造函数，放在子类工作函数第一行
		this.z=z;					//如果子类有与父类相同的属性变量，那么父类隐藏，最后调用子类
	}
	double calVolume()				//成员方法：计算表面积
	{
		return(x*y+x*z+y*z)*2;
	}
}
//主程序Test
class Test{
	public static void main(String args[])
	{
		Cylinder r;
		r=new Cylinder(2,3,4);		//创建类的对像一般要用new
		System.out.println(r.calVolume());
	}
}
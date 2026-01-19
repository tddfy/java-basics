class MyException extends Exception			//自定义异常
{
	public MyException(String message)
	{
		super(message);
	}
}

public class FindRoot
{
	static double [] root(double a, double b,double c)throws MyException	//异常处理
	{
		double x[]=new double[2];
		if(a==0)
		{
			throw new MyException("a不为0");
		}
		else
		{
			double disc=b*b-4*a*c;
			if(disc<0)
			{
				throw new MyException("b*b-4*a*c<=0");
			}
			x[0]=(-b+Math.sqrt(disc))/(2*a);
			x[1]=(-b-Math.sqrt(disc))/(2*a);
			return x;
		}

	}


	public static void main(String args[])
	{
		try
		{
			double x[]=root(2.0,5,3);
			System.out.println("方程根："+x[0]+","+x[1]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
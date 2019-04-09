
public class Calculation {
	public int z;
	public int x,y;
	
	public Calculation(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public void add()
	{
		z=x+y;
		System.out.println(z);
		
	}
	public void sub()
	{
		z=x-y;
		System.out.println(z);
	}
	public void mul()
	{
		z=x*y;
		System.out.println(z);
	}
	public void div()
	{
		z=x/y;
		System.out.println(z);
		
	}

}

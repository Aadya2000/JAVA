class Car
{
	private int year;
	private String make;
	private static double speed;
	
	public Car (int year,String make,double speed)
	{
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	public int getyear()
	{
		return this.year;
	}
	public String getmake()
	{
		return this.make;
	}
	public double getspeed()
	{
		return this.speed;
	}
	public double Accelerate()
	{
		speed++;
		return speed;
	}
	
	
	}
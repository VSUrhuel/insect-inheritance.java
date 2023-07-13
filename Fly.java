public class Fly
{
	private double mass;
	private double speed;

	public Fly()
	{
		this.mass = 5;
		this.speed = 10;
	}
	public Fly(double mass)
	{
		this.mass = mass;
		this.speed = 10;
	}
	public Fly(double mass, double speed)
	{
		this.mass = mass;
		this.speed = speed;
	}
	
	public double getMass()
	{
		return mass;
	}
	public double getSpeed()
	{
		return speed;
	}
	public void setMass(double mass)
	{
		this.mass = mass;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public void grow(int mass)
	{
		this.mass += mass;
		if(this.mass < 20)
		{
			this.speed += mass;
		}
		else
		{
			this.speed -= (this.mass - 20) * 0.5;
		}
	}

	public boolean isDead()
	{
		if(this.mass == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString()
	{
		if(this.mass == 0)
			return "I'm dead, but I used to be a fly with a speed of " +  this.speed;
		else
			return "I'm a speedy fly with " + this.speed + " speed and " + this.mass + " mass.";
	}
}
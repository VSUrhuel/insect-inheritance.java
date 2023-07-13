public class Frog
{
	private String name;
	private int age;
	private double tongueSpeed;
	private boolean isFroglet;
	private String species;

	public Frog(String name)
	{
		this.name = name;
		this.age = 5;
		this.tongueSpeed = 5;
		this.species = "Rare Pepe";
		if(this.age > 1 && this.age < 7)
		{
			isFroglet = true;
		}
	}
	public Frog(String name, double ageInYears, double tongueSpeed)
	{
		this.name = name;
		this.age = ((int)ageInYears*12);
		this.tongueSpeed = tongueSpeed;
		this.species = "Rare Pepe";
		if(this.age > 1 && this.age < 7)
		{
			isFroglet = true;
		}
	}
	public Frog(String name, int age, int tongueSpeed)
	{
		this.name = name;
		this.age = age;
		this.tongueSpeed = tongueSpeed;
		if(this.age > 1 && this.age < 7)
		{
			isFroglet = true;
		}
	}

	public String getSpecies()
	{
		return this.species;
	}
	public void setSpecies(String species)
	{
		this.species = species;
	}
	public void grow(int numOfMonths)
	{
		this.age += numOfMonths;
		this.tongueSpeed += numOfMonths/12;
		if(this.age >= 30)
		{
			while(this.tongueSpeed > 5)
			{
				this.tongueSpeed -= (numOfMonths-30); 
			}
		}
		if(this.age > 1 && this.age < 7)
		{
			isFroglet = true;
		}
	}
	public void grow()
	{
		this.age += 1;
		this.tongueSpeed += 1;
	}
	public void eat(Fly a)
	{
		if(!a.isDead())
		{
			if(this.tongueSpeed > a.getSpeed())
			{
				System.out.println("The fly is caught.");
				if(a.getMass() < (0.5*this.age))
				{

					grow(1);
				} 
				a.setMass(0);
			}
			else
			{
				a.grow(1);
			}
		}
	}
	@Override
	public String toString()
	{
		if(isFroglet)
		{
			return "My name is " + this.name + " and I'm a rare froglet! I'm " + this.age + " months old and my tongue has a speed of  " + tongueSpeed + ".";
		}
		else
		{
			return "My name is " +this.name+ " and I'm a rare frog. I'm " +this.age+ " months old and my tongue has a speed of " +this.tongueSpeed+ ".";
		}
	}
}
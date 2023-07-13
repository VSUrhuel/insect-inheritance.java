public class Insect{
	//instance variable
	private double weight;
	private int x;
	private int y;


	//constructor 
	public Insect(double weight, int x, int y)
	{
		this.weight = weight;
		this.x = x;
		this.y = y;
		population++;
	}
		//static and private constructor
	public static final double DIST_WEIGHT_LOSS_FACTOR=.0001;
	private static int population = 0;
	private static String[] FACTS = {
		"The two main group of insects are winged and wingless.",
		"There are more than 1 million insect species.",
		"Insects are cold blodded.",
		"Spiders are not considered as insects."
	};
	public void eat(double amount)
	{
		weight += amount;
	}
	public void move(int newX, int newY)
	{
		double distance = calculateDistance(x, y, newX, newY);
		if(distance > 0.0)
		{
			this.x = newX;
			this.y = newY;
			weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
			System.out.println("The new distance is " + distance + " units.");
		}
		else
		{
			System.out.println("The insect stayed in place");
		}
	}
	private static double calculateDistance(int x, int y, int x2, int y2)
	{
		return Math.sqrt(((x2 - x)*(x2 - x))+((y2 - y) * (y2 - 1)));
	}
	public static String randomFact()
	{
		int index = (int)(Math.random() * ((FACTS.length - 1) + 1));
		return FACTS[index];
	}

	//main method
	public static void main(String[] args)
	{
		System.out.println("Insect Population - " + population);
		Insect c = new Insect(10.9, 8, 10);
		System.out.println("Insect Population - " + population);
		Insect d = new Insect(12.0, 2, 3);
		System.out.println("Insect Population - " + population);

		c.move(11, 20);
		d.move(2,3);
		System.out.println(randomFact());
	}
}
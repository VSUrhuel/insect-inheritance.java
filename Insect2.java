public class Insect2{
	private double weight;
	private String name;
	int x;
	int y;
	public Insect2(String name, double weight, int x, int y)
	{
		this.name = name;
		this.weight = weight;
		this.x = x;
		this.y = y;
		population = population + 1;

	}
	public static final double DIST_WEIGHT_LOSS_FACTOR = 0.001;
	private static int population = 0;
	public static String[] FACTS = {
		"The two main group of insects are winged and wingless.",
		"There are more than 1 million insect species.",
		"Insects are cold blodded.",
		"Spiders are not considered as insects."
	};

	public void eat(Insect2 i, double amount)
	{
		System.out.println("Nibble Nibble");
		weight += amount;
		System.out.println("Insect " + i.name + " has eaten an amount of " +amount);
	}
	public void move(Insect2 i, int newX, int newY)
	{
		double distance = calculateDistance(this.x, this.y, newX, newY);
		if(distance > 0.0)
		{
			this.x = newX;
			this.y = newY;
			weight = weight * DIST_WEIGHT_LOSS_FACTOR * distance;
			System.out.printf("The insect %s moved havinga an updated distance of %.2f units.\n", i.name, distance);
		}
		else
		{
			System.out.println("The insect " + i.name + " did not move!");
		}
	}
	private static double calculateDistance(int x, int y, int x2, int y2)
	{
		return Math.sqrt(((x2-x) * (x2-x)) + (y2-y) * (y2 - y)); 
	}
	public static String produceRandomFact()
	{
		int index = (int)(Math.random() * ((FACTS.length - 1) + 1));
		return FACTS[index];
	}
	public void displayInformation(Insect2 i)
	{
		System.out.println("Information about Insect " + i.name + ":");
		System.out.println("Weight: " + i.weight);
		System.out.println("Location (x,y): " + i.x + ", " +i.y);
	}

	public static void main(String[] args)
	{
		Insect2 a = new Insect2("Mosquito",90.1, 21, 289);
		a.displayInformation(a);

		Insect2 b = new Insect2("Firefly",81.2, 8, 10);
		b.displayInformation(b);
		
		System.out.println("");
		a.eat(a, 89.1);
		b.eat(b, 90.1);
		a.move(a, 21, 289);
		b.move(b, 11, 20);

		System.out.println("");
		System.out.println("Insect Population : " + population);
		a.displayInformation(a);
		b.displayInformation(b);

		System.out.println("");
		System.out.println("Random fun fact!");
		System.out.println(produceRandomFact());
	}
}
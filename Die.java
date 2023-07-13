import java.util.Random;
public class Die
{
	private static final int SIDES = 6;
	private int faceValue;
	private int ctr;
	private Random rand;

	public Die()
	{
		this.faceValue = 1;
		this.ctr = 0;
		this.rand = new Random();
	}
	public int roll()
	{
		faceValue = rand.nextInt(SIDES) + 1;
		ctr++;
		return faceValue;
	}
	public int getFaceValue()
	{
		return faceValue;
	}
	@Override
	public String toString()
	{
		return "You have rolled the dice for " + ctr + " times.";
	}
}
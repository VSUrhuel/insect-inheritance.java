public class Pond
{
	public static void main(String[] args)
	{
		Frog a = new Frog("Peepo");
		Frog b = new Frog("Pepe", 10, 15);
		Frog c = new Frog("Peepaw", 4.6, 5);
		Frog d = new Frog("Rhuel");
		//Fly objects
		Fly x = new Fly(1, 3);
		Fly y = new Fly(1,2);
		Fly z = new Fly();

		a.setSpecies("1331 Frogs");
		System.out.println(a);
		a.eat(x);
		System.out.println(x);
		System.out.println(a);
		d.eat(y);
		System.out.println(d);
		c.grow(4);
		System.out.println(c);
		System.out.println(b);
		System.out.println(a.getSpecies());
		System.out.println(d.getSpecies());
	}
}
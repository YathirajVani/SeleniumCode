class Fish 
{
	int distance;

		public Fish(int d)
	{
			distance = d;

	}

	public void move()
	{
	System.out.println("Move  " +distance+ "  moves");
	}
	public static void main(String[] args) 
	{
		Fish f1 = new Fish(20);
		Fish f2 = new Fish(10);
		f1.move();
		f2.move();
		System.out.println ("Fish move was successful");
	}
}

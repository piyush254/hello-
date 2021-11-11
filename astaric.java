class astaric 
{
	static 
	{
		System.out.println("hi static");
	}
	astaric()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("instance");
	}
	public static void main(String []args)
	{
		astaric r =new astaric();
	}
}
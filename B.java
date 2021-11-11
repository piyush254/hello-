class A
{
	int a,b;
	void show()
	{
		a=99;b=1000;
		System.out.println(a+" "+b);
	}
	A()
	{
		a=30;b=40;
		System.out.println(a+" "+b);
	}
	 void C()
	{
		System.out.println("hi am a prit function");
	}
	{
		a=10;b=20;
		System.out.println(a+" "+b);
	}
}
class B 
{
	public static void main(String []args)
	{
		A r =new A();
		r.show();
		r.C();
	}
}
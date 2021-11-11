public class box
{
    private int l,b,h;
    public box()
    {
        l=20;b=8;h=40;
    }
	public box(int L ,int B,int H)
	{l=L; b=B; h=H;}
    public static void main(String[] args)
    {
        box b1=new box();
		box b2=new box(20,25,30);
    }
}

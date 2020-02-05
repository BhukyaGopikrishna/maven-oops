
public class Candy implements Sweets
{
	int c,w;
	public Candy(int n) {
		c=n;
	}
	public int Weight_meth()
	{
		w=weight*c;
		return w;
	}
}

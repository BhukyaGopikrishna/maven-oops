
public class Chocolates implements Sweets
{
	int c,w;
	public Chocolates(int n) {
		c=n;
	}
	public int Weight_meth() {
		w=weight*c;
		return w;
	}
}

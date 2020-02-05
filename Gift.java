
public class Gift {
	int choc,cha,t;
	Gift(int ch,int ca){
		cha=ca;
		choc=ch;
	}
	int totalWeight() {
		Chocolates ch1=new Chocolates(choc);
		Candy c=new Candy(cha);
		t=ch1.Weight_meth()+c.Weight_meth();
		return t;
	}
}

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Gift g=new Gift(4,6);
		Gift g1=new Gift(1,7);
		Gift g2=new Gift(3,5);
		Gift g3=new Gift(2,8);
		Gift g4=new Gift(1,4);
		int x[]=new int[5];
		x[0]=g.totalWeight();
		x[1]=g1.totalWeight();
		x[2]=g2.totalWeight();
		x[3]=g3.totalWeight();
		x[4]=g4.totalWeight();
		Arrays.parallelSort(x);
		for(int i=0;i<5;i++)
		{
			System.out.println(x[i]);
		}
	}

}

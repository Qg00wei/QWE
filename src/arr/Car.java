package arr;
interface ComputeWeight{
	public double  computeweight();
}
class Television implements ComputeWeight{
	private double Tweight;
	private int x;
	public  Television (double p,int q) {
	Tweight=p;
	x=q;
	}
	public double computeweight() {
		return Tweight*x;
	}
}
class Computer implements ComputeWeight{
	private double Cweight;
	private int y;
	public  Computer(double p,int q) {
		Cweight=p;
		y=q;
	}
	public double computeweight() {
		return Cweight*y;
	}
class WashMachine implements ComputeWeight{
		private double Wweight;
		private int z;
		public  WashMachine(double p,int q) {
			Wweight=p;
			z=q;
		}
		public double computeweight() {
			return Wweight*z;
		}
	}
public static class Car
{
	  ComputeWeight[] cw=new ComputeWeight[3];
	  public Car()
	  {
		  cw[0]=new Television(20,20);
		  cw[1]=new Computer(10,20);
		  cw[2]=new WashMachine(70,10);
	 
	  }
      public void sum()
      {
	   System.out.println("货物的总重量是："+cw[0].computeweight()+cw[1].computeweight()+cw[2].computeweight());
      }

      public static void main(String[] args) 
      {
  		// TODO Auto-generated method stub
  		Car car=new Car();
  		car.sum();
      }
}
}

	



package arr;
interface StudentManageInterface{
	void setFee(double fee);
	double getFee();
}
interface TeachertManageInterface{
	void setPay(double fee);
	double getPay();
}
class Graduate implements StudentManageInterface,TeachertManageInterface{
	private String name;
	private int age;
	private char sex;
	private double fee;
    private double pay;
	@Override
	public void setPay(double pay) {
		this.pay=pay;
		// TODO 自动生成的方法存根
		
	}
	@Override
	public double getPay() {
		return pay;
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void setFee(double fee) {
		this.fee=fee;
		// TODO 自动生成的方法存根
		
	}
	@Override
	public double getFee() {
		// TODO 自动生成的方法存根
		return fee;
	}
}

public class XNT {
    public static void main(String[] args){
    	Graduate zhangsan=new Graduate();
    	zhangsan.setPay(1500);
    	zhangsan.setFee(5500);
    	if(zhangsan.getPay()*12-zhangsan.getFee()<2000)
    	{
    	
    	  	System.out.println("provide a loan");
    	}
    	else
    	{
    		System.out.println("不需要贷款");
    	}
    }
}
    	
    		
    		
    		
    		
    		
    		



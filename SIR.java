import java . io .*;
public class SIR {
	public inidata init=new inidata();
	double s=init.getS();
	double i=init.getI();
	double r=init.getR();
	double gama=init.getgama();
	double beta=init.getbeta();
	int n=init.getN();
	public tau step=new tau(gama,beta,s,i,r);
	
	public static void main(String[] args)
	{
		Process proc=null;
		SIR mysimu=new SIR();
		mysimu.startsimu();
		//try
		//{
		//	proc = Runtime.getRuntime().exec("./plot.sh");                        
		//	proc.waitFor();
	//	} catch (IOException e)
		//{
		//	e.printStackTrace();
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}finally{
		//    proc.destroy();
		//}  
	}
	
	public void startsimu()
	{
		int j=0;
		double s=step.getS();
		double i=step.getI();
		double r=step.getR();
		for(j=0;j<n;j=j+1)
		{
			s=step.getS();
			i=step.getI();
			r=step.getR();
			//System.out.println(s);
			step.updata(s,i,r);
		}
	}
}

import java.io.FileWriter;
import java.io.IOException;

public class tau {
	public double dt=0.001;
	public double beta;
	public double gama;
	public double s;
	public double i;
	public double r;
	tau(double gama, double beta, double s, double i, double r)
	{
		this.s=s;
		this.i=i;
		this.r=r;
		this.gama=gama;
		this.beta=beta;
		//System.out.print(this.s);
		//System.out.print(i);
		//System.out.print(r);
		//System.out.println();
		updata(s,i,r);
	}
	public double getS()
	{
		//System.out.print(this.s);
		return s;
	}
	public double getI()
	{
		return i;
	}
	public double getR()
	{
		return r;
	}
	public void updata(double s, double i, double r)
	{
		this.s=s-beta*s*i*dt;
		this.i=i+beta*s*i*dt-gama*i*dt;
		this.r=r+gama*i*dt;
		String fileName="SirData.txt";
		try
		{
			FileWriter writer=new FileWriter(fileName,true);
			String ss=Double.toString(this.s);
			String is=Double.toString(this.i);
			String rs=Double.toString(this.r);
			writer.write(ss+"\t");
			writer.write(is+"\t");
			writer.write(rs+"\n");
			writer.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
}


import java . util . Scanner ;
import java . util . ArrayList ;
import java . util . LinkedList ;
import java . io . File ;
import java . io . FileNotFoundException ;
import java.io.FileWriter;
import java.io.IOException;
public class inidata {
	public double s;
	public double i;
	public double r;
	public double gama;
	public double beta;
	public int n;
	public double getS()
	{
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
	public int getN()
	{
		return n;
	}
	public double getbeta()
	{
		return beta;
	}
	public double getgama()
	{
		return gama;
	}
	inidata()
	{
		Scanner console ;
		console = new Scanner ( System . in ) ;
		System . out . print ( " Enter s : " ) ;
		s = console . nextDouble () ;
		System . out . print ( " Enter i : " ) ;
		i = console . nextDouble () ;
		System . out . print ( " Enter r : " ) ;
		r = console . nextDouble () ;
		System . out . print ( " Enter gamma : " ) ;
		gama = console . nextDouble () ;
		System . out . print ( " Enter beta : " ) ;
		beta = console . nextDouble () ;
		System . out . print ( " Enter iterN : " ) ;
		n = console . nextInt () ;
		String fileName="SirData.txt";
		try
		{
			FileWriter writer=new FileWriter(fileName);
			writer.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

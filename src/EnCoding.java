import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EnCoding 
{
	public int polynomial ; 
	public int SizeOfPop;
	private ArrayList<String> population = new ArrayList<String>();
	 public EnCoding(int polynomial, int SizeOfPop)
	  {
		  this.polynomial = polynomial;
		  this.SizeOfPop = SizeOfPop;
	  }
	 public float Random()
		{
		 float min = -10;
	      float max = 10;
		 float random_int = (float)Math.floor(Math.random()*(max-min+1)+min);
			
			return random_int;
		}
	 public ArrayList<String> encoding() 
	  {
		 for(int i=1;i<=SizeOfPop;i++)
		 {
			 String [] chromosome = new String[polynomial];
			 String chro = ""; 
			 float random1 =Random() ;
			  String chro2 ="";
			  chro2= String.valueOf(random1);
			   chro +=chro2;
			 for(int j=0;j<polynomial;j++)
				{				
				 float random =Random() ;
				    chromosome[j]=String.valueOf(random);
				    chro +=","+ chromosome[j];
			   }
			 
				population.add(chro);
		}
		 
			return population;
			  
	     
			
	 }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CrossOver {
	public ArrayList<String> Population = new ArrayList<String>();
	public ArrayList<String> NewPopulation = new ArrayList<String>();
	public ArrayList<String> chromosome1  = new ArrayList<String>();
	public ArrayList<String> chromosome2  = new ArrayList<String>();
	public String offs1="" ;
	public String offs2 ="";
	public int polynomial ; 
	//String [] split1 ; 
	//String [] split2;
	 public CrossOver(int polynomial,ArrayList<String> Population)
	  {
		  chromosome1.clear();
		  chromosome2.clear();
		  this.polynomial = polynomial;
		  this.Population = Population;
		  String [] split1= Population.get(0).split(",");
	       this.chromosome1 = new ArrayList<String>(Arrays.asList(split1));
	       String [] split2 = Population.get(1).split(",");
	       this.chromosome2 = new ArrayList<String>(Arrays.asList(split2 ));
	  }
	  public int Random()
		{
			Random rand = new Random(); 
		      int upperbound =polynomial+1;
		      int int_random = rand.nextInt(upperbound-1)+1; 
			return int_random;
		}
	  public void GetOffs(int R1,int R2)
	  {

		  
		  for(int i=0;i<R1;i++)
		  {
			  if(i==0)
			  {
				  offs1+=chromosome1.get(i);
				  offs2+=chromosome2.get(i);
			  }
			  else
			  {
				  offs1+=","+chromosome1.get(i);
				  offs2+=","+chromosome2.get(i);
			  }
	     }
				  
				
			  
		  for(int i=R1;i<R2;i++)
		  {
			  offs1+=","+chromosome2.get(i);
			  offs2+=","+chromosome1.get(i);
		  }
		  for(int i=R2;i<chromosome1.size();i++)
		  {
			  offs1+=","+chromosome1.get(i);
			  offs2+=","+chromosome2.get(i);
		  }
		  NewPopulation.add(offs1);
	      NewPopulation.add(offs2);
	  }
	 public ArrayList<String> DoublePoint(){
		  double rnd = Math.random(); 
	        if(rnd > 0.2) 
	        {
	            int R1 = Random();	//1
	            int R2 = Random();	//1 
	            while(true)
	            {
	            	if(R1==R2)
		            {
		            	R2 = Random();//1
		            	continue;
		            }
	            	else if(R2<R1)
		            {
	            		GetOffs(R2,R1);
	            		return NewPopulation;  
		            }
		            else 
		            {
		            	GetOffs(R1,R2);
		        		return NewPopulation;  

		            }
	            }
	        }
	        	return Population;
	  }
}

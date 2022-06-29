import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Mutation 
{
	public ArrayList<String> LastPopulation = new ArrayList<String>();
	public ArrayList<String> NewPopulation = new ArrayList<String>();
	int t , T;
	public int polynomial;
	public Mutation(ArrayList<String> NewPopulation, int polynomial ,int t , int T)
	{
		this.NewPopulation=NewPopulation;
		this.polynomial = polynomial+1;
		this.t=t;
		this.T=T;
	}
	public ArrayList<String> nonUniformMutation()
	{
		for(int i=0;i<NewPopulation.size();i++)
		{
			String [] strSplit = NewPopulation.get(i).split(",");
	        ArrayList<String> chromosome = new ArrayList<String>(Arrays.asList(strSplit));
	        String LastGene = "";
       	     int b = 4; //factor
 
	        for(int j=0;j<chromosome.size();j++)
			{	    
		            double pm = Math.random(); //hy3ml mutation wla la
		            if(pm > 0.5) //hy3ml mutation 
		            {
		            	 float y = 0; //dellta
		            	 double r1 =Math.random(); //hymshe ymen wla shmal
		            	 float equation;
		            	if(r1<=0.5)
		            	{
		            	   float f=Float.parseFloat(chromosome.get(j));
		            	   y = f - (-10) ; 
		            	   Random random =new Random() ;
		            	   int r = random.nextInt(2);		            
		            	   float power = (float) Math.pow((1-(t/T)),b);
		            	   float power2 = (float) Math.pow(r,power);
		            	   equation = y*(1-power2);
		            	   String eqStr =Float.toString(f-equation);
		            	   chromosome.set(j,eqStr); //Xnew
		            	}
		            	else
		            	{
		            		float f=Float.parseFloat(chromosome.get(j));  
			            	   y = 10-f ; 
			            	   Random random =new Random() ;
			            	   int r = random.nextInt(2);
			            	   float power = (float) Math.pow((1-(t/T)),b);
			            	   float power2 = (float) Math.pow(r,power);
			            	   equation = y*(1-power2);
			            	   String eqStr =Float.toString(f+equation); 
			            	   chromosome.set(j,eqStr);
		            	}
		            }
		          if(j==0) 
		          {
		        	  LastGene+=chromosome.get(j);  
		          }
		          else
		             LastGene+=","+chromosome.get(j);     
			}
	        
	        LastPopulation.add(LastGene);
		}
		
		return LastPopulation;
		
	}
}

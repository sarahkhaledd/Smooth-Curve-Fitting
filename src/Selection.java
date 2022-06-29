import java.util.ArrayList;
import java.util.Random;

public class Selection {
	public ArrayList<String> Population = new ArrayList<String>();
	public ArrayList<Float> Fitness=  new ArrayList<Float>();
	public Selection(ArrayList<String> P,ArrayList<Float> F)
	{
		Population = P;
		Fitness = F;
	}
	public ArrayList<String> Tournament()
	{
		ArrayList<String> NewPopulation = new ArrayList<String>();
		Float min =(float) 10000;
		Float min2 =(float) 10000;
		int index =0 ,index1 = 0;
		  for(int i =0;i<Fitness.size();i++)
			{
				 if(Fitness.get(i)<min)
			        { 
			            min2 = min;
			            min = Fitness.get(i);
			        }
			        else if (Fitness.get(i) < min2 && Fitness.get(i) != min)
			        {
			        	min2 = Fitness.get(i);
			        }
			}
		   for(int j =0;j<Fitness.size();j++)
		    {
			   if(Fitness.get(j).equals(min))
			   {
				   NewPopulation.add(Population.get(j));
			   }
			   else if(Fitness.get(j)==min2)
			   {
				   NewPopulation.add(Population.get(j));
			   
		       }

		    }
		return NewPopulation;
		
	}

}

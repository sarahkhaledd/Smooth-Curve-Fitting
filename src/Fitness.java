import java.util.ArrayList;
import java.util.Arrays;

public class Fitness 
{
	public ArrayList<String> NewPopulation = new ArrayList<String>();
	ArrayList<Float> XPoints = new ArrayList<Float>();
	ArrayList<Float> PointsOfRealGraph = new ArrayList<Float>();
	ArrayList<Float> Points = new ArrayList<Float>();
	ArrayList<Float> fitness = new ArrayList<Float>();
	public int polynomial;
	float EquG = 0 ;
	public Fitness(ArrayList<String> NewPopulation ,ArrayList<Float> XPoints,ArrayList<Float> PointsOfRealGraph,int polynomial)
	{
		this.NewPopulation=NewPopulation;
		this.XPoints=XPoints;
		this.PointsOfRealGraph=PointsOfRealGraph; 
		this.polynomial=polynomial;
		for(int j =0;j<PointsOfRealGraph.size();j++)
		{
			//float qGraph =(float) Math.pow(PointsOfRealGraph.get(j), 2);
			EquG+=PointsOfRealGraph.get(j);
		}
	}
	public void Calculation(ArrayList<Float> PointsX)
	{
		float EquX = 0 ;
		for(int i =0;i<PointsX.size();i++)
		{
			//float qX =  (float) Math.pow(PointsX.get(i), 2);
			EquX+=PointsX.get(i);
		}
		float error =(float) Math.pow((EquX-EquG),2);
		error%=100;
		fitness.add(error);
		
	}
	public ArrayList<Float> Evaluation()
	{
		for(int i=0;i<NewPopulation.size();i++)
		{
			String [] strSplit ;
			strSplit = NewPopulation.get(i).split(",");
	        ArrayList<String> chromosome = new ArrayList<String>(Arrays.asList(strSplit));
			for(int j=0;j<XPoints.size();j++)
			{
			    float x = XPoints.get(j);
			    float equation = 0;
			    for(int k=0,d=polynomial;k<chromosome.size()&&polynomial>=0;k++,d--)
			    {
			    	 float gene = Float.parseFloat(chromosome.get(k));
			    	 float XofGene =(float) (gene * Math.pow(x, d));
			    	 equation +=XofGene;
			    }
			    Points.add(equation);
			}
			Calculation(Points);
			chromosome.clear();
			
		}
		
		return fitness;
		
	}
}

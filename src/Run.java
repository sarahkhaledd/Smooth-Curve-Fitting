import java.io.IOException;
import java.util.ArrayList;

public class Run 
{
	public ArrayList<Float> XPoints = new ArrayList<Float>();
	public ArrayList<Float> Fitness = new ArrayList<Float>(); 
	public ArrayList<Float> PointsOfRealGraph = new ArrayList<Float>();
	public Fitness fitness;
	int polynomial , T=6 ; 
	public float MinOfFitness = 10000 ; 
    public String MinOfChromosome  ; 
    File file =new File();
	public void Minium(ArrayList<String> Population)
	{
		float Min = 10000 ;
		int index = 0; 
		for(int i=0;i<Fitness.size();i++)
		{
			if(Fitness.get(i)<Min)
			{
				Min = Fitness.get(i);
				index = i ;
			}
		}
		String Chromosome ; 
		Chromosome = Population.get(index);
		if(Min<MinOfFitness)
		{
			MinOfFitness=Min ; 
			MinOfChromosome = Chromosome ;
		}
	}
   public Run(ArrayList<Float> XPoints,ArrayList<Float> PointsOfRealGraph,int polynomial_degree) throws IOException
   {
	   this.PointsOfRealGraph = PointsOfRealGraph;
	   this.polynomial = polynomial_degree;
	   this.XPoints = XPoints;
	   EnCoding g =new EnCoding(polynomial,4);
	   ArrayList<String> PopulationList = new ArrayList<String>();
		 PopulationList = g.encoding();
		
		for(int i =0;i<=T;i++)
	    {
		   fitness = new Fitness(PopulationList,XPoints,PointsOfRealGraph,polynomial);
		   Fitness = fitness.Evaluation();
		   //System.out.println(Fitness.get(i));
		   Selection selection = new Selection(PopulationList,Fitness);
		   ArrayList<String> NewPop = new ArrayList<String>();
		   NewPop= selection.Tournament();
		   
		   ArrayList<String> crossArray = new ArrayList<String>();
			CrossOver crossover = new CrossOver(polynomial,NewPop);
			crossArray = crossover.DoublePoint();
			 
			
			
			ArrayList<String> Mutai = new ArrayList<String>();
			Mutation mutation = new Mutation(crossArray,polynomial,i,T);
			Mutai=mutation.nonUniformMutation();
			
			ArrayList<String> replayy = new ArrayList<String>();
			Replacement replacement = new Replacement(PopulationList,NewPop,Mutai);
			replayy=replacement.replacement();
			fitness = new Fitness(replayy,XPoints,PointsOfRealGraph,polynomial);
			Fitness = fitness.Evaluation();
			Minium(replayy);
			
         }
		file.OutPutFile(MinOfFitness,MinOfChromosome);
		
	   
   }
   
}

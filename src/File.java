import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class File {
	public ArrayList<String> File = new ArrayList<String>();
	ArrayList<Float> XPoints = new ArrayList<Float>();
	ArrayList<Float> PointsOfRealGraph = new ArrayList<Float>();
	Run run ; 
	public File()
	{
		
	}
	public void InputFile() throws IOException
	{
		String line; 
		FileReader file = new FileReader("input_example.txt");  
        BufferedReader br = new BufferedReader(file); 
        int NoOfPoints = 0 , polynomial_degree = 0 ; 
        while((line = br.readLine()) != null) 
        {  
        	File.add(line);
	    } 
        int NoOfGraphs = Integer.parseInt(File.get(0)); //NO. Of Graphs
        if(NoOfGraphs<=5) //httghyr 5
        {
        	int i=1;
        	
    		while(i<File.size())
            {    
    			XPoints.clear();
    			PointsOfRealGraph.clear();
    		     String[] split;
    		     split = File.get(i).split(" ");
    		     NoOfPoints = Integer.parseInt(split[0]);
    		     polynomial_degree = Integer.parseInt(split[1]);
    		     int k =i+1;
    			 for(int j=0;j<NoOfPoints;j++)
    			 {
    				String[] splitPoints;
    				splitPoints = File.get(k).split(" ");
    				
    				XPoints.add(Float.parseFloat(splitPoints[0]));
    				PointsOfRealGraph.add(Float.parseFloat(splitPoints[1]));
    				k++;
    			 }
    			 run = new Run(XPoints,PointsOfRealGraph,polynomial_degree);    		
    			i+=1+NoOfPoints; 
    	}
        }
        
        
	}
	public void OutPutFile(float MinOfFitness,String MinOfChromosome) throws IOException
	{
		try {
			 
            BufferedWriter out = new BufferedWriter(new FileWriter("output_example.txt", true));
 
            out.write("Error is : "+MinOfFitness);
            out.newLine();
            out.write("Chromosome is : " + MinOfChromosome);
            out.newLine();
            out.close();
        }
 
        catch (IOException e) {
 
            System.out.println("exception occoured" + e);
        }
	}
}

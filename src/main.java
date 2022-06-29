import java.io.IOException;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File();
		file.InputFile();
	   	

		/*ArrayList<Float> XPoint = new ArrayList<Float>();
		ArrayList<Float> graph = new ArrayList<Float>();
		 ArrayList<String> arr = new ArrayList<String>();
		 XPoint.add((float) 1.0);
		 XPoint.add((float) 0.7);
		 XPoint.add((float) 1.5);
		 XPoint.add((float) 4.5);
		 graph.add((float) 0.015);
		 graph.add((float) 1.5);
		 graph.add((float) 2.0);
		 graph.add((float) 0.4);
		 
		EnCoding encod = new EnCoding(3,4);
		arr = encod.encoding();
		for(int j=0;j<arr.size();j++)
		{
			System.out.println(arr.get(j));
		}
		Fitness f = new Fitness(arr,XPoint,graph,3);
		ArrayList<Float> mark =f.Evaluation();
		for(int j=0;j<mark.size();j++)
		{
			System.out.println(mark.get(j));
		}/*
		System.out.println("---------------");
		Selection s = new Selection(arr,mark);
		ArrayList<String> t=s.Tournament();
		for(int j=0;j<t.size();j++)
		{
			System.out.println(t.get(j));
		}
		System.out.println("---------------");
		CrossOver cross = new CrossOver(3,t);
		ArrayList<String> crossover =cross.DoublePoint();
		for(int j=0;j<crossover.size();j++)
		{
			System.out.println(crossover.get(j));
		
		}
		System.out.println("---------------");
		Mutation m = new Mutation(crossover,3,1,4);
		 ArrayList<String> mark2 = m.nonUniformMutation();
		 for(int j=0;j<mark2.size();j++)
			{
				System.out.println(mark2.get(j));
			}
		 System.out.println("---------------");
		 Replacement r = new Replacement(arr,t,mark2);
		 ArrayList<String> mark3 = r.replacement();
		 for(int j=0;j<mark3.size();j++)
			{
				System.out.println(mark3.get(j));
			}
		 System.out.println("---------------");
		/*Mutation m = new Mutation(arr,3,0,4);
		 ArrayList<String> mark = m.nonUniformMutation();
		
		//System.out.println(encod.Random());
		/*ArrayList<String> Weight = new ArrayList<String>();
		ArrayList<Integer> Value = new ArrayList<Integer>();
		Weight.add("35478947985");
		Weight.add("41425100000");
		Weight.add("73910000000");
		Weight.add("90696110004");
		
		Value.add(4);
		Value.add(7);
		Value.add(10);
		Value.add(2);
		
		
	}

    */
}}

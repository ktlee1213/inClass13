package inClass13;
import java.util.ArrayList;
import java.util.Scanner;

public class averageScores 
{
	public static void main(String[] args) 
	{
		ArrayList<Double> score = new ArrayList<Double>();
		fillArrayList(score);
		showAverage(score);
		System.out.println(score);
	}
	
	public static void fillArrayList(ArrayList<Double> a)
	{
		System.out.println( "Enter numbers you want to average");
		Scanner keyboard = new Scanner(System.in);
		double next;
		next = keyboard.nextDouble();
		boolean done = false;
		
		while(!done)
		{
			a.add(next);
			next = keyboard.nextDouble();
			if(next == 00)
				done = true;
		}
	}
	
	public static double computeAverage(ArrayList<Double> a)
	{
		double total = 0;
		for (Double element : a)
			total = total + element;
		int numberOfScores = a.size();
		if (numberOfScores > 0)
		{
			return (total/numberOfScores);
		}
		else
		{
			System.out.println("ERROR Averaging 0 numbers");
			return 0;
		}
	}
	
	public static void showAverage(ArrayList<Double> a)
	{
		double average = computeAverage(a);
		System.out.println("The average of the " + a.size() + " scores is " + average);
	}
}

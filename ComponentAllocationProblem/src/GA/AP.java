package GA;
/*  Modified from:
 *  Lee Jacobson and Burak Kanber. Genetic Algorithms in Java Basics. Apress, Berkeley, CA, 1st edition, 2015.
 */

import java.util.Arrays;
import allocationProblem.AllocationProblemCon;


public class AP {
	public static int maxGenerations = 300;
	
	public static double solveAllocationProblem(AllocationProblemCon allocation) {
		
		Allocation.cap = allocation;
		
		int m = allocation.m;
		int n = allocation.n;
		

		
		// Initial GA
		GeneticAlgorithm ga = new GeneticAlgorithm(80, 0.05, 0.95, 2, 5);

		// Initialize population
		Population population = ga.initPopulation(n,m);

		// Evaluate population
		ga.evalPopulation(population);

		Allocation startAllocation = new Allocation(population.getFittest(0));

		
		int generation = 1;
		// Start evolution loop
		while (ga.isTerminationConditionMet(generation, maxGenerations) == false) {
			// Print fittest individual from population
			Allocation alloc = new Allocation(population.getFittest(0));

			// Apply crossover
			population = ga.crossoverPopulation(population);

			// Apply mutation
			population = ga.mutatePopulation(population);

			// Evaluate population
			ga.evalPopulation(population);

			// Increment the current generation
			generation++;
		}
		
		return new Allocation(population.getFittest(0)).cost();

	}
}

package GA;
/*  Modified from:
 *  Lee Jacobson and Burak Kanber. Genetic Algorithms in Java Basics. Apress, Berkeley, CA, 1st edition, 2015.
 */
import java.util.Arrays;
import allocationProblem.AllocationProblemCon;

public class Allocation {
	
	static AllocationProblemCon cap;
	
	int allocation[];
	
	
	
	
	public Allocation(Individual individual) {
		// Get individual's chromosome
		allocation = individual.getChromosome();
		
	}
	
	public Allocation(int[] chromosome) {
		// Get individual's chromosome
		allocation = chromosome;
		
	}
	

	public boolean isValid() {
		
		
		return cap.isValid(allocation);
	}
	
	
	public double cost() {
		if(!this.isValid()) return Integer.MAX_VALUE;
		return cap.cost(allocation);
	}
	
	
	
}
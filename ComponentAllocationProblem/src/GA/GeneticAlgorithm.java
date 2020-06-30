package GA;
/*  Modified from:
 *  Lee Jacobson and Burak Kanber. Genetic Algorithms in Java Basics. Apress, Berkeley, CA, 1st edition, 2015.
 */
import java.util.Arrays;

public class GeneticAlgorithm {
	
    private int populationSize;
    private double mutationRate;
    private double crossoverRate;
    private int elitismCount;
	protected int tournamentSize;

	public GeneticAlgorithm(int populationSize, double mutationRate, double crossoverRate, int elitismCount,
			int tournamentSize) {
		
        this.populationSize = populationSize;
        this.mutationRate = mutationRate;
        this.crossoverRate = crossoverRate;
        this.elitismCount = elitismCount;
		this.tournamentSize = tournamentSize;
	}


    /**
     * Initialize population
     * 
     * @param chromosomeLength The length of the individuals chromosome
     * @return population The initial population generated
     */
    public Population initPopulation(int chromosomeLength, int m){
        // Initialize population
        Population population = new Population(this.populationSize, chromosomeLength, m);
        return population;
    }
    
	/**
	 * Check if population has met termination condition -- this termination
	 * condition is a simple one; simply check if we've exceeded the allowed
	 * number of generations.
	 * 
	 * @param generationsCount
	 *            Number of generations passed
	 * @param maxGenerations
	 *            Number of generations to terminate after
	 * @return boolean True if termination condition met, otherwise, false
	 */
	public boolean isTerminationConditionMet(int generationsCount, int maxGenerations) {
		return (generationsCount > maxGenerations);
	}
    
	/**
	 * Calculate individual's fitness value
	 * 
	 * Fitness, in this problem, is inversely proportional to the route's total
	 * distance. The total distance is calculated by the Route class.
	 * 
	 * @param individual
	 *            the individual to evaluate
	 * @param cities
	 *            the cities being referenced
	 * @return double The fitness value for individual
	 */
    public double calcFitness(Individual individual){
        // Get fitness
    	
        Allocation alloc = new Allocation(individual);
        double fitness = 1 / alloc.cost();
                
        // Store fitness
        individual.setFitness(fitness);
        
        return fitness;
    }

    /**
     * Evaluate population -- basically run calcFitness on each individual.
     * 
     * @param population the population to evaluate
     * @param cities the cities being referenced
     */
    public void evalPopulation(Population population){
        double populationFitness = 0;
        
        // Loop over population evaluating individuals and summing population fitness
        for (Individual individual : population.getIndividuals()) {
            populationFitness += this.calcFitness(individual);
        }
        
        double avgFitness = populationFitness / population.size();
        population.setPopulationFitness(avgFitness);
    }
 
	/**
	 * Selects parent for crossover using tournament selection
	 * 
	 * Tournament selection was introduced in Chapter 3
	 * 
	 * @param population
	 *            
	 * @return The individual selected as a parent
	 */
	public Individual selectParent(Population population) {
		// Create tournament
		Population tournament = new Population(this.tournamentSize);

		// Add random individuals to the tournament
		population.shuffle();
		for (int i = 0; i < this.tournamentSize; i++) {
			Individual tournamentIndividual = population.getIndividual(i);
			tournament.setIndividual(i, tournamentIndividual);
		}

		// Return the best
		return tournament.getFittest(0);
	}

	
    /**
	 * Ordered crossover mutation
	 * 
	 * @param population
	 * @return The new population
	 */
    public Population crossoverPopulation(Population population){
        // Create new population
        Population newPopulation = new Population(population.size());
        
        // Loop over current population by fitness
        for (int populationIndex = 0; populationIndex < population.size(); populationIndex++) {
            // Get parent1
            Individual parent1 = population.getFittest(populationIndex);
            
            // Apply crossover to this individual?
            if (this.crossoverRate > Math.random() && populationIndex >= this.elitismCount) {
                // Find parent2 with tournament selection
                Individual parent2 = this.selectParent(population);

                // Create blank offspring chromosome
                int offspringChromosome[] = new int[parent1.getChromosomeLength()];
                Arrays.fill(offspringChromosome, -1);
                Individual offspring = new Individual(offspringChromosome);

                // Get subset of parent chromosomes
                int substrPos1 = (int) (Math.random() * parent1.getChromosomeLength());
                int substrPos2 = (int) (Math.random() * parent1.getChromosomeLength());

                // make the smaller the start and the larger the end
                final int startSubstr = Math.min(substrPos1, substrPos2);
                final int endSubstr = Math.max(substrPos1, substrPos2);

                // Loop and add the sub tour from parent1 to our child
                for (int i = startSubstr; i < endSubstr; i++) {
                    offspring.setGene(i, parent1.getGene(i));
                }

                // Loop through parent2's chromosome
                for (int i = 0; i < parent2.getChromosomeLength(); i++) {
                    if(i<startSubstr && i>=endSubstr)
                    	offspring.setGene(i, parent2.getGene(i));

                }

                // Add child
                if(new Allocation(offspring).isValid())
                	newPopulation.setIndividual(populationIndex, offspring);
                else
                	newPopulation.setIndividual(populationIndex, parent1);
            } else {
                // Add individual to new population without applying crossover
                newPopulation.setIndividual(populationIndex, parent1);
            }
        }
        
        return newPopulation;
    }

    /**
	 * Apply mutation to population
	 * @param population
	 *            The population to apply mutation to
	 * @return The mutated population
	 */
    public Population mutatePopulation(Population population){
        // Initialize new population
        Population newPopulation = new Population(this.populationSize);
        
        // Loop over current population by fitness
        for (int populationIndex = 0; populationIndex < population.size(); populationIndex++) {
            Individual individual = population.getFittest(populationIndex);
            int tmp[] = individual.getChromosome().clone();
            Individual originalIndividual = new Individual(tmp);

            // Skip mutation if this is an elite individual
            if (populationIndex >= this.elitismCount) {   
                // Loop over individual's genes
                for (int geneIndex = 0; geneIndex < individual.getChromosomeLength(); geneIndex++) {   
                	// System.out.println("\tGene index "+geneIndex);
                    // Does this gene need mutation?
                    if (this.mutationRate > Math.random()) {
                        // Get new gene position
                        int newGenePos = (int) (Math.random() * individual.getChromosomeLength());
                        // Get genes to swap
                        int gene1 = individual.getGene(newGenePos);
                        int gene2 = individual.getGene(geneIndex);
                        // Swap genes
                        individual.setGene(geneIndex, gene1);
                        individual.setGene(newGenePos, gene2);
                    }
                }
            }
            
            // Add individual to population
            if(new Allocation(individual).isValid())
            	newPopulation.setIndividual(populationIndex, individual);
            else
            	newPopulation.setIndividual(populationIndex, originalIndividual);
        }
        
        // Return mutated population
        return newPopulation;
    }

}

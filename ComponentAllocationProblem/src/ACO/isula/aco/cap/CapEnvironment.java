package ACO.isula.aco.cap;
/* Modified from:
 * Carlos Gavidia-Calderon and César Beltrán Castañon. Isula: A java framework for ant colony algorithms. SoftwareX, 11, 2020
 */

import isula.aco.Environment;
import isula.aco.exception.InvalidInputException;

import java.util.Arrays;
import java.util.logging.Logger;
import allocationProblem.AllocationProblemCon;

/**
 * The Environment type is for storing problem-specific information. 
 */
public class CapEnvironment extends Environment {
	public static AllocationProblemCon con;
    private static Logger logger = Logger.getLogger(CapEnvironment.class.getName());


    public CapEnvironment(double[][] problemGraph) throws InvalidInputException {
        super(problemGraph);

    }


    public static int m;
    public static int n;


    /**
     *
     * @return Pheromone matrix instance.
     */
    @Override
    protected double[][] createPheromoneMatrix() {
        return new double[n][m];
    }
    

	public int allocation[];
	
	public double cost() {
		return con.cost(allocation);
	}
	
	
	
	public boolean isValid() {
		if(allocation==null) return true;
		return con.isValid(allocation);
	}
	
	
}

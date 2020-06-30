package ACO.cap.isula.sample;
/* Modified from:
 * Carlos Gavidia-Calderon and César Beltrán Castañon. Isula: A java framework for ant colony algorithms. SoftwareX, 11, 2020
 */

import isula.aco.ConfigurationProvider;
import ACO.isula.aco.cap.AntForCap;
import ACO.isula.aco.cap.CapEnvironment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * This class contains the algorithm configuration of the Ant System algorithm described in
 * Section 6.3 of the Clever Algorithms book by Jason Brownlee.
 */
public class CapProblemConfiguration implements ConfigurationProvider {

    private double initialPheromoneValue;

    /**
     * In the algorithm described in the book, the initial pheromone value was a function of the quality of a
     * random solution. That logic is included in this constructor.
     */
    public CapProblemConfiguration(CapEnvironment environment) {
        List<Integer> randomSolution = new ArrayList<>();
        int numberOfCities = environment.n;

        for (int cityIndex = 0; cityIndex < numberOfCities; cityIndex += 1) {
            randomSolution.add(new Random().nextInt(environment.m));
        }

        

        double randomQuality = AntForCap.getTotalDistance(
                randomSolution.toArray(new Integer[randomSolution.size()]),
                environment);
        this.initialPheromoneValue =  randomQuality/numberOfCities;
    }

    public int getNumberOfAnts() {
        return 2000;
    }

    public double getEvaporationRatio() {
        return 0.4;
    }

    public int getNumberOfIterations() {
        return 50;
    }


    public double getInitialPheromoneValue() {
        return this.initialPheromoneValue;
    }

    @Override
    public double getHeuristicImportance() {
        return 1;
    }

    @Override
    public double getPheromoneImportance() {
        return 1;
    }
    

}

package ACO.cap.isula.sample;
/* Modified from:
 * Carlos Gavidia-Calderon and César Beltrán Castañon. Isula: A java framework for ant colony algorithms. SoftwareX, 11, 2020
 */

import isula.aco.*;
import isula.aco.algorithms.antsystem.OfflinePheromoneUpdate;
import isula.aco.algorithms.antsystem.PerformEvaporation;
import isula.aco.algorithms.antsystem.RandomNodeSelection;
import isula.aco.algorithms.antsystem.StartPheromoneMatrix;
import ACO.isula.aco.cap.AntForCap;
import ACO.isula.aco.cap.CapEnvironment;
import isula.aco.exception.InvalidInputException;

import javax.naming.ConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import java.util.Scanner;
import allocationProblem.AllocationProblemCon;

public class AcoCapWithIsula {

    private static Logger logger = Logger.getLogger(AcoCapWithIsula.class.getName());
    
    public static double solveAllocationProblem(AllocationProblemCon conf) throws IOException, InvalidInputException, ConfigurationException {
    	logger.info("ANT SYSTEM FOR THE Component Allocation Problem");
    	CapEnvironment.con = conf;
    	CapEnvironment.m = conf.m;
    	CapEnvironment.n = conf.n;
       
        double[][] problemRepresentation = null;
        
        
        CapEnvironment environment = new CapEnvironment(problemRepresentation);
        
        CapProblemConfiguration configurationProvider = new CapProblemConfiguration(environment);
        
        AntColony<Integer, CapEnvironment> colony = getAntColony(configurationProvider);
        

        AcoProblemSolver<Integer, CapEnvironment> solver = new AcoProblemSolver<>();
        
        solver.initialize(environment, colony, configurationProvider);
        solver.addDaemonActions(new StartPheromoneMatrix<Integer, CapEnvironment>(),
                new PerformEvaporation<Integer, CapEnvironment>());

        solver.addDaemonActions(getPheromoneUpdatePolicy());

        solver.getAntColony().addAntPolicies(new RandomNodeSelection<Integer, CapEnvironment>());
       
        solver.solveProblem();
        String bestSolution = solver.getBestSolutionAsString();
        int[] bestS = new int[environment.n];
        Scanner s = new Scanner(bestSolution);
        int i=0;
        while(s.hasNext()) {
        	bestS[i]=s.nextInt();
        	i++;
        }
        CapEnvironment e2 = new CapEnvironment(null);
        e2.allocation=bestS;
        return e2.cost();
        

    }
    
    /**
     * Produces an Ant Colony instance.
     *
     * @param configurationProvider Algorithm configuration.
     * @return Ant Colony instance.
     */
    public static AntColony<Integer, CapEnvironment> getAntColony(final ConfigurationProvider configurationProvider) {
        return new AntColony<Integer, CapEnvironment>(configurationProvider.getNumberOfAnts()) {
            @Override
            protected Ant<Integer, CapEnvironment> createAnt(CapEnvironment environment) {
                int initialReference = 0;
                return new AntForCap(environment.n);
            }
        };
    }

    /**
     * @return A daemon action that implements this procedure.
     */
    private static DaemonAction<Integer, CapEnvironment> getPheromoneUpdatePolicy() {
        return new OfflinePheromoneUpdate<Integer, CapEnvironment>() {
            @Override
            protected double getPheromoneDeposit(Ant<Integer, CapEnvironment> ant,
                                                 Integer positionInSolution,
                                                 Integer solutionComponent,
                                                 CapEnvironment environment,
                                                 ConfigurationProvider configurationProvider) {
                Double contribution = 1 / ant.getSolutionCost(environment);
                return contribution;
            }
        };
    }

    public static double[][] getRepresentationFromFile(String fileName) throws IOException {
        List<Double> xCoordinates = new ArrayList<>();
        List<Double> yCoordinates = new ArrayList<>();
        File file = new File(AcoCapWithIsula.class.getClassLoader().getResource(fileName).getFile());
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");

                if (tokens.length == 3) {
                    xCoordinates.add(Double.parseDouble(tokens[1]));
                    yCoordinates.add(Double.parseDouble(tokens[2]));
                }
            }
        }

        double[][] representation = new double[xCoordinates.size()][2];
        for (int index = 0; index < xCoordinates.size(); index += 1) {
            representation[index][0] = xCoordinates.get(index);
            representation[index][1] = yCoordinates.get(index);

        }

        return representation;
    }


}

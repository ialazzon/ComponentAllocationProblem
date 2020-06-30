/*********************************************************************
* Copyright (c) 2008 The University of York.
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
**********************************************************************/
import componentAllocation.*;
import componentAllocation.impl.*;
import componentAllocation.util.*;



import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GA.*;
import GA.Individual;
import allocationProblem.*;
import ACO.cap.isula.sample.AcoCapWithIsula;

public class MainSolveAllocationProblem  {
	
	
	public static void main(String[] args) throws Exception {
			(new MainSolveAllocationProblem()).run();
	
	}
	
	AllocationProblem ap;
	
	static int m;// number of computational units
	static int n;// number of components
	
	double R[][];
	
	double Tcpu[][];
			        
			     
	
	double Tmemory[][];
			        
	
	double Tpower[][];
	
	double F[];
	
	int allocation[];

	public void run() throws Exception {
		String root = "C:/Users/issam/Desktop/eclipse/workspace/ComponentAllocationProblem/";
		
		// Load the model using EMF
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(ComponentAllocationPackage.eNS_URI, ComponentAllocationPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI(root + "System0.model"));
		resource.load(new HashMap<Object, Object>());
		// Get hold of the root library object
		ap = (AllocationProblem) resource.getContents().get(0);
		
		
		
		n = ap.getComponents().size();
		m = ap.getCompUnits().size();
		
		/* F */
		F = new double[3];
		F[0] = ap.getTradeOffvector().getCpuFactor();
		F[1] = ap.getTradeOffvector().getMemoryFactor();
		F[2] = ap.getTradeOffvector().getPowerFactor();
		
		
		/* R */
		R = new double[m][3];
		int i = 0;
		for(CompUnit cu: ap.getCompUnits()) {
			R[i][0] = cu.getCpuAvail();
			R[i][1] = cu.getMemAvailable();
			R[i][2] = cu.getPowerAvail();
			i++;
		}
		
		
		/* CPU array */
		Tcpu = new double[n][m];
		int j =0 ;
		for(i=0; i< n; i++)
			for(j=0; j<m; j++)
				Tcpu[i][j] = getCPUConsumption(ap.getComponents().get(i),ap.getCompUnits().get(j) );
		
		
		/* Memory array */
		Tmemory = new double[n][m];
		j =0 ;
		for(i=0; i< n; i++)
			for(j=0; j<m; j++)
				Tmemory[i][j] = getMemoryConsumption(ap.getComponents().get(i),ap.getCompUnits().get(j) );
		
		
		/* Power array */
		Tpower = new double[n][m];
		j =0 ;
		for(i=0; i< n; i++)
			for(j=0; j<m; j++)
				Tpower[i][j] = getPowerConsumption(ap.getComponents().get(i),ap.getCompUnits().get(j) );

		resource.save(null);
		
		AllocationProblemCon capCon = new AllocationProblemCon(m,n, R, Tcpu, Tmemory, Tpower, F, ap.getAllocationConstraints(), ap.getAntiAllocationConstraints());
		System.out.println(AP.solveAllocationProblem(capCon) );
		//System.out.println(AcoCapWithIsula.solveAllocationProblem(capCon));
		System.out.println("Done.");
	}
	
	public double getCPUConsumption(Component c, CompUnit cu) {
		List<ResConsumption> rcl = c.getResConsumptions();
		for(ResConsumption rc: rcl)
			if(rc.getCompUnit().getCompUnitName().equals(cu.getCompUnitName()))
				return rc.getCpuCons();
		return 0.0;	
	}
	
	public double getMemoryConsumption(Component c, CompUnit cu) {
		List<ResConsumption> rcl = c.getResConsumptions();
		for(ResConsumption rc: rcl)
			if(rc.getCompUnit().getCompUnitName().equals(cu.getCompUnitName()))
				return rc.getMemoryCons();
		return 0.0;
		
	}
	
	public double getPowerConsumption(Component c, CompUnit cu) {
		List<ResConsumption> rcl = c.getResConsumptions();
		for(ResConsumption rc: rcl)
			if(rc.getCompUnit().getCompUnitName().equals(cu.getCompUnitName()))
				return rc.getPowerCons();
		return 0.0;
		
	}
	
}

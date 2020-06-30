package allocationProblem;
import java.util.Arrays;

import org.eclipse.emf.common.util.EList;

import componentAllocation.AllocationConstraint;
import componentAllocation.AntiAllocationConstraint;

public class AllocationProblemCon {
	public final int m;// number of computational units
	public final int n;// number of components
	
	public double R[][];
	
	public double Tcpu[][];
			        
			     
	
	public double Tmemory[][];
			        
	
	public double Tpower[][];
	
	public double F[];
	
	private EList<AllocationConstraint> acs;
	private EList<AntiAllocationConstraint> antics;
	
	public AllocationProblemCon(int m, int n, double R[][], double Tcpu[][], double Tmemory[][], double Tpower[][], double F[], EList<AllocationConstraint> acs, EList<AntiAllocationConstraint> antics) {
		this.m = m;
		this.n = n;
		this.R = R;
		this.Tcpu = Tcpu;
		this.Tmemory = Tmemory;
		this.Tpower = Tpower;
		this.F = F;	
		this.acs = acs;
		this.antics = antics;
	}
	

	// returns whether the allocation is valid (feasible) or not
	public boolean isValid(int allocation[]) {
		/* check allocation and anti-allocation constraints */
		for(AllocationConstraint ac:acs)
			if(allocation.length>= Integer.valueOf(ac.getComponent().getCompName()) +1 && allocation[Integer.valueOf(ac.getComponent().getCompName())] != Integer.valueOf(ac.getCompUnit().getCompUnitName())) return false;
		
		for(AntiAllocationConstraint ac:antics)
			if(allocation.length>= Integer.valueOf(ac.getComponent().getCompName()) +1 && allocation[Integer.valueOf(ac.getComponent().getCompName())] == Integer.valueOf(ac.getCompUnit().getCompUnitName())) return false;
		
		for(int i= 0; i<allocation.length; i++) if(allocation[i]<0 || allocation[i]>=m) return false;
		
		/* check resource capacity constraints */
		for(int compUnit= 0; compUnit <m; compUnit++)
			if(!checkCPU(allocation, compUnit) || !checkMemory(allocation, compUnit) || !checkPower(allocation, compUnit)) return false;
		
		return true;
				
	}
	
	private boolean checkCPU(int allocation[], int compUnit) {
		double capacity = R[compUnit][0];
		
		double tc = 0.0;
		
		for(int comp=0; comp < allocation.length; comp ++)
			if(allocation[comp]==compUnit)tc += Tcpu[comp][allocation[comp]];
		
		if(tc > capacity) return false;
		else return true;
	}
	
	private boolean checkMemory(int allocation[], int compUnit) {
		double capacity = R[compUnit][1];
		
		double tc = 0.0;
		
		for(int comp=0; comp < allocation.length; comp ++)
			if(allocation[comp]==compUnit) tc += Tmemory[comp][allocation[comp]];
		
		if(tc > capacity) return false;
		else return true;
	}
	
	private boolean checkPower(int allocation[], int compUnit) {
		double capacity = R[compUnit][2];
		
		double tc = 0.0;
		
		for(int comp=0; comp < allocation.length; comp ++)
			if(allocation[comp]==compUnit) tc += Tpower[comp][allocation[comp]];
		
		if(tc > capacity) return false;
		else return true;
	}
	
	//returns the cost of the allocation
	public double cost(int allocation[]) {
		double cpuc=0.0, memoryc=0.0, powerc=0.0;
		for(int compUnit= 0; compUnit <m; compUnit++) {
			cpuc += consumedCPU(allocation, compUnit);
			memoryc += consumedMemory(allocation, compUnit);
			powerc += consumedPower(allocation, compUnit);
		}
		
		return cpuc*F[0] + 	memoryc*F[1] + powerc*F[2];
	}
	
	/* check resource capacity constraints */
	double cpuc=0.0, memoryc=0.0, powerc=0.0;
	
	private double consumedCPU(int allocation[], int compUnit) {
		if(allocation==null) return 0.0;
		double tc = 0.0;
		
		for(int comp=0; comp < allocation.length; comp ++)
			if(allocation[comp]==compUnit) tc += Tcpu[comp][allocation[comp]];
		
		return tc;
	}
	
	private double consumedMemory(int allocation[], int compUnit) {
		if(allocation==null) return 0.0;
		
		double tc = 0.0;
		
		for(int comp=0; comp < allocation.length; comp ++)
			if(allocation[comp]==compUnit) tc += Tmemory[comp][allocation[comp]];
		
		return tc;
	}
	
	private double consumedPower(int allocation[], int compUnit) {
		
		if(allocation==null) return 0.0;
		double tc = 0.0;
		
		for(int comp=0; comp < allocation.length; comp ++)
			if(allocation[comp]==compUnit) tc += Tpower[comp][allocation[comp]];
		
		return tc;

	}
	

}
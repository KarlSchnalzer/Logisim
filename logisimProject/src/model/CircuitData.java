package model;

import java.util.HashMap;
/**
 * 
 * @author Karl Schnalzer
 * Class CircuitData is a java class which keeps track of all circuit 
 * data(connections, input/ outputs, etc.)
 */
public class CircuitData {
	private HashMap<Integer,LogicGate> logicGates;
	private int id;
	
	public CircuitData(){
		logicGates = new HashMap<Integer, LogicGate>();
		id = 1;
	}
	/**
	 * Adds the type of logic gate to the "Gates map"
	 * @param lg - the logic gate being added to the map
	 */
	public void addGate(LogicGate lg){
		logicGates.put(id,lg);
		id++;
	}
}

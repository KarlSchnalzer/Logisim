package model;

import java.util.HashMap;

public class CircuitData {
	private HashMap<Integer,LogicGate> logicGates;
	private int id;
	
	public CircuitData(){
		logicGates = new HashMap<Integer, LogicGate>();
		id = 1;
	}
	
	public void addGate(LogicGate lg){
		logicGates.put(id,lg);
		id++;
	}
}

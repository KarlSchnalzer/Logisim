package model;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author Karl Schnalzer
 * Class CircuitData is a java class which keeps track of all circuit 
 * data(connections, input/ outputs, etc.)
 */
public class CircuitData {
	private HashMap<Integer,LogicGate> logicGates;
	private int id;
	private static Socket socket;
	
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
	
	public int getGateOutput(int id){
		for(int key: logicGates.keySet()){
			if(key==id){
				return logicGates.get(key).getOutput();
			}
		}
		return 0;
	}
	
	public void setInputs(int id, int i1, int i2){
		for(int key: logicGates.keySet()){
			if(key==id){
				logicGates.get(key).setInput1(i1);
				logicGates.get(key).setInput2(i2);
			}
		}
	}
	
	 
}

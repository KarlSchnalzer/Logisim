package model;

/**
 * 
 * @author Karl Schnalzer
 * Class AndGate is a subclass of LogicGate representing an OR logic gate
 */
public class OrGate extends LogicGate{
	/**
	 * Constructor for an OR gate
	 * @param i1 - the value of the first input
	 * @param i2 - the value of the second input
	 * @param xc - the x-coordinate of the gate
	 * @param yc - the y-coordinate of the gate
	 */
	public OrGate(int i1, int i2, int xc, int yc){
		super(i1,i2,xc,yc);
	}
	
	/**
	 * Default constructor for an OR gate
	 */
	public OrGate(){
		this(1,1,1,1);
	}
	
	/**
	 * Computes the output of the OR gate using boolean logic for the inputs
	 * @return - the output of the gate
	 */
	public int getOutput(){
		if(getInput1()==1 || getInput2()==1){
			return 1;
		}
		else{
			return 0;
		}
		
	}
}

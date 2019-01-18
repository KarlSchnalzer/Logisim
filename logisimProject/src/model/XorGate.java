package model;
/**
 * 
 * @author Karl Schnalzer
 * Class AndGate is a subclass of LogicGate representing an XOR logic gate
 */
public class XorGate extends LogicGate{
	private int input1; // the first input of the gate
	private int input2; // the second input of the gate
	private int x; // the x-coordinate of the gate on the circuit canvas
	private int y; // the y-coordinate of the gate on the circuit canvas
	
	/**
	 * Constructor for an XOR gate
	 * @param i1 - the value of the first input
	 * @param i2 - the value of the second input
	 * @param xc - the x-coordinate of the gate
	 * @param yc - the y-coordinate of the gate
	 */
	public XorGate(int i1, int i2, int xc, int yc){
		super(i1,i2,xc,yc);
	}
	
	/**
	 * Default constructor for an XOR gate
	 */
	public XorGate(){
		super(0,0,1,1);
	}
	
	/**
	 * Computes the output of the XOR gate using boolean logic for the inputs
	 * @return - the output of the gate
	 */
	public int getOutput(){
		if(input1!=input2){
			return 1;
		}
		else{
			return 0;
		}
		
	}
}

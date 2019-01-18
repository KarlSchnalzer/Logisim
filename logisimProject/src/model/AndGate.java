package model;
/**
 * 
 * @author Karl Schnalzer
 * Class AndGate is a subclass of LogicGate representing an AND logic gate
 */
public class AndGate extends LogicGate{

	/**
	 * Constructor for a gate
	 * @param i1 - the value of the first input
	 * @param i2 - the value of the second input
	 * @param xc - the x-coordinate of the gate
	 * @param yc - the y-coordinate of the gate
	 */
	public AndGate(int i1, int i2, int xc, int yc){
		super(i1,i2,xc,yc);
	}
	
	/**
	 * Default constructor for an AND gate
	 */
	public AndGate(){
		this(1,1,1,1);
	}
	
	/**
	 * Computes the output of the AND gate using boolean logic for the inputs
	 * @return - the output of the gate
	 */
	public int getOutput(){
		if(getInput1()==1 && getInput2()==1){
			return 1;
		}
		else{
			return 0;
		}	
	}
	
	public static void main(String[] args){
		AndGate ng = new AndGate(1,0,1,1);
		System.out.println("The input1 is " + ng.getInput1());
		System.out.println("The input2 is " + ng.getInput2());
		System.out.println("The x-coord is " + ng.getX());
		System.out.println("The y-coord is " + ng.getY());
		System.out.println("The output is " + ng.getOutput());
	}
}

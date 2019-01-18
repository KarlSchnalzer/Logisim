package model;
/**
 * 
 * @author Karl Schnalzer
 * Class AndGate is a subclass of LogicGate representing an AND logic gate
 */
public class AndGate extends LogicGate{
	private int input1; // the first input of the gate
	private int input2; // the second input of the gate
	private int x; // the x-coordinate of the gate on the circuit canvas
	private int y; // the y-coordinate of the gate on the circuit canvas
	
	/**
	 * Constructor for a gate
	 * @param i1 - the value of the first input
	 * @param i2 - the value of the second input
	 * @param xc - the x-coordinate of the gate
	 * @param yc - the y-coordinate of the gate
	 */
	public AndGate(int i1, int i2, int xc, int yc){
		//super(i1,i2,xc,yc);
		if((i1==1 || i1==0) && (i2==1 || i2==0)){ //checks to see if inputs are valid (0 or 1)
			input1  = i1;
			input2 = i2;
		}else{
			input1=1; //if inputs are invalid, sets each input to a default value of 0
			input2=0;
		}
		x = xc;
		y = yc;
	}
	
	/**
	 * Default constructor for an AND gate
	 */
	public AndGate(){
//		super(1,1,1,1);
		this(1,1,1,1);
	}
	
	/**
	 * Computes the output of the AND gate using boolean logic for the inputs
	 * @return - the output of the gate
	 */
	public int getOutput(){
		if(input1==1 && input2==1){
			return 1;
		}
		else{
			return 0;
		}	
	}
	public static void main(String[] args){
		AndGate ng = new AndGate(1,1,1,1);
		System.out.println("The input1 is " + ng.getInput1());
		System.out.println("The input2 is " + ng.getInput2());
		System.out.println("The x-coord is " + ng.getX());
		System.out.println("The y-coord is " + ng.getY());
		System.out.println("The output is " + ng.getOutput());
	}
}

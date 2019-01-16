package model;
/**
 * 
 * @author Karl Schnalzer
 * Java class representing an AND logic gate
 */
public class AndGate {
	private int input1; // the first input of the AND gate
	private int input2; // the second input of the AND gate
	private int x; // the x-coordinate of the AND gate on the circuit canvas
	private int y; // the y-coordinate of the AND gate on the circuit canvas
	
	/**
	 * Constructor for an AND gate
	 * @param i1 - the value of the first input
	 * @param i2 - the value of the second input
	 * @param xc - the x-coordinate of the gate
	 * @param yc - the y-coordinate of the gate
	 */
	public AndGate(int i1, int i2, int xc, int yc){
		if((i1==1 || i1==0) && (i2==1 || i2==0)){ //checks to see if inputs are valid (0 or 1)
			input1  = i1;
			input2 = i2;
		}else{
			input1=0; //if inputs are invalid, sets each input to a default value of 0
			input2=0;
		}
		x = xc;
		y = yc;
	}
	
	/**
	 * Default constructor for an AND gate
	 */
	public AndGate(){
		this(0,0,1,1);
	}
	
	/**
	 * sets the x-coordinate of the gate
	 * @param xc - the x-coordinate the user wishes to set
	 */
	public void setX(int xc){
		x = xc;
	}
	
	/**
	 * sets the y-coordinate of the gate
	 * @param yc - the y-coordinate the user wishes to set
	 */
	public void setY(int yc){
		y = yc;
	}
	
	/**
	 * sets the first input of the AND gate
	 * @param i1 - the value the user wishes to set the input to
	 */
	public void setInput1(int i1){
		input1 = i1;
	}
	
	/**
	 * sets the second input of the AND gate
	 * @param i2 - the value the user wishes to set the input to
	 */
	public void setInput2(int i2){
		input2 = i2;
	}
	
	/**
	 * 
	 * @return - the x-coordinate of the gate
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * @return - the y-coordinate of the gate
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * @return - the first input of the gate
	 */
	public int getInput1(){
		return input1;
	}
	
	/**
	 * @return - the second input of the gate
	 */
	public int getInput2(){
		return input2;
	}
	
	/**
	 * Computes the output of the AND gate using boolean logic for the inputs
	 * @return - the output of the gate
	 */
	public int getOutput(){
		if((input1==input2) && input1==1){
			return 1;
		}
		else{
			return 0;
		}
		
	}
}

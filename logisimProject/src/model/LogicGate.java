package model;
/**
 * 
 * @author Karl Schnalzer
 * Class LogicGate is superclass representing a logic gate with two inputs
 */
public class LogicGate {
	private int input1; // the first input of the gate
	private int input2; // the second input of the gate
	private int x; // the x-coordinate of the gate on the circuit canvas
	private int y; // the y-coordinate of the gate on the circuit canvas
	
	/**
	 * Constructor for a logic gate
	 * @param i1 - the value of the first input
	 * @param i2 - the value of the second input
	 * @param xc - the x-coordinate of the gate
	 * @param yc - the y-coordinate of the gate
	 */
	public LogicGate(int i1, int i2, int xc, int yc){
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
	 * Default constructor for a Logic gate
	 */
	public LogicGate(){
		this(1,0,1,1);
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
}



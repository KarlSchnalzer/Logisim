package model;
/**
 * 
 * @author Karl Schnalzer
 * Class NotGate is a class representing an NOT logic gate
 */
public class NotGate{
	private int input; // the input of the gate
	private int x; // the x-coordinate of the gate on the circuit canvas
	private int y; // the y-coordinate of the gate on the circuit canvas
	
	/**
	 * Constructor for a NOT gate
	 * @param i1 - the value of the input
	 * @param xc - the x-coordinate of the gate
	 * @param yc - the y-coordinate of the gate
	 */
	public NotGate(int i, int xc, int yc){
		if(i==1 || i==0){ //checks to see if input is valid (0 or 1)
			input  = i; 
		}else{
			input = 0; //if inputs are invalid, sets each input to a default value of 0
		}
		x = xc;
		y = yc;
	}
	
	/**
	 * Default constructor for a NOT gate
	 */
	public NotGate(){
		this(1,1,1);
	}
	
	/**
	 * Computes the output of the NOT gate using boolean logic for the inputs
	 * @return - the output of the gate
	 */
	public int getOutput(){
		return Math.abs(input-1);
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
	 * sets the input of the NOT gate
	 * @param i1 - the value the user wishes to set the input to
	 */
	public void setInput(int i){
		input = i;
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
	 * @return - the input of the gate
	 */
	public int getInput(){
		return input;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		NotGate ng = new NotGate(1,1,1);
		System.out.println("The input is " + ng.getInput());
		System.out.println("The x-coord is " + ng.getX());
		System.out.println("The y-coord is " + ng.getY());
		System.out.println("The output is " + ng.getOutput());
	}
}

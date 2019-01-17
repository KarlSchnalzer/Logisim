package model;
/**
 * 
 * @author Karl Schnalzer
 * Class AndGate is a subclass of LogicGate representing an AND logic gate
 */
public class AndGate extends LogicGate {
	
	public AndGate(int i1, int i2, int xc, int yc){
		super(i1,i2,xc,yc);
	}
	
	/**
	 * Default constructor for an AND gate
	 */
	public AndGate(){
		super(0,0,1,1);
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

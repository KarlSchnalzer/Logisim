package model;

public class AndGate {
	private int input1;
	private int input2;
	private int x;
	private int y;
	
	public AndGate(int i1, int i2, int xc, int yc){
		if((i1==1 || i1==0) && (i2==1 || i2==0)){
			input1  = i1;
			input2 = i2;
		}
		x = xc;
		y = yc;
	}
	
	public AndGate(){
		this(0,0,1,1);
	}
	
	public void setX(int xc){
		x = xc;
	}
	
	public void setY(int yc){
		y = yc;
	}
	
	public void setInput1(int i1){
		input1 = i1;
	}

	public void setInput2(int i2){
		input2 = i2;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getInput1(){
		return input1;
	}
	
	public int getInput2(){
		return input2;
	}
	
	public int getOutput(){
		if((input1==input2) && input1==1){
			return 1;
		}
		else{
			return 0;
		}
		
	}
}

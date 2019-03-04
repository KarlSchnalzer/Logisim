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
	
	public void setInput1(int id, int i1){
		for(int key: logicGates.keySet()){
			if(key==id){
				logicGates.get(key).setInput1(i1);
			}
		}
	}
	public void setInput2(int id, int i2){
		for(int key: logicGates.keySet()){
			if(key==id){
				logicGates.get(key).setInput2(i2);
			}
		}
	}
	
	public static void main(String[] args){
		try
        {
 
            int port = 25000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started and listening to the port 25000");
 
            //Server is running always. This is done using this while(true) loop
            while(true)
            {
                //Reading the message from the client
                socket = serverSocket.accept();
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String msg = br.readLine();
                System.out.println("Message received from client is "+msg);
 
               if(msg.equals(arg0)){
            	   
               }
                String returnMessage;
                try
                {
                   
                }
                catch(NumberFormatException e)
                {
                    //Input was not correct message. Sending proper message back to client.
                    returnMessage = "Please send a proper message\n";
                }
 
                //Sending the response back to the client.
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(returnMessage);
                System.out.println("Message sent to the client is "+returnMessage);
                bw.flush();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e){}
        }
    }
	}
}

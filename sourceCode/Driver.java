
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class Driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
    	/* Activate the network */
    	Network objNetwork = new Network("network");            
        objNetwork.start();
        
        //Starting the server
        Server objServer = new Server();        
        objServer.start();
        
        //Starting the sending Client
        Client objClientSender = new Client("sending");
        objClientSender.start();
        
        //Starting the receiving Client
        Client objClientReceiver = new Client("receiving");
        objClientReceiver.start();
    }
}

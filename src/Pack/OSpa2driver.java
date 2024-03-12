package Pack;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerly Titus
 */
public class OSpa2driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Network networkThread = new Network();            /* Activate the network */
        networkThread.start();
        Client sendingClientThread = new Client("sending");
        sendingClientThread.start();
        Client receivingClientThread = new Client("receiving");
        receivingClientThread.start();
        Server serverThread1 = new Server("serverThread1");
        Server serverThread2 = new Server("serverThread2");
        Server serverThread3 = new Server("serverThread3");
        serverThread1.start();
        serverThread2.start();
        serverThread3.start();
        

       
    }
    
 }

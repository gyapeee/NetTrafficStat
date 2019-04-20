/**
 * 
 */
package com.github.gyapeee;

import java.io.IOException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.util.NifSelector;
/**
 * @author gyape
 *
 */
public class NetTrafficStatApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is the Entry point of the Application
		
/* Some example code from DevDungeon tutorial 
 * to be sure that the Pcap4J integrated successfully:
 * https://www.devdungeon.com/content/packet-capturing-java-pcap4j
 * */
		
        // The class that will store the network device
        // we want to use for capturing.
        PcapNetworkInterface device = null;

        // Pcap4j comes with a convenient method for listing
        // and choosing a network interface from the terminal
        try {
            // List the network devices available with a prompt
            device = new NifSelector().selectNetworkInterface();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("You chose: " + device);
/*
 * End of the DevDungeon example
 * */        

	}

}

/**
 * 
 */
package com.github.gyapeee;

/*
 * Importing stuffs for DevDunegonExample
 * */
import java.io.IOException;
import java.util.List;

import org.omg.CORBA.portable.ApplicationException;
import org.pcap4j.core.PcapNativeException;
import org.pcap4j.core.PcapNetworkInterface;
import org.pcap4j.core.Pcaps;
import org.pcap4j.util.NifSelector;

/*
 * Importing stuffs for JavaFX GUI tutorial
 * */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * @author gyape
 *
 */
public class NetTrafficStatApp extends Application{

	private TextArea textArea;
	
	public NetTrafficStatApp() {
        // Pcap4J comes with a convenient method for listing
        // all the available network devices
        try {
            // The list contains all the devices
            List<PcapNetworkInterface> devices = null;
            textArea = new TextArea();
        	
            // List the network devices 
            devices = Pcaps.findAllDevs();
            
            // Print out all about the devices
            System.out.println("These are the devices:" );
            textArea.appendText("These are the devices:\n");
            devices.forEach((device) -> {
            	System.out.println(device.getDescription());
            	
                // Adding devices to the TextArea
                textArea.appendText(device.getDescription() + "\n");
            });
        } catch (PcapNativeException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("NetTrafficStat");
		
		
		StackPane layout = new StackPane();
		layout.getChildren().add(textArea);
		
		
		Scene scene = new Scene(layout,640,480);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is the Entry point of the Application
		launch(args);
	}

}

package br.com.devcoffee.test;

import java.util.Scanner;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class TestingJssc {
	
	public static void main(String []args) {
		//Serial port configuration variables
		String comPort = "/dev/pts/0";
		int baudeRate = 9600;
		int dataBits = 8;
		int stopBits = 1;
		int parity = 0;
		
		Scanner scanner = new Scanner(System.in); //Scanner to get info from the user
		
		//Getting all serial port names available on device
		System.out.println("Listening all com ports available on device");
		String[] portNames = SerialPortList.getPortNames();
		for (int i = 0; i > portNames.length; i++) {
			System.out.println(portNames[i]);
		}
		
		System.out.println(System.getProperty("line.separator")); //Create a separator for the current OS
/*		
		//Getting Serial port configuration
		System.out.println("Type com port: ");
		comPort = scanner.nextLine(); 
		System.out.println("Type baude rate: ");
		baudeRate = Integer.parseInt(scanner.nextLine());
		System.out.println("Type data bits: ");
		dataBits = Integer.parseInt(scanner.nextLine());
		System.out.println("Type stop bits: ");
		stopBits = Integer.parseInt(scanner.nextLine());
		System.out.println("Type parity: ");
		parity = Integer.parseInt(scanner.nextLine());*/
		//Trying to build connection
		SerialPort serialPort = new SerialPort(comPort);
		try {
			serialPort.openPort();//open serial port
			System.out.println("Connection successfully");
			serialPort.setParams(baudeRate, dataBits, stopBits, parity);
			String entrada = "";
			while (!entrada.equals("exit")){
				entrada = serialPort.readString();
				if (entrada != null)
					System.out.println(entrada);
				else
					entrada = "";
			}
			serialPort.closePort();
		} catch (SerialPortException e) {
			System.out.println("Connection failure, follow the errors below: ");
			e.printStackTrace();
		}	
	}
}

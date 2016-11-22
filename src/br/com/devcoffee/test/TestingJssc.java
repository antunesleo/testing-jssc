package br.com.devcoffee.test;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class TestingJssc {
		
	public static void main(String []args) {
		//Getting all serial port names
		String[] portNames = SerialPortList.getPortNames();
		for (int i = 0; i > portNames.length; i++) {
			System.out.println(portNames[i]);
		}
		
		//Reading data from serial port 
		SerialPort serialPort = new SerialPort("COM1");
		try {
			serialPort.openPort();//open serial port
			serialPort.setParams(9600, 8, 1, 0);
			byte[] buffer = serialPort.readBytes(10);
			serialPort.closePort();
		} catch (SerialPortException e) {
			e.printStackTrace();
		}	
	}
}

Welcome to Testing JSSC!
===================

This is a simple jar file to test connectivity and read functions on the JSSC project. Testing JSSC allows you to do it!



**Using T-JSSC**
------------

 - Download the testing-jssc.jar file inside generated-jar folder in 
 - This repository  Open the terminal in the same folder of the jar 
 - File  Run the command: 
 

    $  java -jar testing-jssc.jar
    

The software will make 5 simple questions about the serial connection, hold the following informations with you: Com port name, Baude rate, Data bits, Stop bits, Parity. See the example below:


    leo@antunes:~/workspace/testing-jssc/generated-jar$ java -jar testing-jssc.jar 
    Listening all com ports available on device
    
    
    Type com port: 
    /dev/pts/10
    Type baude rate: 
    9600
    Type data bits: 
    8
    Type stop bits: 
    1
    Type parity: 
    0
    Connection successfully
    
    
    Waiting data on the serial port informed
    I'm a serial device sending information



**License**
-------
Use this repo as you wish, it's completely free!

package RMIClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmiService.IConversion;

public class ConversionClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		IConversion stub=(IConversion)Naming.lookup("rmi://localhost:1099/objetdistant");
		System.out.println(stub.conversion(700.00));
		
		

	}

}

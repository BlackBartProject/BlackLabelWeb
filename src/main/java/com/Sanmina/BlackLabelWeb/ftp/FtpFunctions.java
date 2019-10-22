package com.Sanmina.BlackLabelWeb.ftp;


import java.io.File;
import java.io.IOException;

import com.Sanmina.BlackLabelWeb.ftp.FtpConnection;

public class FtpFunctions extends FtpConnection {

	public FtpFunctions(String server, String user, String password, String path) {
		super(server, user, password, path);
		
	}

	
	
	
	
	
	
	
	
	
	
	public void downloadSpecFile(){
		connectionFtp();	
		
		
		try {
		
		ftpUtils.printWorkingDirectory();
		ftpFile=ftpUtils.listFiles();
		
		for(int i=0;i<ftpFile.length;i++){
		System.out.println("lista: "+ftpFile[i].getName());	}	
		
		
		
		
		} 
		
		
		
		
		
		
		
		
		catch(IOException ex){
			ex.printStackTrace();}
		
		catch(Exception ex){
			ex.printStackTrace();}
		}
}

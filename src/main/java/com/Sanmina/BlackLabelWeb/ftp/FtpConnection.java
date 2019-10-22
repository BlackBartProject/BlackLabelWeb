package com.Sanmina.BlackLabelWeb.ftp;

import java.io.IOException;
import lombok.*;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class FtpConnection {

	@Setter
	@Getter
	private  String server;  
	@Setter
	@Getter
	private  String user; 
	@Setter
	@Getter
	private  String password; 
	@Setter
	@Getter
	private  String path;  
	
	
	public static FTPClient ftpUtils;
	public FTPFile ftpFile[];

	public FtpConnection(String server, String user, String password, String path) {
		this.server = server;
		this.user = user;
		this.password = password;
		this.path = path;
	}
	
	
	
	
	public boolean connectionFtp(){
		
		try {
			
		ftpUtils=new FTPClient();	
		ftpUtils.connect(getServer());
		ftpUtils.login(getUser(), getPassword());	
		
		return ftpUtils.isConnected();}
		
		catch(IOException ex){
		ex.printStackTrace();
		return ftpUtils.isConnected();}
		
		catch(Exception ex){
		ex.printStackTrace();
		return ftpUtils.isConnected();}
	
	}
	
	
	
	
	
	
	
}

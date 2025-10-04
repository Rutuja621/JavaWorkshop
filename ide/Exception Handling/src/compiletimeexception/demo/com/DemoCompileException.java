package compiletimeexception.demo.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoCompileException {
	public void getFile() throws FileNotFoundException{
		FileInputStream fs=new FileInputStream("");
	}
	
	public void readFile() throws FileNotFoundException{
		getFile();
	}
	
	public void signFile() throws FileNotFoundException{
		readFile();
	}
	
	public void submitFile() {
		try {
			signFile();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled");
		}
	}
	
	public void setFile() {
		submitFile();
	}
	
	public static void main(String[] args) {
		DemoCompileException ds=new DemoCompileException();
		ds.setFile();
	}

}

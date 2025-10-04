package compiletimeexception.demo.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompiletimeExceptionDemo {
	public static void main(String[] args) {
		try {
			FileInputStream st=new FileInputStream("\"C:\\Users\\shris\\Downloads\\organ_tissue.docx\"");
			
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

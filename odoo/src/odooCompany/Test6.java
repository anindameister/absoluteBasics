package odooCompany;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test6 {
	public void downloadingContent() {
		try {
			URL url = new URL ("http://www.sap.com/belgique/index.html");
			InputStream stream = url.openStream();
			BufferedReader input = new BufferedReader (new InputStreamReader(stream));
			File file = new File ("copy.html");
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter output = new BufferedWriter (new FileWriter(file.getAbsoluteFile()));
			String line;
//			replacing SAP by Odoo.
			while ( (line = input.readLine()) != null) {
				output.write(line.replace("SAP", "Odoo"));
			}
			output.close();
		
		
		}catch (MalformedURLException ue) {
			ue.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				URL url = new URL ("http://www.sap.com/belgique/index.html");
				InputStream stream = url.openStream();
				if (stream != null) stream.close();
			}catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		
			
			
	}}
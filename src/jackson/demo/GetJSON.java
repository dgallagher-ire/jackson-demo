package jackson.demo;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class GetJSON {

	public static final String SAMPLE1 = "sample1.json";
	public static final String SAMPLE3 = "sample3.json";
	
	public static final String getJson(final String fileName) {
		try {
			final InputStream inputStream = GetJSON.class.getResourceAsStream(fileName);
			final ByteArrayOutputStream output= new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int length;
			while ((length = inputStream.read(buffer)) != -1) {
				output.write(buffer, 0, length);
			}
			return output.toString("UTF-8");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	
	public static void main(final String[] args){
		System.out.println(getJson(SAMPLE1));
	}

}

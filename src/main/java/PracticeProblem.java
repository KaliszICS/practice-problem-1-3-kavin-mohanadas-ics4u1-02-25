import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {


	}

	public static String readFile(String filename) {
  		FileReader inputStream = null;
  		String result = "";
		try {
			inputStream = new FileReader(filename);
			int c;
			while ((c = inputStream.read()) != -1) {
          result = result + (char)c;
			}
			
		}
			catch (IOException e) {

	  		 System.out.println("Error reading this file");
		}   finally {
			  try {
				if (inputStream != null) {
					inputStream.close();
				}
			}
				catch (IOException e) {
				System.out.println("Error reading this file");

			}
		}
		return result;
	}

	public static String backwardsReadFile(String Filename) {
		String content = readFile(Filename);
		int length = content.length();
		char[] reverse = new char[length];

		for (int i = 0; i < length; i++) {
			reverse[i] = content.charAt(length - 1 - i);
		}
		return new String(reverse);
	}

}

	
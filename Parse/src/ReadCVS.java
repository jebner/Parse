
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadCVS {
 
  public static void main(String[] args) {
 
	ReadCVS obj = new ReadCVS();
	obj.run();
 
  }
 
  public void run() {
 
	String csvFile = "C:/Users/Jasmin/workspace/Parse/population.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
 
	try {
 
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {
 
		        // use comma as separator
			String[] population = line.split(cvsSplitBy);
 
			
			System.out.println("Population [ " + population[0] 
                                 + population[1] + population[2] + population[3] + population[4] + population[5] + population[6] + population[7] + population[8] + population[9] + population[10] + population[11] + population[12] +  "]");
 
		}
 
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
 
	System.out.println("Done");
  }
  
}
 
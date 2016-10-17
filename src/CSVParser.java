
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CSVParser {
	
	public static void main(String[] args){
		
		String csvFile="C:/Users/mshesh/hello-world/Country.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitby=",";
		
		try{

			 br = new BufferedReader(new FileReader(csvFile));
			 while((line=br.readLine()) !=null){
				 
				 String[] country=line.split(cvsSplitby);
				 
				 System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
				 
			 }
			
		   }
		
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		     }
		
		catch (IOException e) {
            e.printStackTrace();
        }
		
		finally{
			if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
		        }
	}

}
}

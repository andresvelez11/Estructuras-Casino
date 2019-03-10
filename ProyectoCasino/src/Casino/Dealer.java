package Casino;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dealer {
	public int CualRonda(String ruta) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		int rondas = 0;

		try {

			archivo = new File (ruta);
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);

			String linea;
			while((linea=br.readLine())!=null)
				rondas=Integer.parseInt(linea.split(" ")[0]);
		}
		catch(IOException e){
			System.out.println(e.getMessage());;
		}finally{

			
			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (IOException e2){ 
				System.out.println(e2.getMessage());
			}
		}
		
		return rondas;
	}
	
	
}

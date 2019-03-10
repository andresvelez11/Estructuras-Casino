import java.io.*;


public class Gerente {
	
	public void leer(String ruta) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			
			archivo = new File (ruta);
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);

			String linea;
			while((linea=br.readLine())!=null)
				System.out.println(linea);
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
	}
}

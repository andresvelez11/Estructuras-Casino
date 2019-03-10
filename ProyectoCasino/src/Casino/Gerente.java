package Casino;

import java.io.*;

public class Gerente {
	
	public static void leer(String ruta) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			
			archivo = new File (ruta);
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			double cantidad2;
			String linea;
			String cantidad="";
			String[] partes;
			int i=0;
			
			while((linea=br.readLine())!=null && i<linea.length()) {
				
				String signo="";
				partes=linea.split(" ");
				if(partes[1].charAt(0)=='-') 
					signo="-";
					
				cantidad=partes[1];
				
				cantidad2=Double.parseDouble(cantidad);
				
				System.out.println(cantidad2);
			}
			
		} catch(IOException e){
			System.out.println("No se pudo leer el archivo");;
		}finally{
			
			try{                    
				fr.close();
				br.close();
			}catch (IOException e2){ 
				System.out.println("No se pudo cerrar el fichero");
			}
		}
	}
}

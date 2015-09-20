package csv.ejemplos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

import dominio.Usuario;

public class EjemploCsvImportacion {

	public static void main(String[] args) {
		
		try {
			
			List<Usuario> usuarios = new ArrayList<Usuario>();
			
			CsvReader usuarios_import = new CsvReader("test/usuarios_import.csv");
			usuarios_import.readHeaders();

			while (usuarios_import.readRecord())
			{
				String codigo = usuarios_import.get(0);
				String nombres = usuarios_import.get(1);
				String apellidos = usuarios_import.get("Apellidos");
				String correo = usuarios_import.get("Correo");
				
				usuarios.add(new Usuario(codigo, nombres, apellidos, correo));				
			}
			
			usuarios_import.close();
			
			for(Usuario us : usuarios){
			
				System.out.println(us.getCodigo() + " : " + us.getNombres() + " " 
					+ us.getApellidos() + " - " + us.getCorreo());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
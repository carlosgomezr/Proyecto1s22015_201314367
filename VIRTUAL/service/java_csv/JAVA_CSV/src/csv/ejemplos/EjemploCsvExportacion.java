package csv.ejemplos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvWriter;

import dominio.Usuario;

public class EjemploCsvExportacion {
   
    public static void main(String[] args) {
    	
    	List<Usuario> usuarios = new ArrayList<Usuario>();
        
        usuarios.add(new Usuario("1001","Jose","Ramirez Torres","jramirez89@hotmail.com"));
        usuarios.add(new Usuario("1002","Saul","Gaviria Garcia","sgaviria12@gmail.com"));
        usuarios.add(new Usuario("1003","Maria","Torres Mendoza","mtorres12@yahoo.com"));
    	
    	String outputFile = "test/usuarios_export.csv";
        boolean alreadyExists = new File(outputFile).exists();
        
        if(alreadyExists){
        	File ficheroUsuarios = new File(outputFile);
        	ficheroUsuarios.delete();
        }        
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Codigo");
            csvOutput.write("Nombres");
            csvOutput.write("Apellidos");
            csvOutput.write("Correo");
            csvOutput.endRecord();

            for(Usuario us : usuarios){
    
            	csvOutput.write(us.getCodigo());
            	csvOutput.write(us.getNombres());
            	csvOutput.write(us.getApellidos());
            	csvOutput.write(us.getCorreo());
            	csvOutput.endRecord();                   
            }
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
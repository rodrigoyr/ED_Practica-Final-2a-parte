package GestionDeArchivos;

import Experimento.Experimento;
import java.io.*;

public class GestorDeArchivos {

    public static void guardarExperimento(Experimento experimento, String rutaArchivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(rutaArchivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(experimento);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Experimento cargarExperimento(String rutaArchivo) {
        Experimento experimento = null;
        try {
            FileInputStream fileIn = new FileInputStream(rutaArchivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            experimento = (Experimento) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Experimento class not found");
            c.printStackTrace();
            return null;
        }
        return experimento;
    }

    // Método adicional para verificar si un archivo existe
    public static boolean archivoExiste(String rutaArchivo) {
        File file = new File(rutaArchivo);
        return file.exists();
    }

    // Método adicional para eliminar un archivo
    public static boolean eliminarArchivo(String rutaArchivo) {
        File file = new File(rutaArchivo);
        return file.delete();
    }
}
package FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Utileria;

import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Modelo.Alumno;

import java.io.*;
import java.util.ArrayList;

public class AlumnosArchivos {
    private String ruta;

    public AlumnosArchivos(String ruta) {
        this.ruta = ruta;
    }

    public void escribir(Alumno alumno) {
        try(
                ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream(this.ruta)
                )
                ) {
            salida.writeObject(alumno);
            System.out.println("Alumno guardado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }

    public Alumno leer() {
        try (
                ObjectInputStream entrada = new ObjectInputStream(
                        new FileInputStream(this.ruta)
                )
        ) {
            Alumno leido = (Alumno) entrada.readObject();
            return leido;

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

        }

        return null;
    }


    public void escribirAlumnos(ArrayList<Alumno> alumnos) {

        try(
                ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream(this.ruta)
                )
        ) {
            salida.writeObject(alumnos);
            System.out.println("Alumno guardado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());

        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }

    public ArrayList<Alumno> leerAlumnos() {

        try (
                ObjectInputStream entrada = new ObjectInputStream(
                        new FileInputStream(this.ruta)
                )
        ) {

            ArrayList<Alumno> alumnos = (ArrayList<Alumno>) entrada.readObject();
            return alumnos;
            //Alumno leido = (Alumno) entrada.readObject();
            //return leido;

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

}

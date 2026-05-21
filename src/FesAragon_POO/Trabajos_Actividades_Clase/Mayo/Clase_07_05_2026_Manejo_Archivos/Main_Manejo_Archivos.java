import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.DemoArchivos.ArchivosManejo;
import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Modelo.Alumno;
import FesAragon_POO.Trabajos_Actividades_Clase.Mayo.Clase_07_05_2026_Manejo_Archivos.Utileria.AlumnosArchivos;

void main() {

    /*
    System.out.println("" + System.getProperty("user.name"));
    System.out.println("" + System.getProperty("java.version"));
    System.out.println("" + System.getProperty("os.version"));
    System.out.println("" + System.getProperty("os.arch"));
    System.out.println("" + System.getProperty("os.name"));
    System.out.println("" + System.getProperty("user.home"));
    System.out.println("" + System.getProperty("user.dir"));

    ArchivosManejo archivo = new  ArchivosManejo("ejemplo.txt");
    String mensaje = """
            Este es el 
            mesnaje a escribir
            en el archivo.
            """;

    archivo.escribir(mensaje);
    System.out.println("------------------------");
    archivo.leer();

    System.out.println("------------------------");
    Alumno al1 = new Alumno("3232068232", "Jose", "Garcia", 8.9);
    System.out.println(al1);

    AlumnosArchivos archivos = new AlumnosArchivos("alumnos.dat");
    //archivos.escribir(al1);
    Alumno leido = archivos.leer();
    System.out.println("Alumno leido desde archivo" + leido);
    */


    ArrayList<Alumno> alumnos = new ArrayList<>();

    alumnos.add(new Alumno("3232068232", "Jose", "Garcia", 8.9));
    alumnos.add(new Alumno("3232068232", "Jose", "Garcia", 8.9));
    alumnos.add(new Alumno("3232068232", "Jose", "Garcia", 8.9));
    alumnos.add(new Alumno("3232068232", "Jose", "Garcia", 8.9));

    AlumnosArchivos archivos2 = new AlumnosArchivos("alumnos.dat");
    archivos2.escribirAlumnos(alumnos);

}

    //Alumno al2 = archivos.leer();
    //System.out.println(al2);


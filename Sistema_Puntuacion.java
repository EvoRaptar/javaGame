

/**
 * DESCRIPCION.
 * Juego de Indiana Jones, en este fichero se guarda el sistema de funciones para guardar las puntuaciones y el nombre de los jugadores y tambien mostrar los mismos en un fichero.txt
 * ademas tenemos un sistema de marcadores que cada vez que se completa un nivel se le da una puntuación
 *
 *
 * @author Santiago Rubio Palou
 * @version 1.0
 * @since 25 de Diciembre de 2023
 */


//BIBLIOTECAS
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sistema_Puntuacion
{
    /**
     * Devuelve la puntuación asociada a la dificultad especificada.
     *
     * @param dificultad Nivel de dificultad del juego.
     * @return Puntuación correspondiente a la dificultad especificada.
     */
    
    public static int Marcador (int dificultad)
    {
        int puntuacion = 0;
        
        switch(dificultad)

        {

            case 1:

                puntuacion = Constantes.PUNTUACION_FACIL;

                break;

            case 2:
            
                puntuacion = Constantes.PUNTUACION_NORMAL;

                break;

            case 3:
                
                puntuacion = Constantes.PUNTUACION_DIFICIL;

                break;

            case 4:
                
                puntuacion = Constantes.PUNTUACION_INDIANA;

                break;

            default:

                break;
        }
        
        return puntuacion;
    }

    /**
     * Solicita al usuario que ingrese su nombre y lo guarda en un archivo.
     *
     * @return El nombre del jugador ingresado.
     * @throws IOException Se lanza si hay un problema al leer la entrada del jugador o escribir en el archivo.
     */

    public static String guardarNombre() throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Escribe tu Nombre ");
        String nombre = lector.readLine();

        try (BufferedWriter Escribir = new BufferedWriter(new FileWriter("puntuacion.txt",true)))
        {
            // Escribir nombre  en el archivo

            Escribir.write("Nombre Jugador: " + nombre + "\n");

        }

        // en caso de problema para la escritura del archivo entonces me indica donde esta el error

        catch (IOException error)
        {
            error.printStackTrace();
        }

        return nombre;
    }

    /**
     * Guarda la puntuación final en un archivo.
     *
     * @param opcionPrincipal La puntuación final a guardar.
     * @return La puntuación final.
     * @throws IOException Se lanza si hay un problema al escribir en el archivo.
     */

    public static int guardarPuntuacion (int opcionPrincipal) throws IOException
    {

        int  puntuacionFinal = opcionPrincipal;

        try (BufferedWriter Escribir = new BufferedWriter(new FileWriter("puntuacion.txt",true)))
        {
            // Escribir la puntuación en el archivo

            Escribir.write("Puntuación obtenida: " + puntuacionFinal + "\n");

        }

        // en caso de problema para la escritura del archivo entonces me indica donde esta el error

        catch (IOException error)
        {
            error.printStackTrace();
        }

        return puntuacionFinal;
    }

    /**
     * Muestra la puntuación total del jugador leyendo el contenido del archivo.
     *
     * @param nombreJugador El nombre del jugador.
     * @param puntuacion La puntuación total del jugador.
     * @throws IOException Se lanza si hay un problema al leer el archivo.
     */
    
    public static void mostrarPuntuacion(String nombreJugador, int  puntuacion) throws  IOException
    {
        try (BufferedReader lector = new BufferedReader(new FileReader("puntuacion.txt")))
        {
            // Leer y mostrar el contenido del archivo por consola
            String linea;

            while ((linea = lector.readLine()) != null)
            {
                System.out.println(linea);
            }

            System.out.println("Puntuación total de " + nombreJugador + ": " + puntuacion);
        }

        // en caso de problema para la escritura del archivo entonces me indica donde esta el error

        catch (IOException error)
        {
            error.printStackTrace();
        }
    }
}
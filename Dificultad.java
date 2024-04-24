

/**
 * DESCRIPCION.
 * Esta clase proporciona un método estático para que el jugador seleccione el nivel de dificultad
 * de su aventura. La dificultad determinará la configuración del juego.
 *
 * @author Santiago Rubio Palou
 * @version 1.0
 * @since 25 de Diciembre de 2023
 */


// BIBLIOTECAS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Dificultad
{

    /**
     * Método estático selectorDificultad
     * Permite al jugador seleccionar la dificultad de su aventura mediante un menú.
     *
     * @return El número correspondiente a la dificultad elegida (entre 1 y 5).
     * @throws IOException Excepción de entrada/salida.
     */

    public static int selectorDificultad () throws IOException // no dejo que recoja la excepciones
    {
        // declaracion de un objeto tipo bufferedReader para recoger la opcio que el jugador introduzca
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int selector;

        // Menu del acceso a la dificultad segun el jugador quiera que se repite siempre que el jugador no introduzca un numero entre 1 y 5
        do
        {
            System.out.println("\n\n\n");
            System.out.println("HOLA AVENTURERO/A ELIGE LA MAGNITUD DE TU AVENTURA ");
            System.out.println("\t1. FACIL");
            System.out.println("\t2. NORMAL");
            System.out.println("\t3. DIFICIL");
            System.out.println("\t4. EL VERDADERO INDIANA JONES");
            System.out.println("\t5. SALIR");
            
            // Lee la opción ingresada por el jugador.
            selector = Integer.parseInt(leer.readLine());

        }while((selector > 5 || selector < 1));

        return selector;    // devuelve la opcion elegida entre 1 y 5.
    }
}


/**
 * DESCRIPCION.
 * Juego de Indiana Jones, en este fichero se realizan las partes de reinicio del videojuego para que el jugador seleccione si quiere continuar o si no quiere continuar
 *
 *
 * @author Santiago Rubio Palou
 * @version 1.0
 * @since 25 de Diciembre de 2023
 */


 // BIBLIOTECAS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Reinicio
{
    /**
     * Determina si el jugador desea continuar jugando según la opción principal elegida.
     *
     * @param opcionPrincipal Opción principal elegida por el jugador.
     * @return true si el jugador tiene la voluntad de continuar jugando, false si decide no continuar.
     */

    public static boolean ContinuarJuego(int opcionPrincipal)
    {

        boolean voluntad = false;

        // Si la opción principal está entre 1 y 4 (inclusive), el jugador tiene la voluntad de continuar jugando

        if (opcionPrincipal >= 1 && opcionPrincipal <= 4)
            {
                voluntad = true;
            }

        // Si la opción principal es 5, el jugador decide no continuar jugando

        if (opcionPrincipal == 5)
            if(opcionPrincipal == 5)
            {
                voluntad = false;
            }

        return voluntad;
    }

    /**
     * Pregunta al jugador si desea volver a jugar y devuelve true si la respuesta es "YES", false si es cualquier otra cosa.
     *
     * @return true si el jugador desea volver a jugar, false si decide no continuar.
     * @throws IOException Se lanza si hay un problema al leer la entrada del jugador.
     */

    public static boolean salir() throws IOException
    {
        // PARTE DECLARATIVA

        boolean acabarVideojuego;
        String afirmar = "YES";
        String voluntadJugador;

        // Declaracion del metodo BufferedReader

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        // CUERPO DEL ALGORITMO
        // pregunta al jugador si quiere jugar o no

        System.out.println("¿ Desea volver a jugar ?");
        System.out.println("YES ------ NO");
        voluntadJugador = leer.readLine();


        // Compara la respuesta del jugador

        if(voluntadJugador.toUpperCase().equals(afirmar))
        {
            acabarVideojuego = true;
        }

        else
        {
            acabarVideojuego = false;
        }

        return acabarVideojuego;
    }
}

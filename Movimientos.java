

/**
 * Clase Movimientos
 *
 * Esta clase representa el movimiento del jugador en un tablero en busca de un tesoro,
 * evitando trampas que pueden disminuir sus vidas.
 *
 * @author Santiago Rubio palou
 * @since 25 de Diciembre de 2023
 * @version 1.0
 */


// BIBLIOTECAS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movimientos
{

    /**
     * Atributos de la clase Movimientos:
     *
     * - tablero: Representa el tablero de juego como una matriz de Strings.
     *            Cada posición contiene información sobre el estado en esa ubicación.
     *
     * - fila: Almacena la posición actual de la fila del jugador en el tablero.
     *
     * - columna: Almacena la posición actual de la columna del jugador en el tablero.
     *
     * - vidas: Representa el número de vidas del jugador. Inicializado con el valor
     *          definido en Constantes.VIDAS_JUGADOR. en este caso se inicializa con 4
     */

    private String[][] tablero;
    private int fila;
    private int columna;
    private int vidas = Constantes.VIDAS_JUGADOR;

    /**
     * Constructor de la clase Movimientos.
     * Inicializa el tablero y coloca al jugador en la posición inicial.
     *
     * @param tamTablero Tamaño del tablero cuadrado.
     */

    public Movimientos (int tamTablero)
    {
        tablero = new String[tamTablero][tamTablero];

        // Inicializar el tablero

        for (int i = 0; i < tamTablero; i++)
        {
            for (int j = 0; j < tamTablero; j++)
            {
                tablero[i][j] = "  ";
            }
        }

        // Posición inicial de la casilla de partida en cada nivel que es la casilla de abajo a la Izq

        fila = tamTablero - 1;
        columna = tamTablero - 1;
        tablero[fila][columna] = " I";

        tablero [0][0] = " T";
    }

    /**
     * Imprime el estado actual del tablero en la consola.
     */

    public void imprimirTablero()
    {
        for (int i = 0; i < tablero.length; i++)
        {
            for (int j = 0; j < tablero.length; j++)
            {
                System.out.print(tablero[i][j]);
            }

            System.out.println();
        }
    }

    /**
     * Realiza el movimiento del jugador en el tablero según la dirección proporcionada.
     * Verifica si se activan trampas o si se encuentra el tesoro.
     *
     * @param NivelConTrampas Tablero con la ubicación de las trampas y el tesoro.
     * @return true si el tesoro ha sido encontrado, false en caso contrario.
     * @throws IOException Excepción de entrada/salida.
     */

    public boolean mover(String [] [] NivelConTrampas) throws IOException
    {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        char direccion;

        do
        {
            System.out.println("Indique la direccion");
            direccion = lector.readLine().charAt(0);

            // Actualizar la posición de la casilla y comprueba que no se sale de los limites o se utilizan cosas distintas que las teclas "W, A, S, D"

            switch (direccion)
            {
                case 'w':

                    if (fila > 0)
                    {
                        fila--;
                    }

                    else
                    {
                        System.out.println("Indi eso es una pared, NO PUEDES CONTINUAR POR ALLI");
                    }

                    break;

                case 'a':

                    if (columna > 0)
                    {
                        columna--;
                    }

                    else
                    {
                        System.out.println("Indi eso es una pared, NO PUEDES CONTINUAR POR ALLI");
                    }

                    break;

                case 's':

                    if (fila < tablero.length - 1)
                    {
                        fila++;
                    }

                    else
                    {
                        System.out.println("Indi eso es una pared, NO PUEDES CONTINUAR POR ALLI");
                    }

                    break;

                case 'd':
                    if (columna < tablero[0].length - 1)
                    {
                        columna++;
                    }

                    else
                    {
                        System.out.println("Indi eso es una pared, NO PUEDES CONTINUAR POR ALLI");
                    }

                    break;
            }

            // Verificar si la casilla contiene una mina

            if (NivelConTrampas[fila][columna].equals(" X"))
            {
                System.out.println("Mucho Cuidado has activado una Trampa, puede que no te quede mas suerte ");

                Imprimir.calavera();
                
                vidas --;

                // Actualiza la casilla con trampa a una X para simbolizar que si volvemos a pasar por alli se activará y asi ayudar al jugador 

                tablero[fila][columna] = " X";

                if (vidas > 0)
                {
                    Imprimir.vidas(vidas);
                }

                else
                {
                    Imprimir.GameOver();
                }
            }

            else if((NivelConTrampas[fila][columna].equals(" T")))
            {
                Imprimir.TesoroEncontrado();

                return true;
            }

            else
            {
                Imprimir.vidas(vidas);

                // Actualizar el tablero si NO hemos pisado una mina

                tablero[fila][columna] = " I";
            }

            imprimirTablero();

        }while((!NivelConTrampas[fila][columna].equals(" T")) && vidas > 0);

        return false;
    }
}
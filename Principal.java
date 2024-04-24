

/**
 * DESCRIPCION.
 * Juego de Indiana Jones, en este fichero esta el main y las llamadas a todas las clases necesarias que estan modularizadas en el resto de archivos
 *
 *
 * @author Santiago Rubio Palou
 * @version 1.0
 * @since 25 de Diciembre de 2023
 */

 // BIBLIOTECA
import java.io.IOException;

// DECLARACION DE LA CLASE DONDE SE VA A REALIZAR TODAS LAS LLAMADAS Y LA PARTE PRINCIPAL EL TRONCO DEL JUEGO.
public class Principal
{

    // Declaración del método main con la gestión de excepciones de entrada/salida

    public static void main (String[] args) throws IOException
    {
        // PARTE DECLARATIVA

        int opcionPrincipal;  // Variable para almacenar la opción principal del jugador
        boolean voluntadJugador = true;  // Variable para controlar la voluntad del jugador de seguir jugando
        int puntuacionFinal = 0;  // Variable para almacenar la puntuación final del jugador
        String nombreJugador;  // Variable para almacenar el nombre del jugador
        int vidas = Constantes.VIDAS_JUGADOR;  // Variable para almacenar la cantidad de vidas del jugador y se inicializa en 4
        int tamNivel = 0;  // Variable para almacenar el tamaño del nivel
        boolean tesoroEncontrado;  // Variable para indicar si el jugador ha encontrado el tesoro
        String[][] nivelQueSeVaAJugar = null;  // Matriz para almacenar el nivel que se va a jugar
        boolean acabarVideojuego;  // Variable para indicar si se debe finalizar el videojuego

        // CUERPO DEL ALGORITMO

        // llamadas a las funciones que estan en la clase Imprimir
            Imprimir.Titulo_De_Inicio();
            Imprimir.Historia();
            Imprimir.Movimiento();

            // llamada a la funcion para guardar el nombre del jugador, grabarlo en el Fichero externo y Ademas guardar ese dato tipo String en una variable.

            nombreJugador = Sistema_Puntuacion.guardarNombre();


        // Estructura de control de repeticion tipo -DO WHILE- que se ejecutará siempre y cuando tengamos vidas y queramos jugar osea voluntadJugador == true
        do
        {
            /// Recoge la opción que quiere hacer el jugador dentro del menú de la clase Dificultad y la almacena en la variable de tipo int "opcionPrincipal"
            // Utilizará ese número para más acciones en el juego.

            opcionPrincipal = Dificultad.selectorDificultad();

            // recojo si quiere jugar o no el jugador segun la respuesta en el menu anterior, si esta entre 1 y 4 jugara una dificultad si marca 5 saldrá, ya que
            //   Reinicio.continuarjuego me devolverá un valor false

            voluntadJugador =   Reinicio.ContinuarJuego(opcionPrincipal);

            // me ejecuta el programa si es true

            if (voluntadJugador == true)
            {

                // Nivel Aleatorio

                nivelQueSeVaAJugar = Niveles.NivelSeleccionado(opcionPrincipal);

                tamNivel = nivelQueSeVaAJugar.length;

                Movimientos movimientos = new Movimientos(tamNivel);

                try
                {
                    movimientos.imprimirTablero();
                    tesoroEncontrado = movimientos.mover(nivelQueSeVaAJugar);
                    
                    // Si la opción principal es válida (entre 1 y 4) y se encuentra el tesoro, se actualiza la puntuación y se muestra el marcador.

                    if ((1<=opcionPrincipal) && (opcionPrincipal <5) && tesoroEncontrado == true)
                    {
                        puntuacionFinal = puntuacionFinal + Sistema_Puntuacion.Marcador(opcionPrincipal);
                        Imprimir.tituloMarcadores();
                        Sistema_Puntuacion.guardarPuntuacion(puntuacionFinal);
                        Sistema_Puntuacion.mostrarPuntuacion(nombreJugador, puntuacionFinal);
                    }
                }

                catch (IOException error)
                {
                    error.printStackTrace();
                }
            }

            // si el jugador desea salir entonces saldra y nos mostrara un cartel de despedida

            else
            {
                Sistema_Puntuacion.guardarPuntuacion(opcionPrincipal);
                Imprimir.Despedida();
            }

            // Verifica si el jugador desea continuar jugando
            
            acabarVideojuego = Reinicio.salir();

        }while ((vidas > 0) && (voluntadJugador) && (acabarVideojuego == true));
    }
}
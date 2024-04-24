

/**
 * DESCRIPCION.
 * Clase donde se elegira un nivel aleatorio dentro del nivel de dificultad que elija el jugador y ademas se devolvera ese nivel segun la dificultad seleccionada
 *
 *
 * @author Santiago Rubio Palou
 * @version 1.0
 * @since 25 de Diciembre de 2023
 */


// BIBLIOTECAS
import java.util.Random;


public class Niveles
{
    public static String[][] NivelSeleccionado(int opcionDificultad)
{
    // Inicializa la matriz de la mazmorra como nula.
    String[][] mazmorra = null;

    // Utiliza un switch para seleccionar el nivel de dificultad basado en la opción proporcionada.

    switch (opcionDificultad)
    {
        case 1:

            // Si la opción es 1, asigna la mazmorra generada para la dificultad fácil.

            mazmorra = DificultadFacil();

            break;

        case 2:

            // Si la opción es 2, asigna la mazmorra generada para la dificultad normal.

            mazmorra = Dificultadnormal();

            break;

        case 3:

            // Si la opción es 3, asigna la mazmorra generada para la dificultad difícil.

            mazmorra = DificultadDificil();

            break;

        case 4:

            // Si la opción es 4, asigna la mazmorra generada para la dificultad Indiana Jones.

            mazmorra = DificultadIndianaJones();

            break;

        default:

            // En caso de una opción no reconocida, no se realiza ninguna asignación.

            break;
    }

    // Devuelve la matriz de la mazmorra seleccionada según la dificultad.

    return mazmorra;
}


    public static String [][] DificultadFacil()
    {
        // Se inicializa la matriz de la mazmorra con valores predeterminados para crear el tablero
        String [] [] mazmorra =
            {
                {"","","",""},
                {"","","",""},
                {"","","",""},
                {"","","",""},
            };

        // Se genera un número aleatorio entre 1 y 10 para seleccionar un diseño de nivel aleatorio que son los niveles creados

        Random rd = new Random();
        int nivelAleatorio = rd.nextInt (10)+1;

         // Selecciona un diseño de nivel basado en el número aleatorio.

        switch (nivelAleatorio)
        {

            case 1:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X"},
                    {"  ","  ","  ","  "},
                    {" X"," X"," X","  "},
                    {" X"," X"," X","  "},
                };

                break;

            case 2:

                    mazmorra = new String[][]
                    {
                        {" T","  "," X"," X"},
                        {" X","  ","  "," X"},
                        {" X"," X","  "," X"},
                        {" X"," X","  ","  "},
                    };

                    break;

            case 3:

                mazmorra = new String[][]
                {
                    {" T","  ","  ","  "},
                    {" X"," X"," X","  "},
                    {" X"," X"," X","  "},
                    {" X"," X"," X","  "},
                };

                break;

            case 4:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X"},
                    {"  "," X"," X"," X"},
                    {"  "," X"," X","  "},
                    {"  ","  ","  ","  "},
                };

                break;
                    
            case 5:

                mazmorra = new String[][]
                {
                    {" T","  ","  "," X"},
                    {" X"," X","  ","  "},
                    {" X"," X"," X","  "},
                    {" X"," X"," X","  "},
                };

                break;

            case 6:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X"},
                    {"  ","  ","  ","  "},
                    {" X"," X"," X","  "},
                    {" X"," X"," X","  "},
                };

                break;

            case 7:

                mazmorra = new String[][]
                {
                    {" T","  "," X","  "},
                    {"  ","  "," X","  "},
                    {" X","  "," X","  "},
                    {" X","  "," X","  "},
                };

                break;

            case 8:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X"},
                    {"  ","  "," X","  "},
                    {" X","  "," X","  "},
                    {"  ","  ","  ","  "},
                };

                break;

            case 9:

                mazmorra = new String[][]
                {
                    {" T"," X"," X","  "},
                    {"  ","  ","  ","  "},
                    {" X"," X"," X","  "},
                    {" X"," X"," X","  "},
                };

                break;

            case 10:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X"},
                    {"  ","  ","  ","  "},
                    {" X"," X","  ","  "},
                    {" X"," X"," X","  "},
                };

                break;
                    
        }

        // Devuelve la matriz de la mazmorra.
        return mazmorra;
    }


    public static String [][] Dificultadnormal()
    {
        String [] [] mazmorra =
            {
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""}
            };

        Random rd = new Random();
        int nivelAleatorio = rd.nextInt (10)+1;

        switch (nivelAleatorio)
        {
            case 1:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  ","  "},
                    {"  "," X","  "," X","  "},
                    {"  "," X","  "," X","  "},
                    {"  "," X","  "," X","  "},
                    {"  ","  ","  "," X","  "}
                };
                
                break;

            case 2:

                mazmorra = new String[][]
                {
                    {" T","  ","  ","  "," X"},
                    {"  "," X"," X","  ","  "},
                    {" X"," X"," X"," X","  "},
                    {" X"," X"," X"," X","  "},
                    {" X"," X"," X"," X","  "}
                };

                break;

            case 3:

                mazmorra = new String[][]
                {
                    {" T","  ","  ","  ","  "},
                    {"  "," X"," X"," X","  "},
                    {"  "," X"," X"," X","  "},
                    {"  "," X"," X"," X","  "},
                    {"  ","  ","  ","  ","  "}
                };

                break;

            case 4:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  ","  "},
                    {"  "," X","  "," X","  "},
                    {"  ","  ","  "," X","  "},
                    {" X","  ","  ","  ","  "},
                    {" X"," X"," X"," X","  "}
                };

                break;
                    
            case 5:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  "," X"},
                    {"  "," X"," X","  "," X"},
                    {"  "," X"," X","  "," X"},
                    {"  ","  "," X","  "," X"},
                    {" X"," X"," X","  ","  "}
                };

                break;

            case 6:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  ","  "},
                    {"  "," X","  ","  "," X"},
                    {"  ","  ","  "," X"," X"},
                    {"  "," X","  ","  ","  "},
                    {"  "," X","  "," X","  "}
                };

                break;

            case 7:

                mazmorra = new String[][]
                {
                    {" T","  ","  "," X","  "},
                    {"  "," X","  ","  ","  "},
                    {"  ","  ","  "," X","  "},
                    {"  "," X","  ","  ","  "},
                    {" X","  ","  "," X","  "}
                };

                break;

            case 8:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  "," X"},
                    {"  "," X","  "," X","  "},
                    {" X","  ","  "," X","  "},
                    {"  "," X"," X"," X","  "},
                    {"  ","  ","  "," X","  "}
                };

                break;

            case 9:

                mazmorra = new String[][]
                {
                    {" T"," X"," X","  "," X"},
                    {"  ","  ","  "," X","  "},
                    {" X","  "," X"," X","  "},
                    {"  "," X"," X"," X","  "},
                    {"  "," X","  "," X","  "}
                };

                break;

            case 10:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  "," X"},
                    {"  "," X"," X"," X","  "},
                    {" X","  ","  ","  ","  "},
                    {"  "," X"," X"," X","  "},
                    {"  "," X","  "," X","  "}
                };

                break;
        }

        return mazmorra;
    }


    public static String [][]  DificultadDificil ()
    {
        String [] [] mazmorra =
            {
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""},
                {"","","","","",""}
            };

        Random rd = new Random();
        int nivelAleatorio = rd.nextInt (10)+1;

        switch (nivelAleatorio)
        {
            case 1:

                mazmorra = new String[][]
                {
                    {" T","  "," X","  ","  ","  "},
                    {"  "," X","  "," X","  "," X"},
                    {"  ","  "," X"," X","  "," X"},
                    {" X","  ","  "," X"," X","  "},
                    {" X"," X"," X","  ","  "," X"},
                    {" X","  ","  "," X","  ","  "}
                };

                    break;

            case 2:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  "," X","  "},
                    {"  ","  ","  ","  "," X"," X"},
                    {" X"," X","  ","  ","  ","  "},
                    {" X","  ","  "," X","  ","  "},
                    {" X","  ","  "," X"," X","  "},
                    {" X","  "," X"," X","  ","  "}
                };

                    break;

            case 3:

                mazmorra = new String[][]
                {
                    {" T"," X"," X","  ","  ","  "},
                    {"  ","  ","  ","  "," X"," X"},
                    {"  "," X","  ","  ","  "," X"},
                    {"  "," X","  "," X"," X","  "},
                    {" X","  "," X","  ","  ","  "},
                    {" X"," X","  "," X","  ","  "}
                };

                    break;

            case 4:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X","  "," X"},
                    {"  "," X","  ","  "," X"," X"},
                    {"  ","  "," X","  ","  "," X"},
                    {" X","  ","  "," X"," X","  "},
                    {" X"," X","  ","  ","  "," X"},
                    {" X","  "," X"," X","  ","  "}
                };

                    break;

            case 5:

                mazmorra = new String[][]
                {
                    {" T","  ","  "," X","  "," X"},
                    {" X","  "," X"," X"," X","  "},
                    {" X","  "," X","  "," X"," X"},
                    {" X","  "," X"," X","  "," X"},
                    {" X","  ","  ","  ","  "," X"},
                    {" X","  "," X"," X"," X","  "}
                };

                    break;


            case 6:

                mazmorra = new String[][]
                {
                    {" T","  ","  "," X","  "," X"},
                    {" X","  ","  "," X"," X","  "},
                    {" X"," X","  ","  "," X"," X"},
                    {" X","  ","  ","  "," X","  "},
                    {" X"," X"," X","  ","  ","  "},
                    {" X","  "," X","  "," X","  "}
                };

                    break;


            case 7:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X","  "," X"},
                    {"  "," X","  "," X"," X","  "},
                    {"  ","  "," X","  "," X"," X"},
                    {" X","  ","  ","  "," X","  "},
                    {" X"," X","  ","  ","  ","  "},
                    {" X","  "," X"," X"," X","  "}
                };

                    break;


            case 8:

                mazmorra = new String[][]
                {
                    {" T"," X","  "," X"," X"," X"},
                    {"  "," X","  "," X"," X","  "},
                    {"  ","  ","  ","  ","  ","  "},
                    {" X"," X","  "," X"," X","  "},
                    {" X","  "," X"," X"," X","  "},
                    {" X"," X"," X","  "," X","  "}
                };

                    break;


            case 9:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  ","  ","  "},
                    {"  "," X","  "," X","  ","  "},
                    {"  "," X","  "," x","  "," X"},
                    {"  ","  ","  "," X","  "," X"},
                    {" X"," X"," X"," X","  ","  "},
                    {" X","  "," X"," X"," X","  "}
                };

                    break;


            case 10:

                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X"," X"," X"},
                    {"  ","  ","  ","  ","  "," X"},
                    {" X"," X"," X"," X","  "," X"},
                    {" X","  "," X","  ","  ","  "},
                    {" X","  ","  ","  "," X","  "},
                    {" X","  "," X"," X"," X","  "}
                };

                    break;
        }

        return mazmorra;
    }


    public static String [][] DificultadIndianaJones ()
    {

        String [] [] mazmorra =
            {
                {"","","","","","",""},
                {"","","","","","",""},
                {"","","","","","",""},
                {"","","","","","",""},
                {"","","","","","",""},
                {"","","","","","",""},
                {"","","","","","",""}
            };

        Random rd = new Random();
        int nivelAleatorio = rd.nextInt (10)+1;

        switch (nivelAleatorio)
        {
            case 1:

                mazmorra = new String[][]
                {
                    {" T"," X","  ","  ","  ","  ","  "},
                    {"  ","  ","  "," X"," X","  "," X"},
                    {" X"," X","  ","  "," X","  "," X"},
                    {" X","  "," X","  "," X","  "," X"},
                    {"  ","  "," X"," X","  ","  "," X"},
                    {" X","  ","  "," X","  ","  "," X"},
                    {" X"," X","  "," X"," X","  ","  "}
                };
                
                break;

            case 2:

                mazmorra = new String[][]
                {
                    {" T","  ","  ","  ","  ","  "," X"},
                    {"  "," X"," X","  ","  "," X"," X"},
                    {"  ","  ","  ","  "," X"," X"," X"},
                    {" X"," X"," X","  "," X","  ","  "},
                    {" X","  "," X","  ","  "," X"," X"},
                    {" X","  "," X"," X","  ","  ","  "},
                    {" X"," X","  ","  "," X"," X","  "}
                };

                    break;

            case 3:
            
                mazmorra = new String[][]
                {
                    {" T","  "," X","  "," X","  "," X"},
                    {" X","  "," X"," X"," X"," X","  "},
                    {"  ","  ","  "," X"," X"," X"," X"},
                    {"  ","  "," X","  "," X"," X"," X"},
                    {" X","  "," X"," X","  ","  ","  "},
                    {"  ","  ","  ","  ","  ","  "," X"},
                    {" X"," X","  "," X"," X","  ","  "}
                };
                
                break;

            case 4:
            
                mazmorra = new String[][]
                {
                    {" T","  ","  ","  ","  ","  ","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  ","  ","  ","  ","  ","  ","  "}
                };
                
                break;

            case 5:
            
                mazmorra = new String[][]
                {
                    {" T","  ","  ","  ","  ","  ","  "},
                    {"  "," X","  "," X"," X"," X","  "},
                    {"  "," X","  "," X"," X"," X","  "},
                    {"  "," X","  "," X"," X"," X","  "},
                    {"  "," X","  "," X","  "," X","  "},
                    {"  "," X","  "," X","  "," X","  "},
                    {"  ","  ","  ","  ","  ","  ","  "}
                };
                
                break;

            case 6:
            
                mazmorra = new String[][]
                {
                    {" T"," X"," X"," X"," X"," X","  "},
                    {"  ","  ","  ","  ","  ","  ","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  ","  ","  ","  ","  ","  ","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  ","  ","  ","  ","  ","  ","  "},
                    {"  "," X"," X"," X"," X"," X","  "}
                };
                
                break;

            case 7:
            
                mazmorra = new String[][]
                {
                    {" T","  ","  "," X","  ","  ","  "},
                    {"  "," X","  "," X","  "," X","  "},
                    {"  "," X","  "," X","  "," X","  "},
                    {"  "," X","  "," X","  "," X","  "},
                    {"  "," X","  "," X","  "," X","  "},
                    {"  "," X","  "," X","  "," X","  "},
                    {"  "," X","  ","  ","  "," X","  "}
                };
                
                break;

            case 8:
            
                mazmorra = new String[][]
                {
                    {" T","  "," X","  ","  ","  "," X"},
                    {"  ","  "," X","  "," X","  "," X"},
                    {"  ","  "," X","  "," X","  "," X"},
                    {"  ","  "," X","  "," X","  "," X"},
                    {"  ","  "," X","  "," X","  "," X"},
                    {"  ","  "," X","  "," X","  "," X"},
                    {"  ","  ","  ","  "," X","  ","  "}
                };
                
                break;

            case 9:
            
                mazmorra = new String[][]
                {
                    {" T","  ","  ","  ","  ","  "," X"},
                    {"  "," X"," X","  ","  ","  "," X"},
                    {"  ","  "," X"," X","  ","  "," X"},
                    {" X","  ","  "," X"," X","  ","  "},
                    {" X"," X","  ","  "," X"," X","  "},
                    {" X"," X"," X","  ","  "," X","  "},
                    {" X"," X"," X"," X","  ","  ","  "}
                };
                
                break;

            case 10:
            
                mazmorra = new String[][]
                {
                    {" T","  ","  "," X","  ","  ","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  ","  ","  "," X","  ","  ","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  ","  ","  "," X","  ","  ","  "},
                    {"  "," X"," X"," X"," X"," X","  "},
                    {"  ","  ","  "," X","  ","  ","  "}
                };
                
                break;
        }

        return mazmorra;
    }
}
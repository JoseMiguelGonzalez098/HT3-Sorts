/******************************************************************

@author Jose Miguel Gonzalez
main/controlador
******************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class main{
    /**
    *Este es el lugar desde donde se ejecutara todo el programa.
    *
    */
    public static void main(String [] args){

        editarTxts editar = new editarTxts();
        int opcion = 0;
        int op = 0;
        Scanner scan = new Scanner(System.in);
        sort sort = new sort();
        String dirrecion = "C:\\Users\\josem\\OneDrive\\Escritorio\\UVG tercer semestre\\Estrcutura de datos\\trabajos\\Sort\\Nuevo.txt";
        sort s = new sort();
        s.dirrecion = dirrecion;

        Integer[] lista = new Integer[3001];

        while (opcion != 7) {
            

            lista = editar.decode(dirrecion);
            
            System.out.println("\n\n-----------.M.E.N.U.-----------");
            System.out.println("1. Crear un archivo con 3000 numeros generados de forma aleatoria");//SI JALA
            System.out.println("2. BubbleSort");//SI JALA
            System.out.println("3. QuickSort");//SI JALA
            System.out.println("4. MergeSort");//NO SE SI JALA
            System.out.println("5. RadixSort");//NO SE SI JALA
            System.out.println("6. GnomeSort");//SI JALA
            System.out.println("7. Salir\n\n");//NO SE SI JALA
            
            opcion = op;
            int respuesta;
            while (true){ //Se repite hasta que se logre el return
                
                try{ 
                    respuesta = Integer.parseInt(scan.next());
                    if(respuesta > 0 && respuesta < 8){
                        op = respuesta; //Devuelve la selección del usuario

                        if (op == 1) {//AQUI SE HACE UN NUEVO ARCHIVO CON LOS NUMEROS ALEATORIOS
                
                            editar.Escribir(dirrecion);
                            
                        } else if(op == 2){//AQUI SE HACE CON BUBBLESORT

                            //lista = sort.bubble(lista);
                            sort.bubble(lista, dirrecion);
                            editar.SobreEscribir(lista, dirrecion);
                            lista = editar.decode(dirrecion);
                            
                        } else if(op == 3){//AQUI SE HACE CON QUICKSORT

                            sort.quick(lista, 1, lista.length);
                            editar.SobreEscribir(lista, dirrecion);
                            lista = editar.decode(dirrecion);
                            
                        } else if(op == 4){//AQUI SE HACE CON MERGESORT
                            
                        } else if(op == 5){//AQUI SE HACE CON RADIXSORT
                            
                        } else if(op == 6){//AQUI SE HACE CON GNOMESORT

                            sort.gnome(lista, lista.length);
                            editar.SobreEscribir(lista, dirrecion);
                            lista = editar.decode(dirrecion);
            
                        } else if(op == 7){
            
                            System.out.println("Adios UwU");
                            opcion = 7;
                            
                        }
                    } else{
                        throw new NumberFormatException();
                    }

                } catch (NumberFormatException e) {
                    System.out.println("\nERROR: La opción ingresada no es válida, ingrese un número en el rango de opciones");
                }
                
            
            }
        }
    }
}
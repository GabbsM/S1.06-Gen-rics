package Exercici_01;
/*
Creu una classe contenidora que emmagatzemi tres objectes del mateix tipus, juntament amb
els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per a inicialitzar els tres.
 */

// Creamos una clase genérica y un constructor que inicia las instancias que vayamos a crear con una variable
// genérica inicializada como nula.

public class  Clase_contenedor <T> {
    private T nombre;
    public Clase_contenedor(){
        nombre = null;

    }

    //Método set donde daremos el valor por parámetro a la variable nula.
    public void setNombre (T nuevoValor){
        nombre = nuevoValor;
    }

    //Método get que mostrará esa variable ya con el valor que le hayamos dado en setNombre
    public T getNombre(){
        return nombre;
    }

    public static void main(String[] args) {

        //Creamos 3 objetos de la Clase_Contenedor y  de tipo String
        Clase_contenedor<String> persona1 = new Clase_contenedor<>();
        Clase_contenedor<String> persona2 = new Clase_contenedor<>();
        Clase_contenedor<String> persona3 = new Clase_contenedor<>();

        //Llamamos al método set para darle valor a las variables:
        persona1.setNombre("Gabriel");
        persona2.setNombre("Raquel");
        persona3.setNombre("Blasa");

        //Llamamos al método get para imprimir los valores.
        System.out.println(persona1.getNombre());
        System.out.println(persona2.getNombre());
        System.out.println(persona3.getNombre());

    }
}

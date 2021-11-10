package Exercici_04;
/*
Modifiqui al seu torn el punt anterior de manera que els arguments que rep 'f()' sigui una llista
 d'arguments variable indefinida.
 */

public class GenericMethods3 {

    public static void main(String[] args) {

        //Construimos array de tipo String
        String[] nombres = {"Gerard","Laura","Jordi","Sandra"};

        System.out.println(Matriz.f(nombres));


    }


}

class Matriz{

    //Construimos método que recibe por parámetro una lista de tipo T.
    public static <T> String f(T[]a){
        return "El array tiene " + a.length + " elementos";
    }
}
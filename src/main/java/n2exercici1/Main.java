package n2exercici1;

import n1exercici2.GenericMethods;
import n1exercici2.Persona;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Juan","Perez", (byte) 23);
        Persona per2 = new Persona("Pedro", "Rodríguez", (byte) 42);

        //GenericMethods2.printArgs(per1.getAge(), per2.getName(),42); al hacer un parametro no generico si introducimos un valor que no concuerde da error.

        GenericMethods2.printArgs(per1.getAge(), per2.getName(),per2.getSurname());
    }
}

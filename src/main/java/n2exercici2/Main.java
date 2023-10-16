package n2exercici2;

import n1exercici2.Persona;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Juan","Perez", (byte) 23);
        Persona per2 = new Persona("Pedro", "Rodríguez", (byte) 42);

        GenericMethods3.printArgs("Hola", per2.getName(),per1,53);
    }
}

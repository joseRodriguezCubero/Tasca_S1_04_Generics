package n1exercici2;

import n3exercici1.GenericClass;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Juan","Perez", (byte) 23);
        Persona per2 = new Persona("Pedro", "Rodríguez", (byte) 42);

        GenericMethods.printArgs(per1.getAge(), per2.getName(),per1);

        GenericMethods.printArgs(per2.getSurname(),per1.getName(),per1.getAge());

        GenericMethods.printArgs(per2.getAge(),per1.getAge(),per2.getSurname());

        GenericMethods.printArgs(per1.getName(),per2.getName(),per1.getSurname());

    }
}

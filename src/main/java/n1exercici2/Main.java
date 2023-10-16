package n1exercici2;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Juan","Perez", (byte) 23);
        Persona per2 = new Persona("Pedro", "Rodríguez", (byte) 42);

        GenericMethods.printArgs(per1.getAge(), per2.getName(),per1);

    }
}

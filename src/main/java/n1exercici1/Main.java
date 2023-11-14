package n1exercici1;

public class Main {
    public static void main(String[] args) {

        String object1 = "Saul";
        String object2 = "Goodman";
        String object3 = "It's all good, man";

        NoGenericMethods better = new NoGenericMethods(object1,object2,object3);
        NoGenericMethods call = new NoGenericMethods(object3,object2,object1);
        NoGenericMethods saul = new NoGenericMethods(object2,object1,object3);

        System.out.println(better);
        System.out.println(call);
        System.out.println(saul);
    }
}

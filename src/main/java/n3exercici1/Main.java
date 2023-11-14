package n3exercici1;

public class Main {
    public static void main(String[] args) {

        Smartphone telf1 = new Smartphone();

        telf1.call();
        telf1.takePictures();

        GenericClass nokia = new GenericClass();
        nokia.genMethod1(telf1);
        nokia.genMethod2(telf1);

        System.out.println("No, porque no extiende de smartphone, solo implementa teléfono. \n Al igual que los teléfonos que ya no existen. \n Los smartphones nos recuerdan que en parte son teléfonos.");

    }
}

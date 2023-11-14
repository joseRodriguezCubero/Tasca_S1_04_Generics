package n3exercici1;

public class Smartphone implements Telephone{

        @Override
        public void call() {
            System.out.println("Ring, ring...");
        }

        public void takePictures(){
            System.out.println("Di patatata..");
        }
    }


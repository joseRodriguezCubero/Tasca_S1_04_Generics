package n3exercici1;

public class GenericClass {
        public <T extends Telephone> void genMethod1(T telephone){
            telephone.call();
        }
        public <T extends Smartphone> void genMethod2(T smartphone){
            smartphone.call();
            smartphone.takePictures();
        }

}



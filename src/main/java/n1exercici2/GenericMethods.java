package n1exercici2;

public class GenericMethods {

    public static <T> void printArgs(T arg1,T arg2,T arg3){

        System.out.print(arg1+" ");
        System.out.print(arg2+" ");
        System.out.print(arg3);
    }
}

package n2exercici1;

public class GenericMethods2 {

    public static <T> void printArgs(T arg1,T arg2,String arg3){

        System.out.print(arg1+" ");
        System.out.print(arg2+" ");
        System.out.print(arg3);
    }
}

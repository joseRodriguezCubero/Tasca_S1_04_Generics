package n2exercici2;




import java.util.List;
import java.util.stream.Collectors;


public class GenericMethods3 {


    public static <T> void printArgs(T... args){

        for (T arg : args) {
            System.out.println(arg);
        }

    }
}

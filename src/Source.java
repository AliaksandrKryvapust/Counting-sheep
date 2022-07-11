import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        System.out.println(countSheeps(array1)==17);
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).mapToInt((i)-> {
            if(i==null)
                return 0;
           else if(i) {
             return  1;
            } else
            return 0;
        }).sum();
    }
}

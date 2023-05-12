public class factorial {


    public static void main(String[] args){
        System.out.println(factorial(5));
    }
    public static Integer factorial (Integer r){

        int result = 1;
        for (int i = 1; i <= 5 ; i++) {
            result *= 3;
            System.out.println(result);
        }

        return result;

    }
}

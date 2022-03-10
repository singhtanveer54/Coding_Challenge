public class FibonacciSequence {


    public static int evenNumbers(int limit){
        if(limit<2) return 0;

        long evenNumber1 = 0;
        long evenNumber2 = 2;
        long sum = evenNumber1+evenNumber2;

        while(evenNumber2 <= limit){

            long ef3 = 4 * evenNumber2 + evenNumber1;

            if(ef3>limit)
                break;

            evenNumber1 = evenNumber2;
            evenNumber2 = ef3;
            sum += evenNumber2;
        }


        return (int) sum;
    }
    public static void main(String[] args){

        int limit = 400;
        System.out.println(evenNumbers(limit));


    }
}

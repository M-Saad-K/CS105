import java.util.ArrayList;

public class Main {

        int a = 1;
        char c = 'b';
        int result = 0;

        public Main(){
            ;
        }

        public void q15(){


            if ( ( a >= 1) && ( c > 'a') ) {
                result = result + 1; }
            else if ( ( a >= 1) || (c > 'a') ) {
                result = result + 2;}
            else {
                result = result + 3; }

            System.out.println(result);
        }

        public void q18(){

            ArrayList<Integer> numbers = new ArrayList< >( );
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);
            numbers.remove(2);
            int total = 0;
            for (int i : numbers) {
                total = total + i;
            }

            System.out.println(total);
        }

}

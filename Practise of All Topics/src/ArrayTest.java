import java.util.Iterator;
import java.util.Arrays;

public class ArrayTest {

    private Integer[] howmanyeggs = {3, 4, 6, 8};

    public ArrayTest() {

        howmanyeggs = new Integer[] { 3, 4, 6, 8 };
    }

    public void getHowmany() {

        System.out.println(howmanyeggs.length);
    }

    public void getValue(int index){

        System.out.println(howmanyeggs[index]);
    }

    public void getMultiplesOfTwo(){
        int mul2 = 0;
        int mulNot2 = 0;

        int[] eveNum = new int[] {2, 4, 3, 8};

        for (int i = 0; i < howmanyeggs.length; i++) {
            if ((howmanyeggs[i])/2 == eveNum[0] || howmanyeggs[i]/2 == eveNum[1] || howmanyeggs[i]/2 == eveNum[2] || howmanyeggs[i]/2 == eveNum[3]) {
                mul2 += 1;
            } else {
                mulNot2 += 1;
            }
        }

        System.out.println("Multiples of two: " + mul2);
        System.out.println("Not multiples of two: " + mulNot2);


    }

    public void printAll(){

        int index = 0;
        while(index < howmanyeggs.length){
            System.out.println(howmanyeggs[index]);
            index++;
        }
    }

    public void searchfor(int search){

        Iterator<Integer> searcher = Arrays.asList(howmanyeggs).iterator();
        int index = -1;
        while(searcher.hasNext()){
            if(searcher.next() == search){
                index += 1;
                System.out.println("Found " + searcher.next() + " its at" + index);
            } else {
                index += 1;
            }
        }
        
    }
}
